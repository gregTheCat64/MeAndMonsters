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
        if (isAttackSucceed(attackModifier)){
            println("Успех атаки! \n" +
                    "Нанесен ущерб: $currentDamage")
            creature.health = creature.health - currentDamage
        } else println("Атака отбита")
    }

    private fun isAttackSucceed(n: Int): Boolean{
            //Принты и слипы здесь для тестирования бросков. После их следует удалить
        println("У нападающего есть $n бросков кубика")
        println("Кидаем кубик")
        Thread.sleep(1000)
        var i = 1
        do {
            i++
            val number = (1..6).random()
            println("выпало $number")
            Thread.sleep(1000)
            if (number==5 || number == 6) return true
        } while (i <= n)

        return false
    }

    override fun toString(): String {
        return "$name, ATK: $attack, DEF: $defence, HP: $health, DMG: $damage"
    }
}