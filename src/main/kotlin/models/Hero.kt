package models

import kotlin.math.roundToInt

class Hero(name: String): Creature(
    name,
    attack = 24,
    defence = 19,
    maxHealth = 50,
    damage = (10..20)
) {
    fun cureMyself(){
        val newHealthLevel = health + (maxHealth*0.3).roundToInt()
        this.health = if (newHealthLevel<=maxHealth) newHealthLevel else maxHealth
        println("Здоровье восстановлено, HP: $health")
    }
}