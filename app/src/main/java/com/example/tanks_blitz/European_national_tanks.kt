package com.example.tanks_blitz

import android.content.Intent
import android.content.pm.ActivityInfo
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar

class European_national_tanks : AppCompatActivity() {

    private lateinit var toolbar: Toolbar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.european_national_tanks)
        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT

        toolbar = findViewById(R.id.toolbar1)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "Сборная Европы"
    }

    fun ClickItemNastr (item: MenuItem) {
        val intent = Intent(this@European_national_tanks,
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

    fun OnClickProgetto_65 (view: View) {
        val intent = Intent(this@European_national_tanks,
            Progetto_65::class.java)
        startActivity(intent)
    }

    fun OnClickTVP (view: View) {
        val intent = Intent(this@European_national_tanks,
            TVP::class.java)
        startActivity(intent)
    }

    fun OnClickCs63 (view: View) {
        val intent = Intent(this@European_national_tanks,
            Cs_63::class.java)
        startActivity(intent)
    }

    fun OnClickVz55 (view: View) {
        val intent = Intent(this@European_national_tanks,
            Vz_55::class.java)
        startActivity(intent)
    }

    fun OnClick60tp (view: View) {
        val intent = Intent(this@European_national_tanks,
            TP_60::class.java)
        startActivity(intent)
    }

    fun OnClickKran (view: View) {
        val intent = Intent(this@European_national_tanks,
            Kranvagn::class.java)
        startActivity(intent)
    }

    fun OnClickMino (view: View) {
        val intent = Intent(this@European_national_tanks,
            Minotauro::class.java)
        startActivity(intent)
    }
}