package com.example.hiltdaggerpractice

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

const val TAG : String= "HiltPracticeApp"

@HiltAndroidApp
class HiltPracticeApp : Application() {

}