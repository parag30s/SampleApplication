package com.example.sampleapplication

import android.app.Application
import com.example.sampleapplication.di.ApplicationComponent
import com.example.sampleapplication.di.DaggerApplicationComponent

class SampleApplication : Application() {
    lateinit var applicationComponent: ApplicationComponent

    override fun onCreate() {
        super.onCreate()
        applicationComponent = DaggerApplicationComponent.builder().build()
    }
}