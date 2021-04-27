package com.rohanbasukala.learningmvvmsample.data.network.responses

import com.rohanbasukala.learningmvvmsample.data.database.entities.User

data class AuthResponse(
    val isSuccessful: Boolean?,
    val message: String?,
    val user: User,
)