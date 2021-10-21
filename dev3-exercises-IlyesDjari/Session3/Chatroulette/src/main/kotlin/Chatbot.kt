class Chatbot(val name: String): Talk{
    override fun introduce(){
        println("Hello! I'm $name")
    }
    override fun chat(){
        println("Life is life, LAAAALAAAALAALALAAA")
    }
}