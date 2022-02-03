package com.rizkidelagaprasetya_19104074.sharedprefrences

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class SettingModel(
    var name: String? = null,
    var email: String? = null,
    var age: Int = 0,
    var phoneNumber: String? = null,
    var isDarkTheme: Boolean = false
) : Parcelable
