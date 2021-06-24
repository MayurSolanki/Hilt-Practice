package com.example.hiltdaggerpractice.hilt

import com.example.hiltdaggerpractice.network.NetworkService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@Module
@InstallIn(ActivityComponent::class)
class NetworkModule {

//    @Binds
//    abstract fun bindNetworkAdapterImpl(myNetworkAdapter: MyNetworkAdapter): NetworkAdapter

     @Provides
     fun provideNetworkService() : NetworkService{
         return NetworkService.Builder().host("google.com").protocol("HTTPS").build()
     }
}

