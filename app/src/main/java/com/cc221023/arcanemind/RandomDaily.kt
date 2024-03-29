package com.cc221023.arcanemind

import androidx.room.Entity
import androidx.room.PrimaryKey

//for the database
@Entity(tableName = "daily_cards")
data class RandomDaily(
    val name: String = "",
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val meaningUp: String = "",
    val desc: String = "",
    val comment: String = "",
    val name_short: String = "",
    val imgUrl: String = "",
    val date: String = "",
)