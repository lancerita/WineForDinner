package com.example.winefordinner.data

import com.example.winefordinner.domain.Mapper

interface Wine {

    fun <T> map(mapper: Mapper<T>): T

     open class Base(
        private val id: Int,
        private val name: String,
        private val winery: String,
        private val image: Int,
        val suitableFood: String
    ) : Wine {

        override fun <T> map(mapper: Mapper<T>): T =
            mapper.map(id, name, winery, image, suitableFood)

    }
}

