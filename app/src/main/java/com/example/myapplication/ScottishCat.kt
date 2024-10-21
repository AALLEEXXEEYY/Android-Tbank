package com.example.myapplication

class ScottishCat(override val weight: Double, override val age: Int) : Cat {
    override val behaviorType = BehaviorType.PASSIVE
}