package models

class Orc: Creature(
    attack = 22,
    defence = 20,
    maxHealth = 30,
    damage = (5..10)
) {
}