package com.beeldi.beetest

import android.content.Context

class EquipmentDataSource {
    companion object {
        fun getEquipmentData(context: Context): String {
            return context.resources.openRawResource(R.raw.equipment).bufferedReader().use { it.readText() }
        }
    }
}
