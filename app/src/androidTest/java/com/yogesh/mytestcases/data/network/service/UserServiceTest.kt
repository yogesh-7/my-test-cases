package com.yogesh.mytestcases.data.network.service


import com.yogesh.mytestcases.data.User
import com.yogesh.mytestcases.data.network.repo.UserRepository
import org.junit.Test
import org.junit.Assert.assertEquals

class UserServiceTest {

    @Mock
    private lateinit var userRepository: UserRepository

    private lateinit var userService: UserService

    init {
        MockitoAnnotations.openMocks(this)
        userService = UserService(userRepository)
    }

    @Test
    fun getUserName_returnsCorrectName() {
        val user = User(1, "John Doe")
        `when`(userRepository.getUserById(1)).thenReturn(user)

        val result = userService.getUserName(1)
        assertEquals("John Doe", result)
    }

    @Test
    fun getUserName_returnsUnknownForNonExistingUser() {
        `when`(userRepository.getUserById(1)).thenReturn(null)

        val result = userService.getUserName(1)
        assertEquals("Unknown", result)
    }
}