package templates


import com.google.gson.annotations.SerializedName

data class ReplayGroup(
    @SerializedName("teams") var teams: ArrayList<Teams> = arrayListOf(),
    @SerializedName("players") var players: ArrayList<Players> = arrayListOf(),
    @SerializedName("creator") var creator: SteamUser? = SteamUser(),
    @SerializedName("shared") var shared: Boolean? = null,
    @SerializedName("team_identification") var teamIdentification: String? = null,
    @SerializedName("player_identification") var playerIdentification: String? = null,
    @SerializedName("status") var status: String? = null,
    @SerializedName("created") var created: String? = null,
    @SerializedName("link") var link: String? = null,
    @SerializedName("id") var id: String? = null,
)