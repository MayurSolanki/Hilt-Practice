package com.example.hiltdaggerpractice.network

import android.util.Log
import com.example.hiltdaggerpractice.TAG

class NetworkService private constructor(builder : Builder){

    val protocol :String?
    val host :String?
    val path :String?
    val interceptor : Interceptor?

    init {
        this.protocol = builder.protocol
        this.host = builder.host
        this.path = builder.path
        this.interceptor = builder.interceptor
    }

    fun performNetworkCall(){
        interceptor?.log("call performed")
        Log.d(TAG, "Network call performed: $this")
    }

    class Builder{
        var protocol : String? = null
            private set
        var host : String? = null
            private set
        var path : String? = null
            private set
        var interceptor : Interceptor? = null
            private set


    }
}