package br.com.eletriccarapp.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Spannable
import android.util.Log
import android.widget.Button
import androidx.recyclerview.widget.RecyclerView
import br.com.eletriccarapp.R
import br.com.eletriccarapp.data.CarFactory
import br.com.eletriccarapp.ui.adapter.CarAdapter

class MainActivity : AppCompatActivity() {


    lateinit var btnCalcular: Button
    lateinit var listaCarros: RecyclerView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("Lifecycle", "Create")
        setContentView(R.layout.activity_main)
        setupView()
        setupListners()
        setupList()

    }

    override fun onResume() {
        super.onResume()
        Log.d("Lifecycle", "RESUME")
    }

    override fun onStart() {
        super.onStart()
        Log.d("Lifecycle", "START")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Lifecycle", "PAUSE")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Lifecycle", "STOP")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Lifecycle", "DESTROY")
    }


    fun setupView() {
        btnCalcular = findViewById(R.id.btn_calcular)
        listaCarros = findViewById(R.id.rv_lista_carros)

    }

    fun setupList() {
        val adapter = CarAdapter(CarFactory.list)
        listaCarros.adapter = adapter
    }



    fun setupListners() {
        btnCalcular.setOnClickListener {
            startActivity(Intent(this, CalcularAutonomiaActivity::class.java))

        }
    }

}
