import models.Hero
import models.Orc
import models.Sorcerer
import models.Witch

fun main (){
    val hero = Hero("Grigorio")

    val orc = Orc("evil orc")
    val witch = Witch("evil woman")
    val sorcerer = Sorcerer("evil man")

    orc.attack(hero)
    hero.cureMyself()
    hero.attack(orc)

    while ()
}