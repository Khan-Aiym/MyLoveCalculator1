package com.example.LoveCalculator.room

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.LoveCalculator.model.LoveModel

@Database(entities = [LoveModel::class], version = 1)
abstract class AppDataBase :RoomDatabase() {

    abstract fun loveDao():Dao
}