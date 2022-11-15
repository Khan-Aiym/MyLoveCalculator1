package com.example.LoveCalculator.ui

import android.content.SharedPreferences
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import com.example.LoveCalculator.prefs.Prefs
import com.example.mylovecalculator.R
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject


@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
@Inject
 lateinit var prefs: SharedPreferences

 lateinit var navController:NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        prefs.edit().putBoolean("isShow",true).apply()
        if (prefs.getBoolean("isShow",false)){
            navController.navigate(R.id.homeFragment)
        }
    }




}