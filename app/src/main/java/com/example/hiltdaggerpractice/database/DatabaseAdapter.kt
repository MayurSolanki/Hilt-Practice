package com.example.hiltdaggerpractice.database

import android.util.Log
import com.example.hiltdaggerpractice.TAG
import javax.inject.Inject

class DatabaseAdapter @Inject constructor( var databaseService: DatabaseService) {
    fun log(message : String){
        Log.d(TAG,"DatabaseAdapter $message")
        databaseService.log(message)
    }
}