fun main(){
 println("How much words do you want to translate?")
 val number = readLine()!!
 println("Enter one of the available languages:")
 println("French & English")
 val language = readLine()!!
 val duolingo = Duolingo(number ,language)
 duolingo.play()
}
