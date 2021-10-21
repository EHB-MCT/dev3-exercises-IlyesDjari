fun main(){
    val persons = arrayOf(Student("Ilyes"), Teacher("Bert"), Comedian("Benoit"), Chatbot("ShitBot"))
    val person = persons.random()
    person.introduce()
    person.chat()
}
