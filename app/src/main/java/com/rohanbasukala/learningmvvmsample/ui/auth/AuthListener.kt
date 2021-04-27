package com.rohanbasukala.learningmvvmsample.ui.auth

import com.rohanbasukala.learningmvvmsample.data.database.entities.User

interface AuthListener {
    fun onStarted()
    fun onSuccess(user: User)
    fun onFailure(message: String)
}