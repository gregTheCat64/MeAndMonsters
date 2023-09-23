package models

class Witch: Creature(
    attack = 25,
    defence = 15,
    maxHealth = 40,
    damage = (2..10)
) {
}