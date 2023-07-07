import com.github.kittinunf.fuel.Fuel
import com.github.kittinunf.fuel.core.*
import com.github.kittinunf.fuel.httpGet
import com.github.kittinunf.fuel.gson.responseObject
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import templates.Root
import java.io.File
import java.io.FileInputStream
import java.nio.file.Paths
import java.util.Properties


fun main(args : Array<String>) {
    val path = Paths.get(if(args.isEmpty()){
        System.getProperty("user.dir")
    } else {
        args[0]
    })
    val props = Properties()
    props.load(FileInputStream("app.properties"))
    FuelManager.instance.baseHeaders = mapOf("Authorization" to props.getProperty("token"))
    /* ill use this later
    if (Files.isDirectory(path)) {
        val list = path.listDirectoryEntries()
        for (series in list) {

        }
    } else {
        print("Please enter a valid parent directory.")
        return
    }
    /
     */

    //Ping ballchasing
    val ping : Boolean = pingBallchasing()
    if (!ping)
        return

    //create a group
    val createGroupJson = """
        {
        "name": "Test",
        "player_identification": "by-id",
        "team_identification": "by-distinct-players"
        }
    """.trimIndent()
    val createGroupReturn = Fuel.post( "https://ballchasing.com/api/groups").body(createGroupJson).response()

    //get a group id by name

    val getGroupIdReturn = Fuel.get("https://ballchasing.com/api/groups").header(mapOf("name" to "Test")).response{ request, response, result ->
        val typeToken = object : TypeToken<Root>(){}.type
        println(response.body().asString(response.headers[Headers.CONTENT_TYPE].lastOrNull()))
        val req = Gson().fromJson<Root>(response.body().asString(response.headers[Headers.CONTENT_TYPE].lastOrNull()), typeToken)

    }
    getGroupIdReturn.join()


    //upload a replay
    val file = FileDataPart(File("C:\\Users\\Spencer\\Documents\\git\\Intramural-Scraper\\replay.replay"), name = "file")

    val uploadReplay = Fuel.upload("https://ballchasing.com/api/v2/upload", method = Method.POST).add(file)
        .response{ request, response, result ->
            println(request)
            println(response)
        }
    uploadReplay.join()


}



fun pingBallchasing() : Boolean {
    val (_, response, _) = "https://ballchasing.com/api/".httpGet().response()
    return if (!response.isSuccessful) {
        println("Ping to ballchasing not successful.")
        println(response.statusCode)
        false
    } else {
        println("Ping to ballchasing successful! Continuing.")
        true
    }
}