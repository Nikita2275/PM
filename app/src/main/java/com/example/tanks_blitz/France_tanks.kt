package com.example.tanks_blitz

import android.content.Intent
import android.content.pm.ActivityInfo
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar

class France_tanks : AppCompatActivity() {

    private lateinit var toolbar: Toolbar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.france_tanks)
        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT

        toolbar = findViewById(R.id.toolbar1)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "Франция"
    }

    fun ClickItemNastr (item: MenuItem) {
        val intent = Intent(this@France_tanks,
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

    fun OnClickBC25 (view: View) {
        val intent = Intent(this@France_tanks,
            Bc_25::class.java)
        startActivity(intent)
    }

    fun OnClickFotch (view: View) {
        val intent = Intent(this@France_tanks,
            Fotch::class.java)
        startActivity(intent)
    }

    fun OnClickAMX50B (view: View) {
        val intent = Intent(this@France_tanks,
            Amx_50_B::class.java)
        startActivity(intent)
    }
}