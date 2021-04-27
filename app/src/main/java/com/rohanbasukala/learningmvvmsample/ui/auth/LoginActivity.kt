package com.rohanbasukala.learningmvvmsample.ui.auth

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.rohanbasukala.learningmvvmsample.R
import com.rohanbasukala.learningmvvmsample.data.database.entities.User
import com.rohanbasukala.learningmvvmsample.databinding.ActivityLoginBinding
import com.rohanbasukala.learningmvvmsample.utils.toast


class LoginActivity : AppCompatActivity(), AuthListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityLoginBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_login)
        val viewModel = ViewModelProvider(this).get(AuthViewModel::class.java)

        binding.viewModel = viewModel
        binding.progressBar

        viewModel.authListener = this
    }

    override fun onStarted() {
        toast("Started")
    }

    override fun onSuccess(user: User) {
        toast("${user.name} is Logged In")
    }

    override fun onFailure(message: String) {
        toast("Failed TO load $message")
    }
}