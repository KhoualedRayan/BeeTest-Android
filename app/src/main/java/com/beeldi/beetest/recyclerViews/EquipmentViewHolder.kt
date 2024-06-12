package com.beeldi.beetest.recyclerViews

import android.content.Context
import android.content.Intent
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.beeldi.beetest.R
import com.beeldi.beetest.tools.Equipment
import com.beeldi.beetest.views.EquipmentDetails

class EquipmentViewHolder(itemView: View, private val context: Context) : RecyclerView.ViewHolder(itemView),View.OnClickListener {
    private val name: TextView = itemView.findViewById(R.id.equipmentTextView)
    private lateinit var equipment:Equipment

    init {
        itemView.setOnClickListener(this)
    }
    override fun onClick(v: View?) {
        //On Click d'un élémént de la liste, accéder à la prochaine vue depuis ici.
        val text = name.text.toString()
        val intent = Intent(context,EquipmentDetails::class.java)
        intent.putExtra("equipment_id",equipment.id.toString())
        intent.putExtra("equipment_name",equipment.name)
        intent.putExtra("equipment_type",equipment.type)
        context.startActivity(intent)

    }
    fun setName(newName : String){
        name.text = newName
    }
    fun setEquipment(equipment: Equipment){
        this.equipment = equipment
    }


}