package com.rohanbasukala.learningmvvmsample.data.database.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

const val CURRENT_USER_ID = 0

@Entity
data class User(
    var id: Int? = null,
    var name: String? = null,
    var email: String? = null,
    var email_verified_at: String? = null,
    var created_at: String? = null,
    val updated_at: String? = null,
) {
    @PrimaryKey(autoGenerate = false)
    var uId: Int = CURRENT_USER_ID
}