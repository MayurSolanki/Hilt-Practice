package com.example.hiltdaggerpractice.hilt

import com.example.hiltdaggerpractice.network.CallInterceptorImpl
import com.example.hiltdaggerpractice.network.NetworkService
import com.example.hiltdaggerpractice.network.ResponseInterceptorImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@Module
@InstallIn(ActivityComponent::class)
class NetworkModule {

//    @Binds
//    abstract fun bindNetworkAdapterImpl(myNetworkAdapter: MyNetworkAdapter): NetworkAdapter

//     @Provides
//     fun provideNetworkService() : NetworkService{
//         return NetworkService.Builder()
//             .host("google.com")
//             .protocol("HTTPS")
//             .build()
//     }

     @CallInterceptor
     @Provides
     fun provideCallNetworkService() : NetworkService{
         return NetworkService.Builder()
             .host("google.com")
             .protocol("HTTPS")
             .interceptor(CallInterceptorImpl())
             .build()
     }

    @ResponseInterceptor
    @Provides
    fun provideResponseNetworkService() : NetworkService{
        return NetworkService.Builder()
            .host("google.com")
            .protocol("HTTPS")
            .interceptor(ResponseInterceptorImpl())
            .build()
    }
}

