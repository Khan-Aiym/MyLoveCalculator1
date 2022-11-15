package com.example.LoveCalculator.ui

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
 lateinit var prefs: Prefs
 lateinit var navController:NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        prefs.seveState()
        if (prefs.isShow()){
            navController.navigate(R.id.homeFragment)
        }
    }




}