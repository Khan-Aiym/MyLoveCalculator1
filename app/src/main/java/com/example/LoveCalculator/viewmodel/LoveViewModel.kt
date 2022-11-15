package com.example.LoveCalculator.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.LoveCalculator.model.LoveModel
import com.example.LoveCalculator.repository.Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class LoveViewModel @Inject constructor(private val repository: Repository):ViewModel() {

    fun getLiveModel(fName:String,sName:String):LiveData<LoveModel>{
        return repository.getCalculate(fName,sName)
    }
}