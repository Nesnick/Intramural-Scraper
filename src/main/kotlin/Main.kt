import com.github.kittinunf.fuel.core.FuelManager
import com.github.kittinunf.fuel.core.isSuccessful
import com.github.kittinunf.fuel.httpGet
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
    val groupJson = """
        {
        "name": "Test",
        "player_identification": "by-id",
        "team_identification": "by-distinct-players"
        }
    """.trimIndent()
    //val (request, response, result) = "https://ballchasing.com/api/groups".httpPost().body(groupJson).response();
    //print(response)


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