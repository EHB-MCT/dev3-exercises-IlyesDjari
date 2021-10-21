class Student (override val name:String): Person(name), Talk{
    override fun chat(){
        day()
    }
    fun day(){
        println("Today we've been coding the whole day")
    }
}