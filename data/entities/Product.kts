package com.example.pos.data.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "products")
data class Product(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val name: String,
    val category: String,
    val price: Double,
    val quantity: Int,
    val sold: Boolean = false,
    val imageUri: String? = null // To store the image URI of the product
)
