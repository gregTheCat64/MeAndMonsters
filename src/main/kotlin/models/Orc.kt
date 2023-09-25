package models

class Orc(name: String): Creature(
    name,
    attack = 22,
    defence = 20,
    maxHealth = 30,
    damage = (5..10)
) {
}