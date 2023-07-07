package templates

import com.google.gson.annotations.SerializedName

data class Positioning (

    @SerializedName("avg_distance_to_ball"               ) var avgDistanceToBall             : Double? = null,
    @SerializedName("avg_distance_to_ball_possession"    ) var avgDistanceToBallPossession   : Double? = null,
    @SerializedName("avg_distance_to_ball_no_possession" ) var avgDistanceToBallNoPossession : Double? = null,
    @SerializedName("time_defensive_third"               ) var timeDefensiveThird            : Double? = null,
    @SerializedName("time_neutral_third"                 ) var timeNeutralThird              : Double? = null,
    @SerializedName("time_offensive_third"               ) var timeOffensiveThird            : Double? = null,
    @SerializedName("time_defensive_half"                ) var timeDefensiveHalf             : Double? = null,
    @SerializedName("time_offensive_half"                ) var timeOffensiveHalf             : Double? = null,
    @SerializedName("time_behind_ball"                   ) var timeBehindBall                : Double? = null,
    @SerializedName("time_infront_ball"                  ) var timeInfrontBall               : Double? = null,
    @SerializedName("time_most_back"                     ) var timeMostBack                  : Double? = null,
    @SerializedName("time_most_forward"                  ) var timeMostForward               : Double? = null,
    @SerializedName("goals_against_while_last_defender"  ) var goalsAgainstWhileLastDefender : Int?    = null,
    @SerializedName("time_closest_to_ball"               ) var timeClosestToBall             : Double? = null,
    @SerializedName("time_farthest_from_ball"            ) var timeFarthestFromBall          : Double? = null,
    @SerializedName("percent_defensive_third"            ) var percentDefensiveThird         : Double? = null,
    @SerializedName("percent_offensive_third"            ) var percentOffensiveThird         : Double? = null,
    @SerializedName("percent_neutral_third"              ) var percentNeutralThird           : Double? = null,
    @SerializedName("percent_defensive_half"             ) var percentDefensiveHalf          : Double? = null,
    @SerializedName("percent_offensive_half"             ) var percentOffensiveHalf          : Double? = null,
    @SerializedName("percent_behind_ball"                ) var percentBehindBall             : Double? = null,
    @SerializedName("percent_infront_ball"               ) var percentInfrontBall            : Double? = null

)