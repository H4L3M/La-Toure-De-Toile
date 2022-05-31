package com.latouredetoile.model

data class Review(
    val rating: Float = 5f,
    val name: String = "Anonymous",
    val userImg: String,
    val comment: CharSequence
)