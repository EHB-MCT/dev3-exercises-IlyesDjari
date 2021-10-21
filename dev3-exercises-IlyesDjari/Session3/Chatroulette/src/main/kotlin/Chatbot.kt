class Chatbot (override val name:String): Person(name), Talk{
    override fun chat(){
        shit()
    }
    fun shit(){
        println("Life is life, lalaaaalaalalaaa")
    }
}