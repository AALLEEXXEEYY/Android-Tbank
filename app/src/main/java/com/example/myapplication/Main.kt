package com.example.myapplication

    fun main() {
        val zooShop = ZooShop()

        val husky = Husky(weight = 25.0, age = 3)
        val corgi = Corgi(weight = 15.0, age = 2)
        val scottishCat = ScottishCat(weight = 4.0, age = 1)
        val siameseCat = SiameseCat(weight = 3.5, age = 2)

        println(zooShop.identifyAnimal(husky))
        println(zooShop.identifyAnimal(corgi))
        println(zooShop.identifyAnimal(scottishCat))
        println(zooShop.identifyAnimal(siameseCat))
    }

