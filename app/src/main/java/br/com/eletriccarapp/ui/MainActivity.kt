package br.com.eletriccarapp.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Spannable
import android.util.Log
import android.widget.Button
import android.widget.TableLayout
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager.widget.ViewPager
import br.com.eletriccarapp.R
import br.com.eletriccarapp.data.CarFactory
import br.com.eletriccarapp.ui.adapter.CarAdapter
import br.com.eletriccarapp.ui.adapter.TabAdapter
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {


    lateinit var btnCalcular: Button
    lateinit var listaCarros: RecyclerView
    lateinit var tabLayout: TabLayout
    lateinit var viewPager : ViewPager


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("Lifecycle", "Create")
        setContentView(R.layout.activity_main)
        setupView()
        setupListners()
        setupList()

    }



    fun setupView() {
        tabLayout = findViewById(R.id.tab_layout)
        btnCalcular = findViewById(R.id.btn_calcular)
        listaCarros = findViewById(R.id.rv_lista_carros)

    }

    fun setupList() {
        val adapter = CarAdapter(CarFactory.list)
        listaCarros.adapter = adapter
    }

    fun setupTabs() {
        val tabsAdapter = TabAdapter(this)
        viewPager.adapter = tabsAdapter
    }

    fun setupListners() {
        btnCalcular.setOnClickListener {
            startActivity(Intent(this, CalcularAutonomiaActivity::class.java))

        }
    }

}
