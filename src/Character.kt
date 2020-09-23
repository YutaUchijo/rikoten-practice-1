abstract class Character(val name:String, val usableSkills:Array<String>){
    abstract val hpLimit:Int
    abstract var hp:Int
        /*set(value){
            field = value
            if(value<=0) isAlive = false
        }*/
    abstract val mpLimit:Int
    abstract var mp:Int
    abstract val atk:Double
    var def:Double = 0.0
    var isAlive = true

    fun action(enemy:Character, skill:Skill) {
        if (enemy.isAlive&&isAlive){
            val damage = atk * skill.atkKeisu * (1.0-enemy.def)   //技の処理等の計算とその結果表示
            enemy.hp -= damage.toInt()
            def = skill.defKeisu
            mp -=skill.mp
            println("${name}はmpを${skill.mp}消費して「${skill.name}」を使った！${enemy.name}に${damage.toInt()}のダメージ！")
            println("${enemy.name}の残りhpは${enemy.hp}に、${name}の残りmpは${mp}になった！")

            if(enemy.hp <= 30 && enemy.isAlive){             //hpが30以下になったときの追加メッセージ
                println("${enemy.name}は行き絶え絶えだ。。")
            }

            if (enemy.hp <= 0){             //enemyが死んだときの処理
                println("${enemy.name}は死んでしまった！")
            }
        }
    }

}

class Shujinko1(name:String, usableSkills: Array<String>): Character(name, usableSkills){
    override val hpLimit:Int = 100
    override var hp:Int = 100
    override val mpLimit: Int = 30
    override var mp: Int = 30
    override val atk: Double = 10.0
}