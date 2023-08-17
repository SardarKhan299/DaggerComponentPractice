package com.techyourchance.dagger2course.user

import com.google.gson.annotations.SerializedName

data class Users(
    @SerializedName("display_name")
    val name:String,
    @SerializedName("profile_image")
    val imageUrl:String
)
