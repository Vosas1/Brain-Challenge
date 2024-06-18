package com.victor.osaikhuwuomwan_comp304_001_hands_on_test_s24

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_victor)
        supportActionBar?.title = "Hands-On Test 1 COMP-304 001"

        val selectExercisesButton = findViewById<Button>(R.id.selectExercisesButton)
        selectExercisesButton.setOnClickListener {
            val intent = Intent(this, OsaikhuwuomwanActivity::class.java)
            startActivity(intent)
        }
    }
}