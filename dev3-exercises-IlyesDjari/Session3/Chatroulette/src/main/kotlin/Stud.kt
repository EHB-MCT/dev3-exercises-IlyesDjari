class Stud (override val name:String): Person(name), Talk{
    override fun chat(){
        web()
    }
    fun web(){
        println("We finally learned about NodeJS today !")
    }
}