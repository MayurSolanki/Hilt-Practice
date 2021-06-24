package com.example.hiltdaggerpractice.network

import android.util.Log
import com.example.hiltdaggerpractice.TAG
import javax.inject.Inject

class CallInterceptorImpl @Inject constructor() : Interceptor {
    override fun log(message: String) {
        Log.d(TAG, "This is a call interceptor: $message")
    }
}