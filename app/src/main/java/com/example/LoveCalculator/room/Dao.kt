package com.example.LoveCalculator.room

import androidx.lifecycle.LiveData
import androidx.room.Insert
import androidx.room.Query
import com.example.LoveCalculator.model.LoveModel


@androidx.room.Dao
interface Dao {
    @Insert
    fun insert(loveModel: LoveModel)
@Query("SELECT * FROM love_table")
    fun getLove():LiveData<List<LoveModel>>
    @Query("SELECT * FROM love_table ORDER BY fName ASC")
    fun sort():LiveData<List<LoveModel>>

}
