import com.google.gson.annotations.SerializedName

data class Core (

    @SerializedName("shots"               ) var shots              : Int?    = null,
    @SerializedName("shots_against"       ) var shotsAgainst       : Int?    = null,
    @SerializedName("goals"               ) var goals              : Int?    = null,
    @SerializedName("goals_against"       ) var goalsAgainst       : Int?    = null,
    @SerializedName("saves"               ) var saves              : Int?    = null,
    @SerializedName("assists"             ) var assists            : Int?    = null,
    @SerializedName("score"               ) var score              : Int?    = null,
    @SerializedName("mvp"                 ) var mvp                : Int?    = null,
    @SerializedName("shooting_percentage" ) var shootingPercentage : Double? = null

)