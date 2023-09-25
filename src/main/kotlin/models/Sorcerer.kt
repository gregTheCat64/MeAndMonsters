package models

class Sorcerer(name: String): Creature(
    name,
    attack = 30,
    defence = 15,
    maxHealth = 35,
    damage = (1..20)
) {
}