package models

class Witch(name: String): Creature(
    name,
    attack = 25,
    defence = 15,
    maxHealth = 40,
    damage = (2..10)
) {
}