
// Product.kt
package com.example.pos.data.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "products")
data class Product(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val name: String,
    val description: String,
    val price: Double,
    val quantity: Int,
    val categoryId: Int,
    val imageUrl: String?,
    val isSold: Boolean = false
)