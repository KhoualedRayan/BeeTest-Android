package com.beeldi.beetest.viewModels

import android.content.Context
import androidx.lifecycle.ViewModel
import com.beeldi.beetest.EquipmentDataSource
import com.beeldi.beetest.tools.Equipment
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

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
    fun init(context : Context){
        //Fonction d'initialisation des équipements
        val equipmentsData = EquipmentDataSource.getEquipmentData(context)
        val gson = Gson()
        val equipmentType = object : TypeToken<List<Equipment>>() {}.type
        val equipmentsFromJson: List<Equipment> = gson.fromJson(equipmentsData,equipmentType)
        addEquipments(equipmentsFromJson)
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