package com.example.attributes

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textEdit = findViewById<EditText>(R.id.edit_text)

        findViewById<Button>(R.id.text_black).setOnClickListener {
            textEdit.setTextColor(getColor(R.color.font_black_color))
        }
        findViewById<Button>(R.id.text_red).setOnClickListener {
            textEdit.setTextColor(getColor(R.color.font_red_color))
        }
        findViewById<Button>(R.id.size_8).setOnClickListener {
            textEdit.textSize = 8f
        }
        findViewById<Button>(R.id.size_24).setOnClickListener {
            textEdit.textSize = 24f
        }
        findViewById<Button>(R.id.back_white).setOnClickListener {
            textEdit.setBackgroundColor(getColor(R.color.back_white_color))
        }
        findViewById<Button>(R.id.back_yellow).setOnClickListener {
            textEdit.setBackgroundColor(getColor(R.color.back_yellow_color))
        }
    }
}