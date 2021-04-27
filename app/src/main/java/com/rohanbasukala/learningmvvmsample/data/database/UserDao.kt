package com.rohanbasukala.learningmvvmsample.data.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.rohanbasukala.learningmvvmsample.data.database.entities.CURRENT_USER_ID
import com.rohanbasukala.learningmvvmsample.data.database.entities.User

@Dao
interface UserDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun upsert(user: User) : Long

    @Query("SELECT * FROM user WHERE uid = $CURRENT_USER_ID")
    fun getUser() : LiveData<User>

}