class Teacher (override val name:String): Person(name), Talk{
    override fun chat(){
        funFact()
    }
    private fun funFact(){
        println("Kotlin is so fun!")
    }
}