package com.example.myapp.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Object (
    @StringRes val stringResourceID: Int,
    @StringRes val stringResourceID2: Int,
    @StringRes val stringResourceID3: Int,
    @DrawableRes val imageResourceID: Int)