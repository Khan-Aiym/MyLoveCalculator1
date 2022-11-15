package com.example.LoveCalculator

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.LoveCalculator.board.OnBoardModel
import com.example.mylovecalculator.R
import com.example.mylovecalculator.databinding.FragmentOnBoardBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class OnBoardingFragment : Fragment(){

    private lateinit var binding: FragmentOnBoardBinding
    private val list = arrayListOf<OnBoardModel>()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentOnBoardBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        list.add(
            OnBoardModel(
                R.raw.lotti1,
                " hello",
                " hi"
            )
        )
        list.add(
            OnBoardModel(
                R.raw.lotti1,
                "any",
                "go"
            )
        )
        list.add(
            OnBoardModel(
                R.raw.lotti1,
                "text",
                "net",

            )

        )
        list.add(
            OnBoardModel(
                R.raw.lotti1,
                "text",
                "" +
                        "look"
            )
        )
        binding.vpOnBoarding.adapter = OnBoardAdapter(list)
        binding.dotsIndicator.attachTo(binding.vpOnBoarding)
    }




}

