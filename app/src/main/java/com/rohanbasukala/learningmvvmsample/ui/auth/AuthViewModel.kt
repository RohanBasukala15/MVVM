package com.rohanbasukala.learningmvvmsample.ui.auth

import android.util.Log
import android.view.View
import androidx.lifecycle.ViewModel
import com.rohanbasukala.learningmvvmsample.data.repositories.UserRepository
import com.rohanbasukala.learningmvvmsample.utils.Coroutines

class AuthViewModel : ViewModel() {

    var email: String? = null
    var password: String? = null

    var authListener: AuthListener? = null

    fun onLoginButtonClicked(view: View) {
        authListener?.onStarted()
        if (email.isNullOrEmpty() || password.isNullOrEmpty()) {
            Log.d("EMAIL", "$email")
            authListener?.onFailure("Invalid Email/ Password")
            return
        }

        Coroutines.main {
            val response = UserRepository().userLogin(email!!, password!!)
            if (response.isSuccessful) {
                authListener?.onSuccess(response.body()?.user!!)
            } else {
                authListener?.onFailure("Error${response.errorBody()}")
            }

        }

    }

}