fun main(){
    val persons = arrayOf(Student("Ilyes"), Teacher("Bert"))
    val person = persons.random()
    person.introduce()
    person.chat()
}
