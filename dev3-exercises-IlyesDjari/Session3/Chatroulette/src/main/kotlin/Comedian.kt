class Comedian (override val name:String): Person(name), Talk{
    override fun chat(){
        tellJoke()
    }
    fun tellJoke(){
        println("Java > Kotlin hahaha")
    }
}