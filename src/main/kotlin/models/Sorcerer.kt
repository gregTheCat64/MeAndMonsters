package models

class Sorcerer: Creature(
    attack = 30,
    defence = 15,
    maxHealth = 35,
    damage = (1..20)
) {
}