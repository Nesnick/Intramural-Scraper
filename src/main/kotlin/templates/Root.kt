package templates

import com.google.gson.annotations.SerializedName

data class Root(
    @SerializedName("list")

    var list : ArrayList<ReplayGroup> = arrayListOf()
)
