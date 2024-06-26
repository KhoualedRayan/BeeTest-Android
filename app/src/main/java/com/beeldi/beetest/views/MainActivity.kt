package com.beeldi.beetest.views

import android.content.Context
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.beeldi.beetest.EquipmentDataSource
import com.beeldi.beetest.R
import com.beeldi.beetest.tools.Equipment
import com.beeldi.beetest.recyclerViews.EquipmentAdaptator
import com.beeldi.beetest.viewModels.EquipmentListViewModel
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

class MainActivity : ComponentActivity() {
    private val equipmentListViewModel by viewModels<EquipmentListViewModel>()
    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: EquipmentAdaptator
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_layout)
        enableEdgeToEdge()
        equipmentListViewModel.init(this)

        //Mise en place de l'adapter
        adapter = EquipmentAdaptator(equipmentListViewModel.getEquipments())

        //Mise en place de la recycler view
        recyclerView = findViewById(R.id.equipmentRecyclerView)
        recyclerView.setHasFixedSize(false)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter

    }
}
