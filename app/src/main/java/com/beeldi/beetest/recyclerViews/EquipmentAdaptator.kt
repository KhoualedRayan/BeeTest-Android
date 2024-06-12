package com.beeldi.beetest.recyclerViews

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.beeldi.beetest.R
import com.beeldi.beetest.tools.Equipment

class EquipmentAdaptator(private val equipmentList: List<Equipment>) : RecyclerView.Adapter<EquipmentViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EquipmentViewHolder {
        val context = parent.context
        val inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.equipment_item,parent,false)
        return EquipmentViewHolder(view,context)
    }

    override fun getItemCount(): Int {
        return equipmentList.size
    }

    override fun onBindViewHolder(holder: EquipmentViewHolder, position: Int) {
        holder.setName(equipmentList.get(position).name)
        holder.setEquipment(equipmentList.get(position))
    }
}