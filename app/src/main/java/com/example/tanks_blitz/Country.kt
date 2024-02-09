package com.example.tanks_blitz

import android.content.Intent
import android.content.pm.ActivityInfo
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar

class Country : AppCompatActivity() {

    private lateinit var toolbar: Toolbar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.country)
        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT

        toolbar = findViewById(R.id.toolbar1)
        setSupportActionBar(toolbar)
        supportActionBar?.title = "Нации"
    }

    fun OnClickTank(view: View){
        val intent = Intent(this@Country,
            Garmeny_Tanks::class.java)
        startActivity(intent)
    }

    fun OnClickTank1(view: View){
        val intent = Intent(this@Country,
            Sssr_Tanks::class.java)
        startActivity(intent)
    }

    fun OnClickTank3(view: View){
        val intent = Intent(this@Country,
            China_tanks::class.java)
        startActivity(intent)
    }

    fun OnClickTank4(view: View){
        val intent = Intent(this@Country,
            France_tanks::class.java)
        startActivity(intent)
    }

    fun OnClickTank5(view: View){
        val intent = Intent(this@Country,
            European_national_tanks::class.java)
        startActivity(intent)
    }

    fun OnClickTank6(view: View){
        val intent = Intent(this@Country,
            Japan_tanks::class.java)
        startActivity(intent)
    }

    fun ClickItemNastr (item: MenuItem) {
        val intent = Intent(this@Country,
            Setting::class.java)
        startActivity(intent)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.section_menu, menu)
        return true
    }
}