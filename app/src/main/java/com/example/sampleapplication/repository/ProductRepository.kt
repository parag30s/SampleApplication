package com.example.sampleapplication.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.sampleapplication.model.ProductsItem
import com.example.sampleapplication.network.ProductService
import javax.inject.Inject

class ProductRepository @Inject constructor (private val productService: ProductService) {
    private val _products = MutableLiveData<List<ProductsItem>>()
    val products: LiveData<List<ProductsItem>>
    get() = _products

    suspend fun getProducts(){
        val response = productService.getProducts()
        if(response.isSuccessful && response.body() != null){
            _products.value = response.body()
        }
    }
}