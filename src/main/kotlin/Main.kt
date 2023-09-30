import models.*
import java.util.Scanner

const val separateLine = "________________________________"
const val shortPause = 1000L
const val longPause = 2000L

var beatedMonsters = 0
var healBottles = 4


fun main() {

    val hero = Hero("Hero")

            //Пролог
    println("Добрый день путник! Вы путешествуете по безграничному простору королевства.\n")
    Thread.sleep(shortPause)
    println("¸,¤°´'`°•.¸¸.•°´'`°¤,¸\n")
    Thread.sleep(shortPause)
    println("На вашем пути попадаются самые разнообразные создания.\n")


    Thread.sleep(shortPause)
    println("Ваша миссия истребить как можно больше чудовищ!\n")
    Thread.sleep(shortPause)
    println( "В вашем распоряжении 4 исцеляющих элексира. \n")
    Thread.sleep(shortPause)
    println( "Пользуйтесь ими с умом")

    while (true) {

        val orc = Orc("Evil orc")
        val witch = Witch("Evil woman")
        val sorcerer = Sorcerer("Evil man")

        val monsters = arrayOf(orc, witch, sorcerer)



            //Выбираем текущего монстра:
        val currentMonster = monsters.random()
        println(separateLine)
        Thread.sleep(shortPause)
        println("\n ┌∩┐(◣_◢)┌∩┐")
        println("В долгом странствии вы повстречали Монстра: \n $currentMonster \n")
        Thread.sleep(shortPause)
        println("Ваши параметры: \n $hero \n")
        Thread.sleep(shortPause)
        playTheGame(hero, currentMonster)


        if (hero.health <= 0) {
            println("(｡◕‿◕｡)")
            println("\n *** КОНЕЦ ИГРЫ ***")
            return
        }

    }

}


fun playTheGame(hero: Hero, monster: Creature) {
    while (true) {
        val scanner = Scanner(System.`in`)

            //НАША АТАКА
        println("\nВыберите действие: ")

        if (healBottles > 0) {
            println("1. Атаковать 2. Излечиться")
            when (scanner.nextInt()) {
                1 -> {
                    hero.attack(monster)
                    Thread.sleep(shortPause)
                    println("Здоровье врага: ${monster.health}")

                }

                2 -> {
                    healBottles--

                    hero.cureMyself()
                    Thread.sleep(shortPause)
                    println("Элексиров осталось: $healBottles")

                }
            }
        } else {
            println("1. Атаковать")
            when (scanner.nextInt()) {
                1 -> {
                    hero.attack(monster)
                    Thread.sleep(shortPause)
                    println("Здоровье врага: ${monster.health}")

                }
            }
        }


            if (isMonsterDead(monster)) return

             //АТАКА врага
            Thread.sleep(shortPause)
            println("Противник атакует вас")
            Thread.sleep(shortPause)
            println("♥~√v”^√~√v^√v’^~√♥")
            Thread.sleep(longPause)
            monster.attack(hero)
            Thread.sleep(shortPause)
            println("Ваше здоровье: " + hero.health)
            Thread.sleep(longPause)

            if (isHeroDead(hero)) return


        }
    }


fun isHeroDead(hero: Hero): Boolean {
    if (hero.health <= 0) {
        println("Вы доблестно воевали, но проиграли в тяжёлом бою ")
        Thread.sleep(shortPause)
        println("(✖╭╮✖)")
        Thread.sleep(shortPause)
        println("От вашей тяжелой руки сгинуло $beatedMonsters безобразных созданий")
        return true
    }
    return false
}

fun isMonsterDead(monster: Creature): Boolean {
    if (monster.health <= 0) {
        println("В героическом сражении вы повергли врага ")
        println("◕‿◕✿")
        beatedMonsters++
        Thread.sleep(shortPause)
        return true
    }
    return false
}