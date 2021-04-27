package com.rohanbasukala.learningmvvmsample.data.repositories

import com.rohanbasukala.learningmvvmsample.data.network.MyApi
import com.rohanbasukala.learningmvvmsample.data.network.responses.AuthResponse
import retrofit2.Response

class UserRepository {

    suspend fun userLogin(email: String, password: String): Response<AuthResponse> {
        return MyApi().userLogin(email, password)
    }

}