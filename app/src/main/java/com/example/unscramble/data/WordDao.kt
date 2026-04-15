package com.example.unscramble.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface WordDao {
    @Query("SELECT * FROM words_table")
    fun getAllWords(): List<WordEntity>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insertWord(word: WordEntity)
}