package com.example.wisataaa

import android.os.Parcelable

abstract class Wisata(
    var imageWisata: Int,
    var titleWisata: String,
    var descWisata: String
) : Parcelable
