class Teacher (override val name:String): Person(name), Talk{
    override fun chat(){
        web()
    }
    fun web(){
        println("Kotlin is so fun!")
    }
}