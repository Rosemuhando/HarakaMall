package com.rosemuhando.harakamall.repository


import com.rosemuhando.harakamall.data.UserDao
import com.rosemuhando.harakamall.model.User

class UserRepository(private val userDao: UserDao) {
    suspend fun registerUser(user: User) {
        userDao.registerUser(user)
    }

    suspend fun loginUser(email: String, password: String): User? {
        return userDao.loginUser(email, password)
    }
}