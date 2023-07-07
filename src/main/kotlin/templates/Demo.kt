package templates

import com.google.gson.annotations.SerializedName

data class Demo (

    @SerializedName("inflicted" ) var inflicted : Int? = null,
    @SerializedName("taken"     ) var taken     : Int? = null
)