package com.example.tema8franciscorequenaej1

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




        val texto=findViewById<TextView>(R.id.dos)

        val boton=findViewById<Button>(R.id.bot)

        boton.setOnClickListener {

            if(texto.visibility==View.VISIBLE)
                texto.visibility= View.INVISIBLE
            else
                texto.visibility= View.VISIBLE
        }
    }
}