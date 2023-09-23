package models

class Hero: Creature(
    attack = 30,
    defence = 19,
    maxHealth = 50,
    damage = (10..20)
) {
    fun cureMyself(){

    }
}