package com.beeldi.beetest.viewModels

import androidx.lifecycle.ViewModel
import com.beeldi.beetest.tools.Equipment

class EquipmentDetailsViewModel(private val equipment: Equipment) : ViewModel() {
    fun getEquipment(): Equipment {
        return equipment
    }
    fun getId(): Int {
        return equipment.id
    }
    fun getName():String{
        return equipment.name
    }
    fun getType():String{
        return equipment.type
    }
}