package com.test.loglib

import android.util.Log

open object DCLogger {

    val TAG = DCLogger.javaClass.name

    fun logError(msg:String){
        Log.e(TAG+"-error:",msg)
    }

    fun logDebug(msg:String){
        Log.e(TAG+"-debug:",msg)
    }

}