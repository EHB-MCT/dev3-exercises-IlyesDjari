class Duolingo(private val size: Int = 5, val language: String="eng") {

    private val words = setOf<Word>(Word("Jouer","Spelen", 2,"French"),
        Word("Coder","Coderen", 1,"French"),
        Word("Dormir","Slapen", 2,"French"),
        Word("Regarder","Kijken", 2,"French"),
        Word("Marcher","Stappen", 1,"French"),
        Word("Charger","Opladen", 1,"French"),
        Word("Ecrire","Schrijven", 1,"French"),
        Word("Manger","Eten", 2,"French"),
        Word("Appeller","Bellen", 1,"French"),
        Word("Ecouter","Luisteren", 1,"French"),
        Word("Play","Spelen", 2,"English"),
        Word("Code","Coderen", 1,"English"),
        Word("Sleep","Slapen", 2,"English"),
        Word("Watch","Kijken", 1,"English"),
        Word("Walk","Stappen", 2,"English"),
        Word("Charge","Opladen", 1,"English"),
        Word("Write","Schrijven", 1,"English"),
        Word("Eat","Eten", 1,"English"),
        Word("Call","Bellen", 2,"English"),
        Word("Listen","Luisteren", 1,"English"))

    fun play(answer: String) {
        val randomWords = words.shuffled().take(size).toMutableSet()

        while (randomWords.isNotEmpty())  {
            val selectedWord = randomWords.random()

            if (answer == "Hard") {
                selectedWord.difficulty = 2
            } else {
                selectedWord.difficulty = 1
            }

            println("The selected difficulty is " + selectedWord.difficulty)
            println("")
            println("Could you translate the following word: " + selectedWord.original)
            println("")
            val answer = readLine()

            if(answer == selectedWord.translation)  {
                randomWords.remove(selectedWord)
                if (selectedWord.difficulty > 0) {
                    selectedWord.difficulty = 2
                } else {
                    throw Exception("The difficulty is too low has to be 1 or 2")
                }


            }  else if (answer != selectedWord.translation) {
                println("The correct answer was ${selectedWord.translation}")
                println("")
                selectedWord.difficulty = 1
                
            }
            println("Words left to translate: ${randomWords.count()}")
        }
    }
}