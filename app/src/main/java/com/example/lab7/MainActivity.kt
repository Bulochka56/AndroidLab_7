package com.example.lab7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.TextureView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import java.util.concurrent.CopyOnWriteArrayList

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.menu_main,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        var sheet : ConstraintLayout = findViewById(R.id.sheet)
        val textView: TextView = findViewById(R.id.textView)
        when (item.itemId){
            R.id.action1 -> {
                sheet.setBackgroundColor(0xFFADFF2F.toInt())
                textView.text = "Вы выбрали пункт 1!"
                return true
            }
            R.id.action2 -> {
                sheet.setBackgroundColor(0xFFFFC0CB.toInt())
                textView.text = "Вы выбрали пункт 2!"
                return true
            }
            R.id.action3 -> {
                sheet.setBackgroundColor(0xFF66CDAA.toInt())
                textView.text = "Вы выбрали пункт 3!"
                return true
            }
        }
        return super.onOptionsItemSelected(item)

    }
}