import com.github.kittinunf.fuel.Fuel
import com.github.kittinunf.fuel.core.*
import com.github.kittinunf.fuel.httpGet
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import templates.ReplayGroup
import templates.RootGroup
import java.io.File
import java.io.FileInputStream
import java.nio.file.Paths
import java.util.Properties


fun main(args : Array<String>) {
    val path = Paths.get(
        if (args.isEmpty()) {
            System.getProperty("user.dir")
        } else {
            args[0]
        }
    )
    val props = Properties()
    props.load(FileInputStream("app.properties"))
    FuelManager.instance.baseHeaders = mapOf("Authorization" to props.getProperty("token"))

    //Ping ballchasing
    when (pingBallchasing()) {
        200 -> println("Ping successful. Continuing.")
        401 -> {
            println("Ping resulted in API Key error. Exiting.")
            return
        }

        500 -> {
            println("Ping resulted in ballchasing error. Exiting.")
            return
        }
    }


}

fun pingBallchasing() : Int {
    val (_, response, _) = "https://ballchasing.com/api/".httpGet().response()
    return response.statusCode
}

fun uploadReplay(pathname: String) : Int {
    val file = FileDataPart(File(pathname), name = "file")
    var statusCode = 0
    val uploadReplay = Fuel.upload("https://ballchasing.com/api/v2/upload", method = Method.POST).add(file)
        .response{ request, response, result ->
            statusCode = response.statusCode
        }
    uploadReplay.join()
    return statusCode
}

fun createGroup(groupName : String) {
    val createGroupJson = """
        {
        "name": $groupName,
        "player_identification": "by-id",
        "team_identification": "by-distinct-players"
        }
    """.trimIndent()
    val createGroupReturn = Fuel.post( "https://ballchasing.com/api/groups").body(createGroupJson).response()
}

fun searchForGroup(): String? {

    var groupSearch : RootGroup = RootGroup()
    //get a group id by name
    val getGroupIdReturn = Fuel.get("https://ballchasing.com/api/groups?name=Test&creator=me").response{ request, response, result ->
        val typeToken = object : TypeToken<RootGroup>(){}.type
        //println(response.body().asString(response.headers[Headers.CONTENT_TYPE].lastOrNull()))
        groupSearch = Gson().fromJson<RootGroup>(response.body().asString(response.headers[Headers.CONTENT_TYPE].lastOrNull()), typeToken)
    }
    getGroupIdReturn.join()
    if (groupSearch.list.size > 1 || groupSearch.list.size == 0) {
        return null
    }

    for (group in groupSearch.list) {
        return group.id
    }
    return null
}
