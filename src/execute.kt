fun main(args: Array<String>){
    val mikata = Shujinko1(name="mikata", usableSkills = arrayOf("punch", "kick"))
    val teki = Enemy1(name="teki", usableSkills = arrayOf("kick", "punch"))
    var count = 1

    println("${mikata.name} vs ${teki.name}")

    do{
        println("${count++}ターン目！")
        mikata.action(teki, allSkills[3])       //攻撃のやつ
        teki.action(mikata, allSkills[1])       //攻撃のやつ2

        mikata.def = 0.0        //defの初期化的なアレ
        teki.def = 0.0
        println()
    }while(mikata.isAlive&&teki.isAlive)
}