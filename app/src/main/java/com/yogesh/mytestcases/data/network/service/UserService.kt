package com.yogesh.mytestcases.data.network.service

import com.yogesh.mytestcases.data.network.repo.UserRepository

// UserService.kt
class UserService(private val userRepository: UserRepository) {
    fun getUserName(userId: Int): String {
        val user = userRepository.getUserById(userId)
        return user?.name ?: "Unknown"
    }
}