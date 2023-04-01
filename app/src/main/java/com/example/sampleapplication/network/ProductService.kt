package com.example.sampleapplication.network

import com.example.sampleapplication.model.Products
import com.example.sampleapplication.model.ProductsItem
import retrofit2.Response
import retrofit2.http.GET

interface ProductService {

    @GET("products")
    suspend fun getProducts(): Response<List<ProductsItem>>
}