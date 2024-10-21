package com.example.myapplication

class Corgi(override val weight: Double, override val age: Int) : Dog {
    override val biteType = BiteType.OVERBITE  // У корги может быть перекус
}