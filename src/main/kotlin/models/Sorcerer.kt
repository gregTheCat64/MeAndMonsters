package models

class Sorcerer(name: String): Creature(
    name,
    attack = 30,
    defence = 17,
    maxHealth = 35,
    damage = (5..20)
) {
}