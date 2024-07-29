package com.yogesh.mytestcases.data.network.repo

import com.yogesh.mytestcases.data.User

// UserRepository.kt
interface UserRepository {
    fun getUserById(userId: Int): User?
}
