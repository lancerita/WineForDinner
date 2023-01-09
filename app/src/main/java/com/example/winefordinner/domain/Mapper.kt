 package com.example.winefordinner.domain

interface Mapper <T> {

    fun map(id: Int, name: String, winery: String, image: Int, suitableFood: String): T
}
