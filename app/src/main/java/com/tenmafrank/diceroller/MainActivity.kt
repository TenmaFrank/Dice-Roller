package com.tenmafrank.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import tenmafrank.diceroller.R
import tenmafrank.diceroller.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)

        binding.DiceOneButton.setOnClickListener {
            binding.DiceOneTextview.text = "${dice()} !"
        }

    }

    private fun dice() : Int{
        val sides = 6
        return (1..sides).random()
    }

}