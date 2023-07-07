package templates

import Players
import com.google.gson.annotations.SerializedName

data class Teams (

    @SerializedName("name"         ) var name        : String?            = null,
    @SerializedName("players"      ) var players     : ArrayList<Players> = arrayListOf(),
    @SerializedName("cumulative"   ) var cumulative  : Cumulative?        = Cumulative(),
    @SerializedName("game_average" ) var gameAverage : GameAverage?       = GameAverage()

)