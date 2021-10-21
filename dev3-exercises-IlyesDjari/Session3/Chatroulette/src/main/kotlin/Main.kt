fun main(){
    val persons = arrayOf(Student("Ilyes"), Teacher("Bert"), Comedian("Benoit"))
    val person = persons.random()
    person.introduce()
    person.chat()
}
