// AppDatabase.kt
package com.example.pos.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.pos.data.dao.ProductDao
import com.example.pos.data.dao.CategoryDao
import com.example.pos.data.entities.Product
import com.example.pos.data.entities.Category

@Database(entities = [Product::class, Category::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun productDao(): ProductDao
    abstract fun categoryDao(): CategoryDao
}