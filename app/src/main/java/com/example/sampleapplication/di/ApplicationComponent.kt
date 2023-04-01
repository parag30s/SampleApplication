package com.example.sampleapplication.di

import com.example.sampleapplication.MainActivity
import dagger.Component
import javax.inject.Singleton

@Component(modules = [NetworkModule::class])
@Singleton
interface ApplicationComponent {

    fun inject(mainActivity: MainActivity)
}