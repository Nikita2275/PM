package com.example.tanks_blitz

import android.content.Intent
import android.content.pm.ActivityInfo
import android.content.res.Configuration
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import androidx.appcompat.widget.Toolbar

class Setting : AppCompatActivity() {

    private lateinit var toolbar: Toolbar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.setting)
        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT

        toolbar = findViewById(R.id.toolbar1)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "Настройки"
    }

    fun setOnClickListener(view: View) {
        // Получаем текущую тему приложения
        // Получаем текущую тему приложения

        val currentTheme = resources.configuration.uiMode and Configuration.UI_MODE_NIGHT_MASK
        val newTheme: Int
        // Используем switch для определения новой темы в зависимости от текущей темы
        newTheme = when (currentTheme) {
            Configuration.UI_MODE_NIGHT_NO ->       // Текущая тема: светлая
                AppCompatDelegate.MODE_NIGHT_YES    // Меняем на темную тему
            Configuration.UI_MODE_NIGHT_YES ->      // Текущая тема: темная
                AppCompatDelegate.MODE_NIGHT_NO     // Меняем на светлую тему
            else ->                                 // Если текущая тема не определена
                AppCompatDelegate.MODE_NIGHT_NO     // По умолчанию устанавливаем светлую тему
        }
        // Устанавливаем новую тему для приложения
        AppCompatDelegate.setDefaultNightMode(newTheme)
    }

    fun Click_o_programme (item: MenuItem) {
        val intent = Intent(this@Setting,
            O_programme::class.java)
        startActivity(intent)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.nastr_menu, menu)
        return true
    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(item.itemId == android.R.id.home) finish()
        return true
    }
}

