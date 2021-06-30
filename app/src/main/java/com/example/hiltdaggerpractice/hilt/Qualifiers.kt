package com.example.hiltdaggerpractice.hilt

import javax.inject.Qualifier


@Qualifier  // This is used to switch the instance
@Retention(AnnotationRetention.BINARY)
annotation class CallInterceptor

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class ResponseInterceptor