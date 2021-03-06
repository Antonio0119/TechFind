package com.techfind.myapplication.local.repository

import com.techfind.myapplication.Techfind
import com.techfind.myapplication.local.User
import com.techfind.myapplication.local.UserDAO
import java.sql.Types.NULL

class TechfindRepository {

    fun newUser(
        name: String,
        email: String,
        password: String,
        document: Long,
        cel_number: Long

    ) {
        val user = User(
            user_id = NULL,
            name = name,
            email = email,
            password = password,
            document = document,
            cel_number = cel_number,

        )

        val userDAO: UserDAO = Techfind.database.UserDAO()
        userDAO.newUser(user)
    }

    fun searchUser(email: String):User{
        val userDao: UserDAO = Techfind.database.UserDAO()
        val user = userDao.searchUser(email)
        return user
    }
}