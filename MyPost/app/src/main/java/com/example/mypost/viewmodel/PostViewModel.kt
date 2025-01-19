package com.example.mypost.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.mypost.data.RetrofitInstance
import com.example.mypost.data.models.CreatePostRequest
import com.example.mypost.data.models.Post
import com.example.mypost.data.models.User
import com.example.mypost.data.models.UserCreateRequest
import kotlinx.coroutines.launch

class PostViewModel: ViewModel() {
    var posts: List<Post> by mutableStateOf(listOf())
    var users: List<User> by mutableStateOf(listOf())
    private val userId = 1

    fun fetchUsers() {
        viewModelScope.launch {
            try {
                users = RetrofitInstance.api.getUsuarios()
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }

    fun fetchPost() {
        viewModelScope.launch {
            try {
                posts = RetrofitInstance.api.getPosts(userId)
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }

    fun createUser(nome: String, email: String, onSuccess: () -> Unit, onError: () -> Unit) {
        viewModelScope.launch {
            try {
                val newUser = UserCreateRequest(nome, email)
                RetrofitInstance.api.createUser(newUser)
                fetchUsers()
                onSuccess()
            } catch (e: Exception) {
                e.printStackTrace()
                onError()
            }
        }
    }

    fun createPost(titulo: String, content: String, onSuccess: () -> Unit, onError: () -> Unit) {
        viewModelScope.launch {
            try {
                val newPost = CreatePostRequest(titulo, content)
                RetrofitInstance.api.createPost(userId, newPost)
                fetchPost()
                onSuccess()
            } catch (e: Exception) {
                e.printStackTrace()
                onError()
            }
        }
    }

    fun deletePost(postId: Int) {
        viewModelScope.launch {
            try {
                RetrofitInstance.api.deletePost(postId)
                fetchPost()
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }

    fun updatePost(postId: Int, titulo: String, content: String) {
        viewModelScope.launch {
            try {
                val updatePost = CreatePostRequest(titulo, content)
                RetrofitInstance.api.updatePost(postId,updatePost)
                fetchPost()
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }
}