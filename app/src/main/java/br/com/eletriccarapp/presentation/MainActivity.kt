package br.com.eletriccarapp.presentation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import br.com.eletriccarapp.R

class MainActivity : AppCompatActivity() {


    lateinit var btnCalcular: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupView()
        setupListners()

    }

    fun setupView() {
        btnCalcular = findViewById(R.id.btn_calcular)

    }

    fun setupListners() {
        btnCalcular.setOnClickListener {
            startActivity(Intent(this, CalcularAutonimiaActivity::class.java))

        }
    }

}
