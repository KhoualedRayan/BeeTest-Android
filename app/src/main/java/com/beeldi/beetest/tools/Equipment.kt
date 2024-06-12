package com.beeldi.beetest.tools

class Equipment(var id: Int, var name : String, var type : String) {
    override fun toString(): String {
        return "Equipment(id=$id, name='$name', type='$type')"
    }
}