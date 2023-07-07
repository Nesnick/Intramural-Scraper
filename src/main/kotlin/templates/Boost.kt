package templates

import com.google.gson.annotations.SerializedName

data class Boost (

    @SerializedName("bpm"                          ) var bpm                       : Double? = null,
    @SerializedName("bcpm"                         ) var bcpm                      : Double? = null,
    @SerializedName("avg_amount"                   ) var avgAmount                 : Double? = null,
    @SerializedName("amount_collected"             ) var amountCollected           : Double? = null,
    @SerializedName("amount_stolen"                ) var amountStolen              : Int?    = null,
    @SerializedName("amount_collected_big"         ) var amountCollectedBig        : Double? = null,
    @SerializedName("amount_stolen_big"            ) var amountStolenBig           : Double? = null,
    @SerializedName("amount_collected_small"       ) var amountCollectedSmall      : Int?    = null,
    @SerializedName("amount_stolen_small"          ) var amountStolenSmall         : Double? = null,
    @SerializedName("count_collected_big"          ) var countCollectedBig         : Double? = null,
    @SerializedName("count_stolen_big"             ) var countStolenBig            : Int?    = null,
    @SerializedName("count_collected_small"        ) var countCollectedSmall       : Double? = null,
    @SerializedName("count_stolen_small"           ) var countStolenSmall          : Double? = null,
    @SerializedName("time_zero_boost"              ) var timeZeroBoost             : Double? = null,
    @SerializedName("percent_zero_boost"           ) var percentZeroBoost          : Double? = null,
    @SerializedName("time_full_boost"              ) var timeFullBoost             : Double? = null,
    @SerializedName("percent_full_boost"           ) var percentFullBoost          : Double? = null,
    @SerializedName("amount_overfill"              ) var amountOverfill            : Double? = null,
    @SerializedName("amount_overfill_stolen"       ) var amountOverfillStolen      : Double? = null,
    @SerializedName("amount_used_while_supersonic" ) var amountUsedWhileSupersonic : Double? = null,
    @SerializedName("time_boost_0_25"              ) var timeBoost025              : Double? = null,
    @SerializedName("time_boost_25_50"             ) var timeBoost2550             : Double? = null,
    @SerializedName("time_boost_50_75"             ) var timeBoost5075             : Double? = null,
    @SerializedName("time_boost_75_100"            ) var timeBoost75100            : Double? = null,
    @SerializedName("percent_boost_0_25"           ) var percentBoost025           : Double? = null,
    @SerializedName("percent_boost_25_50"          ) var percentBoost2550          : Double? = null,
    @SerializedName("percent_boost_50_75"          ) var percentBoost5075          : Double? = null,
    @SerializedName("percent_boost_75_100"         ) var percentBoost75100         : Double? = null

)