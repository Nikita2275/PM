package com.example.tanks_blitz

import android.content.Intent
import android.content.pm.ActivityInfo
import android.content.res.Configuration
import android.os.Bundle
import android.os.Handler
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.ProgressBar
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar


class Home : AppCompatActivity() {

    private lateinit var toolbar: Toolbar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home)
        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT

        // Проверяем текущую тему устройства
        val currentNightMode = resources.configuration.uiMode and Configuration.UI_MODE_NIGHT_MASK

        // Устанавливаем тему и картинку в зависимости от текущей темы
        if (currentNightMode == Configuration.UI_MODE_NIGHT_NO) {
            // Светлая тема
            setTheme(R.style.LightTheme)
            setContentView(R.layout.home)
            val imageView = findViewById<ImageView>(R.id.imageView)
            imageView.setImageResource(R.drawable.logo1)
            val imageView1 = findViewById<ImageView>(R.id.imageView1)
            imageView1.setImageResource(R.drawable.baseline11)
        } else {
            // Темная тема
            setTheme(R.style.DarkTheme)
            setContentView(R.layout.home)
            val imageView = findViewById<ImageView>(R.id.imageView)
            imageView.setImageResource(R.drawable.logo2)
            val imageView1 = findViewById<ImageView>(R.id.imageView1)
            imageView1.setImageResource(R.drawable.baseline)
        }

        val button = findViewById<Button>(R.id.button)
        val progressBar = findViewById<ProgressBar>(R.id.progressBar)

        button.setOnClickListener {          // Показываем ProgressBar и скрываем кнопку
            progressBar.visibility = View.VISIBLE
            button.visibility = View.GONE

                                                    // Здесь вы можете выполнить любые дополнительные действия или загрузить данные

            Handler().postDelayed({
                startActivity(Intent(this, Country::class.java))
                overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
                finish()
            }, 1000)
        }

        toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)
        supportActionBar?.title = "Tanks Blitz"
    }

    fun ClickItemNastr (item: MenuItem) {
        val intent = Intent(this@Home,
            Setting::class.java)
        startActivity(intent)
    }

    fun Click_o_programme (item: MenuItem) {
        val intent = Intent(this@Home,
            O_programme::class.java)
        startActivity(intent)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.glav_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(item.itemId == android.R.id.home) finish()
        return true
    }
}