class Skill(val name:String, val atkKeisu:Double, val defKeisu:Double, val mp:Int){
}

val allSkills = arrayOf(
        Skill(name = "punch", atkKeisu = 1.0, defKeisu = 0.0, mp = 0),
        Skill(name = "kick", atkKeisu = 0.5, defKeisu = 0.0, mp = 0),
        Skill(name = "defence", atkKeisu = 0.0, defKeisu = 0.50, mp = 0),
        Skill(name = "mera", atkKeisu = 1.5, defKeisu = 0.0, mp = 5)
)