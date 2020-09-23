class Skill(val name:String, val atkKeisu:Double, val defKeisu:Double, val mp:Int){
}

val allSkills = arrayOf(
        Skill("punch", 1.0, 0.0, 0),
        Skill("kick", 0.5, 0.0, 0),
        Skill("defence", 0.0, 0.50, 0),
        Skill("mera", 1.5, 0.0, 5)
)