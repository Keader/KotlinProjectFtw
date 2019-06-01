package com.forcetower.kotlinprojectftw.core.model

data class Session(
    val id: Int,
    val title: String,
    val descripion: String,
    val room: String,
    val picture: String?
)