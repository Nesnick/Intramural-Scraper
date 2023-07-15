package templates

import com.google.gson.annotations.SerializedName

data class RootGroup(
    @SerializedName("list")

    var list : ArrayList<ReplayGroup> = arrayListOf()
)
