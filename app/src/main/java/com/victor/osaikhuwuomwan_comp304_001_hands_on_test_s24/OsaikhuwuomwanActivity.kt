package com.victor.osaikhuwuomwan_comp304_001_hands_on_test_s24

import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class OsaikhuwuomwanActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_osaikhuwuomwan)
        supportActionBar?.title = "Brain Challenge"

        val radioGroup = findViewById<RadioGroup>(R.id.radioGroup)
        val nextButton = findViewById<Button>(R.id.nextButton)

        nextButton.setOnClickListener {
            val selectedRadioButtonId = radioGroup.checkedRadioButtonId
            if (selectedRadioButtonId != -1) {
                val selectedRadioButton = findViewById<RadioButton>(selectedRadioButtonId)
                val selectedExercise = selectedRadioButton.text.toString()
                Toast.makeText(this, selectedExercise, Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(this, "Please select an exercise", Toast.LENGTH_SHORT).show()
            }
        }
    }
}

