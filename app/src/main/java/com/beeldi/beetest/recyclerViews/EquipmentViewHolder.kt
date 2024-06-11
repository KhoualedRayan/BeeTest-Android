package com.beeldi.beetest.recyclerViews

import android.content.Context
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.beeldi.beetest.R

class EquipmentViewHolder(itemView: View, private val context: Context) : RecyclerView.ViewHolder(itemView),View.OnClickListener {
    private val name: TextView = itemView.findViewById(R.id.equipmentTextView)

    init {
        itemView.setOnClickListener(this)
    }
    override fun onClick(v: View?) {
        //On Click d'un élémént de la liste, accéder à la prochaine vue depuis ici.
        val text = name.text.toString()
        Toast.makeText(context, "Equipement cliqué : $text", Toast.LENGTH_SHORT).show()
    }
    fun setName(newName : String){
        name.text = newName
    }


}