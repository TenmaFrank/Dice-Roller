package com.tenmafrank.diceroller

import android.graphics.drawable.Drawable
import tenmafrank.diceroller.R

class Dice() {
     fun rollDice(sides: Int) : Int {
        val res = (1..sides).random()

        return when (res){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            6 -> R.drawable.dice_6
            else -> res
        }

    }
}