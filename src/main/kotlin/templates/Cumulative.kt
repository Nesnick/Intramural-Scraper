package templates

import Core
import com.google.gson.annotations.SerializedName

data class Cumulative (

    @SerializedName("games"          ) var games         : Int?         = null,
    @SerializedName("wins"           ) var wins          : Int?         = null,
    @SerializedName("win_percentage" ) var winPercentage : Int?         = null,
    @SerializedName("play_duration"  ) var playDuration  : Int?         = null,
    @SerializedName("core"           ) var core          : Core?        = Core(),
    @SerializedName("boost"          ) var boost         : Boost?       = Boost(),
    @SerializedName("movement"       ) var movement      : Movement?    = Movement(),
    @SerializedName("positioning"    ) var positioning   : Positioning? = Positioning(),
    @SerializedName("demo"           ) var demo          : Demo?        = Demo()

)