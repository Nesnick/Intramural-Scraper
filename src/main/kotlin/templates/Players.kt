package templates

import com.google.gson.annotations.SerializedName

data class Players (

    @SerializedName("platform"     ) var platform    : String?      = null,
    @SerializedName("id"           ) var id          : String?      = null,
    @SerializedName("name"         ) var name        : String?      = null,
    @SerializedName("team"         ) var team        : String?      = null,
    @SerializedName("cumulative"   ) var cumulative  : Cumulative?  = Cumulative(),
    @SerializedName("game_average" ) var gameAverage : GameAverage? = GameAverage()

)
