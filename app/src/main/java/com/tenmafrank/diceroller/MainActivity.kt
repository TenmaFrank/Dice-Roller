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

        val firstDice = Dice()

        binding.diceOneButton.setOnClickListener {
            binding.diceOneImageView.setImageResource(firstDice.rollDice(6))
        }

        binding.diceTwoButton.setOnClickListener {
            binding.diceOneImageView.setImageResource(firstDice.rollDice(6))
            binding.diceTwoImageView.setImageResource(firstDice.rollDice(6))
        }

    }
}