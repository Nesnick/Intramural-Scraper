package templates

import com.google.gson.annotations.SerializedName

data class Movement (

    @SerializedName("avg_speed"                ) var avgSpeed               : Double? = null,
    @SerializedName("total_distance"           ) var totalDistance          : Int?    = null,
    @SerializedName("time_supersonic_speed"    ) var timeSupersonicSpeed    : Double? = null,
    @SerializedName("time_boost_speed"         ) var timeBoostSpeed         : Double? = null,
    @SerializedName("time_slow_speed"          ) var timeSlowSpeed          : Double? = null,
    @SerializedName("time_ground"              ) var timeGround             : Double? = null,
    @SerializedName("time_low_air"             ) var timeLowAir             : Double? = null,
    @SerializedName("time_high_air"            ) var timeHighAir            : Double? = null,
    @SerializedName("time_powerslide"          ) var timePowerslide         : Double? = null,
    @SerializedName("count_powerslide"         ) var countPowerslide        : Int?    = null,
    @SerializedName("avg_powerslide_duration"  ) var avgPowerslideDuration  : Double? = null,
    @SerializedName("avg_speed_percentage"     ) var avgSpeedPercentage     : Double? = null,
    @SerializedName("percent_slow_speed"       ) var percentSlowSpeed       : Double? = null,
    @SerializedName("percent_boost_speed"      ) var percentBoostSpeed      : Double? = null,
    @SerializedName("percent_supersonic_speed" ) var percentSupersonicSpeed : Double? = null,
    @SerializedName("percent_ground"           ) var percentGround          : Double? = null,
    @SerializedName("percent_low_air"          ) var percentLowAir          : Double? = null,
    @SerializedName("percent_high_air"         ) var percentHighAir         : Double? = null

)