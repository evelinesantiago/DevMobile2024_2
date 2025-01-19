package com.example.mypost.data.models

data class Post (
    val id: Int,
    val titulo: String,
    val content: String,
    val usuario_id: Int
)

data class CreatePostRequest(
    val titulo: String,
    val content: String
)