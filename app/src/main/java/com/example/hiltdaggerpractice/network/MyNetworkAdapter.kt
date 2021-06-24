package com.example.hiltdaggerpractice.network

import android.util.Log
import com.example.hiltdaggerpractice.TAG
import javax.inject.Inject

class MyNetworkAdapter @Inject constructor():NetworkAdapter {
    override fun log(message: String) {
        Log.d(TAG, "MyNetworkAdapter: $message")
    }
}