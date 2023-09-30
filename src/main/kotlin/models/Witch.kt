package models

class Witch(name: String): Creature(
    name,
    attack = 23,
    defence = 19,
    maxHealth = 40,
    damage = (10..15)
) {
}