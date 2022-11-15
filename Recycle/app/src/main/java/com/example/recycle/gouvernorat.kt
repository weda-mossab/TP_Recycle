package com.example.recycle

var GovList = mutableListOf<gouvernorat>()

val GOV_ID_EXTRA = "GOVExtra"

class gouvernorat {
    var cover: Int,
    var title: String,
    val id: Int? = GovList.size
}