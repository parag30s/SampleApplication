package com.example.sampleapplication.di

import com.example.sampleapplication.network.ProductService
import com.example.sampleapplication.util.Constants
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
class NetworkModule {

    @Singleton
    @Provides
    fun provideRetrofit(): Retrofit {
        return Retrofit.Builder().baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create()).build()
    }

    @Singleton
    @Provides
    fun provideProductsAPI(retrofit: Retrofit): ProductService {
        return retrofit.create(ProductService::class.java)
    }


}