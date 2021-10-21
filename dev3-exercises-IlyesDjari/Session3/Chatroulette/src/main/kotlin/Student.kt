class Student (override val name:String): Person(name), Talk{
    override fun chat(){
        gossip()
    }
    private fun gossip(){
        println("Today we've been coding the whole day")
    }
}