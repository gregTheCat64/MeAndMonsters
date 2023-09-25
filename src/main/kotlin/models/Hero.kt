package models

import kotlin.math.roundToInt

class Hero(name: String): Creature(
    name,
    attack = 30,
    defence = 19,
    maxHealth = 50,
    damage = (10..20)
) {
    fun cureMyself(){
        val newHealthLevel = health + (health*0.3).roundToInt()
        this.health = if (newHealthLevel<=maxHealth) newHealthLevel else maxHealth
    }
}