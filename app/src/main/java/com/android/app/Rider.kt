package com.android.myrecyclerview

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Rider(
    var name: String,
    var description: String,
    var photo: Int
) : Parcelable
