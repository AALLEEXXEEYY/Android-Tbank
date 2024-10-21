package com.example.myapplication

class ZooShop {

    fun identifyAnimal(animal: Animal): String {
        return when (animal) {
            is Dog -> "Это собака породы: ${animal::class.simpleName}, тип прикуса: ${animal.biteType}"
            is Cat -> "Это кошка породы: ${animal::class.simpleName}, тип поведения: ${animal.behaviorType}"
            else -> "Неизвестное животное"
        }
    }
}