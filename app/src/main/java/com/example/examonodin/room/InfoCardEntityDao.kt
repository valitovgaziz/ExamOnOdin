package com.example.examonodin.room


import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy.REPLACE
import androidx.room.Query

@Dao
interface InfoCardDao {

    @Query("select * from InfoCardData")
    fun getAll(): List<InfoCardData>

    @Insert(onConflict = REPLACE)
    suspend fun insert(entity: InfoCardData)
}