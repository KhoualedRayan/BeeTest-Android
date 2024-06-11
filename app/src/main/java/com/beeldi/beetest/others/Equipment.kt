package com.beeldi.beetest.others

class Equipment(val id: Int, val name : String, val type : String) {
    override fun toString(): String {
        return "Equipment(id=$id, name='$name', type='$type')"
    }
}