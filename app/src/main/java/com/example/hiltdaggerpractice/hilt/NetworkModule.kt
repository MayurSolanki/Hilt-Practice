package com.example.hiltdaggerpractice.hilt

import com.example.hiltdaggerpractice.network.MyNetworkAdapter
import com.example.hiltdaggerpractice.network.NetworkAdapter
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@Module
@InstallIn(ActivityComponent::class)
abstract class NetworkModule {
    @Binds
    abstract fun bindNetworkAdapterImpl(myNetworkAdapter: MyNetworkAdapter): NetworkAdapter
}