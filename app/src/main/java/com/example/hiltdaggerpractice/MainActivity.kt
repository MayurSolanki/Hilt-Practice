package com.example.hiltdaggerpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.hiltdaggerpractice.database.DatabaseAdapter
import com.example.hiltdaggerpractice.database.DatabaseService
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject lateinit var databaseAdapter: DatabaseAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(TAG, "DatabaseAdapter $databaseAdapter")
        databaseAdapter.log("Hello Hilt")

    }

    @Inject
    fun directToDatabase(databaseService: DatabaseService){
        Log.d(TAG, "Method injection")
    }
}