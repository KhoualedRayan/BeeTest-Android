package com.beeldi.beetest.viewModels

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import androidx.lifecycle.ViewModel
import com.beeldi.beetest.EquipmentDataSource
import com.beeldi.beetest.others.Equipment

class EquipmentListViewModel() : ViewModel() {
    //Liste des équipements
    private val equipments: MutableList<Equipment> = mutableListOf()

    fun addEquipement(equipment: Equipment){
        equipments.add(equipment)
    }
    fun addEquipments(equipmentList : List<Equipment>){
        equipments.addAll(equipmentList)
    }
    fun getEquipments(): MutableList<Equipment> {
        return equipments
    }
    fun showEquipments(){
        for(equipment in equipments){
            println(equipment.toString())
        }
    }
    fun onButtonClickShowEquipment(equipmentName : String){
        for(equipment in equipments){
            if(equipment.name == equipmentName){
                println(equipment)
            }
        }
    }
    fun onButtonClick(){
        showEquipments()
    }
}