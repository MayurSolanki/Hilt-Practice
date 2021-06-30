package com.example.hiltdaggerpractice.hilt

import com.example.hiltdaggerpractice.network.CallInterceptorImpl
import com.example.hiltdaggerpractice.network.NetworkService
import com.example.hiltdaggerpractice.network.ResponseInterceptorImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Inject
import javax.inject.Singleton

@Module
@InstallIn(ActivityComponent::class)
class NetworkModule {

//    @Binds  // This is used to interface instance creation, abstract class and abstract method
//    abstract fun bindNetworkAdapterImpl(myNetworkAdapter: MyNetworkAdapter): NetworkAdapter

//     @Provides
//     fun provideNetworkService() : NetworkService{
//         return NetworkService.Builder()
//             .host("google.com")
//             .protocol("HTTPS")
//             .build()
//     }

     @CallInterceptor
     @Provides  // This us used to create instance of any third party lib
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


    @ActivityScoped
    @Provides
    fun provideSomeInterface(
    ): SomeInterface{
        return SomeInterfaceImpl()
    }

}


class  SomeInterfaceImpl @Inject constructor(): SomeInterface{
    override fun doSomethinginsideSomeInterface(str : String): String {
        return  "Doing Something...${str}"
    }

}

 interface SomeInterface{
    fun doSomethinginsideSomeInterface(str : String) : String
}
