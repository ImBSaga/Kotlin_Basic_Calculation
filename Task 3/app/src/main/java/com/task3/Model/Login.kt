package com.task3.Model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Login(

    var username: String,
    var password: String

) : Parcelable
