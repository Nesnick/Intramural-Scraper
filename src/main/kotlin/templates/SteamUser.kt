package templates
import com.google.gson.annotations.SerializedName

data class SteamUser (

    @SerializedName("steam_id"      ) var steamId      : String? = null,
    @SerializedName("name"          ) var name         : String? = null,
    @SerializedName("profile_url"   ) var profileUrl   : String? = null,
    @SerializedName("avatar"        ) var avatar       : String? = null,
    @SerializedName("avatar_full"   ) var avatarFull   : String? = null,
    @SerializedName("avatar_medium" ) var avatarMedium : String? = null
)