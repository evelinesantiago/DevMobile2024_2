package com.example.mypost.data.models

data class User (
    val id: Int,
    val nome: String,
    val email: String
)

data class UserCreateRequest(
    val nome: String,
    val email: String
)