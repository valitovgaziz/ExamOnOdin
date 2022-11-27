package com.example.examonodin.room


import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class InfoCardData(@PrimaryKey(autoGenerate = true) var id: Int = 0)