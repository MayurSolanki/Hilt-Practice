package com.example.hiltdaggerpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.hiltdaggerpractice.database.DatabaseAdapter
import com.example.hiltdaggerpractice.database.DatabaseService
import com.example.hiltdaggerpractice.hilt.CallInterceptor
import com.example.hiltdaggerpractice.hilt.ResponseInterceptor
import com.example.hiltdaggerpractice.network.NetworkAdapter
import com.example.hiltdaggerpractice.network.NetworkService
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject lateinit var databaseAdapter: DatabaseAdapter
//    @Inject lateinit var networkAdapter: NetworkAdapter

     // @CallInterceptor
     @ResponseInterceptor
     @Inject lateinit var networkService: NetworkService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(TAG, "DatabaseAdapter $databaseAdapter")
        databaseAdapter.log("Hello Hilt")

//        networkAdapter.log("Interface Binding")

        networkService.performNetworkCall()
    }

    @Inject
    fun directToDatabase(databaseService: DatabaseService){
        Log.d(TAG, "Method injection")
    }
}