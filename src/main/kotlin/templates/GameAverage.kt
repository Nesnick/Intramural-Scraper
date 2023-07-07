package templates

import Core
import com.google.gson.annotations.SerializedName

data class GameAverage (

    @SerializedName("core"        ) var core        : Core?        = Core(),
    @SerializedName("boost"       ) var boost       : Boost?       = Boost(),
    @SerializedName("movement"    ) var movement    : Movement?    = Movement(),
    @SerializedName("positioning" ) var positioning : Positioning? = Positioning(),
    @SerializedName("demo"        ) var demo        : Demo?        = Demo()

)
