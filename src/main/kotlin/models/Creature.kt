package models

abstract class Creature (
    val name: String,
    val attack: Int,
    val defence: Int,
    val maxHealth: Int,
    var health: Int = maxHealth,
    val damage: IntRange
        ){
    fun attack(creature: Creature){
        val attackModifier = attack - (creature.defence + 1)
        val currentDamage = this.damage.random()
        if (rollingTheDice(attackModifier)){
            creature.health = creature.health - currentDamage

        }
    }

    private fun rollingTheDice(n: Int): Boolean{
        for (i in 1..n){
            val number = (0..6).random()
            if (number==5 || number == 6) return true
        }
        return false
    }

    override fun toString(): String {
        return ""
    }
}