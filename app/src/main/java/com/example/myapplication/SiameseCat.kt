package com.example.myapplication

class SiameseCat(override val weight: Double, override val age: Int) : Cat {
    override val behaviorType = BehaviorType.ACTIVE
}