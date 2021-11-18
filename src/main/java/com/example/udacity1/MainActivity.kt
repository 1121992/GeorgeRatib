package com.example.udacity1

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rollDice()
    }

    private fun rollDice() {
        val diceImage: ImageView = findViewById(R.id.empty)
        val randomInt = Random().nextInt(6) + 1
        val DrawableResource = when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        diceImage.setImageResource(DrawableResource)
    }
    fun click(view: View) {

        val click: Button = findViewById(R.id.button)
        click.setOnClickListener {
            rollDice()
        }

    }
}
