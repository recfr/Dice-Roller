package com.recepfr.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }

//        val countButton : Button = findViewById(R.id.countup_button)
//        countButton.setOnClickListener { countUp() }
    }

    private fun rollDice() {
//        Toast.makeText(this, "Button clicked.", Toast.LENGTH_SHORT).show()

        val randomInt = (1..6).random()

        val drawableResource = when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        val diceImage: ImageView = findViewById(R.id.dice_image)
        diceImage.setImageResource(drawableResource)

    }

//    private fun countUp() {
//        val resultText : TextView = findViewById(R.id.result_text)
//
//        when (resultText.text) {
//            "Hello World!" -> resultText.text ="1"
//            "6" -> resultText.text = "6"
//            else -> {
//                var resultInt = resultText.text.toString().toInt()
//                resultInt++
//                resultText.text = resultInt.toString()
//            }
//        }
//    }
}
