package com.example.tanks_blitz


import android.annotation.SuppressLint
import android.content.Intent
import android.content.pm.ActivityInfo
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar

class Sssr_Tanks : AppCompatActivity() {

    private lateinit var toolbar: Toolbar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sssr_tanks)
        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT

        toolbar = findViewById(R.id.toolbar1)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "СССР"
    }

    fun ClickItemNastr (item: MenuItem) {
        val intent = Intent(this@Sssr_Tanks,
            Setting::class.java)
        startActivity(intent)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.section_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(item.itemId == android.R.id.home) finish()
        return true
    }

    fun OnClickIs4 (view: View) {
        val intent = Intent(this@Sssr_Tanks,
            Is_4::class.java)
        startActivity(intent)
    }

    fun OnClickIs7 (view: View) {
        val intent = Intent(this@Sssr_Tanks,
            Is_7::class.java)
        startActivity(intent)
    }

    fun OnClickObj140 (view: View) {
        val intent = Intent(this@Sssr_Tanks,
            Object_140::class.java)
        startActivity(intent)
    }

    fun OnClickObj263 (view: View) {
        val intent = Intent(this@Sssr_Tanks,
            Object_263::class.java)
        startActivity(intent)
    }

    fun OnClickObj268 (view: View) {
        val intent = Intent(this@Sssr_Tanks,
            Object_268::class.java)
        startActivity(intent)
    }

    fun OnClickT100Lt (view: View) {
        val intent = Intent(this@Sssr_Tanks,
            T_100LT::class.java)
        startActivity(intent)
    }
}