package com.example.firstappnew1.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface DatabaseDAO {
    @Insert
    fun insert(contact: Contact)

    @Query("SELECT * from contact_table")
    fun get(): LiveData<List<Contact>>
}