package com.example.tesfloatgithub

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Users (
    val listofUser: List<User>
) : Parcelable