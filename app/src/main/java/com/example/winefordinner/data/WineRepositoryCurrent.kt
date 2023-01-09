package com.example.winefordinner.data

class WineRepositoryCurrent : WineRepositoryCommon {

    val listWine = mutableListOf(
        Wine.Base(
            1,
            "Саперави",
            "Узунов",
            0,
            "плов, мясо, гуляш, хамон",
                    ),
        Wine.Base(
            2,
            "Красностоп",
            "Ведерников",
            0,
            "плов, стейк, мясо, гуляш",
        ),
        Wine.Base(
            3,
            "Игристое Сибирьковый",
            "Ведерников",
            0,
            "роллы, суши, морепродукты, креветки",
        ),
        Wine.Base(
            4,
            "Совиньон блан",
            "Taka",
            0,
            "курица, рыба, морепродукты, телятина, форель",
        )

    )


    override fun getchoiceWine(): Wine.Base? {
        val wineResult : Wine.Base
        val suitableWineList = listWine.filter { it.suitableFood.contains("рыба") }
        if (suitableWineList.isNotEmpty()) {
            wineResult = suitableWineList.random()
            return wineResult
        } else {
            return null
        }
    }
}
