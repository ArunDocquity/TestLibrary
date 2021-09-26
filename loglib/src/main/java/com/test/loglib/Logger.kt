package com.test.loglib

import android.util.Log

object Logger {

    val TAG = Logger.javaClass.name

    fun logError(msg:String){
        Log.e(TAG+"-error:",msg)
    }

    fun logDebug(msg:String){
        Log.e(TAG+"-debug:",msg)
    }

}