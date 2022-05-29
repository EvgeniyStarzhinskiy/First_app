package com.example.first_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //without import kotlinx.android.synthetic.main.activity_main.*
        //val button_menu = findViewById<Button>(R.id.button_menu)
        //val button_favorites = findViewById<Button>(R.id.button_favorites)
        //val button_later = findViewById<Button>(R.id.button_later)
        //val button_collections = findViewById<Button>(R.id.button_collections)
        //val button_settings = findViewById<Button>(R.id.button_settings)
        initButtons()

    }
    private fun initButtons(){
        button_menu.setOnClickListener {
            Toast.makeText(this, "Меню", Toast.LENGTH_SHORT).show()
        }
        button_favorites.setOnClickListener {
            Toast.makeText(this, "Избранное", Toast.LENGTH_SHORT).show()
        }
        button_later.setOnClickListener {
            Toast.makeText(this, "Посмотреть позже", Toast.LENGTH_SHORT).show()
        }
        button_collections.setOnClickListener {
            Toast.makeText(this, "Подборки", Toast.LENGTH_SHORT).show()
        }
        button_settings.setOnClickListener {
            Toast.makeText(this, "Настройки", Toast.LENGTH_SHORT).show()
        }

    }
}


