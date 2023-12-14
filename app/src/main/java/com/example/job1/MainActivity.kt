package com.example.job1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.job1)

        val edit: EditText = findViewById(R.id.edit)
        val tombol: Button = findViewById(R.id.tombol)
        val output: TextView = findViewById(R.id.output)

        output.text ="halo"

        tombol.setOnClickListener{
            val name = edit.text.toString()
            output.text="Halo $name"
        }
    }
}