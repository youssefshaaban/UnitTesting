package com.example.unittesting

import android.content.Context

class ResourcesComparer {
    fun isEqual(context: Context,resId:Int,str:String):Boolean{
        return context.getString(resId)==str
    }
}