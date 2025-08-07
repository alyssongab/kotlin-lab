package com.example.app.classes

// usando valores default
class User(
    val username: String,
    val role: String = "Guest",
    val isLoggedIn: Boolean = false
)