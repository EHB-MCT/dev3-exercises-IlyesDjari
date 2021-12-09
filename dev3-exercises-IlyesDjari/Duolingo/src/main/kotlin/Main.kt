fun main()  {
 println("Which level of difficulty would you want to try? Easy/Hard ")
 val answer = readLine().toString()
 if(answer != "Easy" && answer != "Hard")  {
  throw Exception("Please provide a valid level. Easy or Hard")
 } else  {
  val duolingo = Duolingo(3,"fr")
  duolingo.play(answer)
 }
}