package com.rosemuhando.harakamall.repository

import android.content.Context
import com.rosemuhando.harakamall.data.ProductDatabase
import com.rosemuhando.harakamall.model.Product

class ProductRepository(context: Context) {
    private val productDao = ProductDatabase.getDatabase(context).productDao()

    suspend fun insertProduct(product: Product) {
        productDao.insertProduct(product)
    }

    fun getAllProducts() = productDao.getAllProducts()

    suspend fun deleteProduct(product: Product) = productDao.deleteProduct(product)
}