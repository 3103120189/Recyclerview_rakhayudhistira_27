package com.example.recyclerview_rakhayudhistira_27

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Superhero(
    val imgSuperhero: Int,
    val nameSupehero: String,
    val descSuperhero: String,
) : Parcelable
