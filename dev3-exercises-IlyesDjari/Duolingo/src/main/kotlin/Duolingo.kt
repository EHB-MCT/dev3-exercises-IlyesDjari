class Duolingo(
    private val number: String,
    private val language: String) {

    // Making a mutable ListOf -> so order is mutable and can be changed
    private val words = mutableListOf<Word>(Word("Jouer","Spelen","French"),
        Word("Coder","Coderen","French"),
        Word("Dormir","Slapen","French"),
        Word("Regarder","Kijken","French"),
        Word("Marcher","Stappen","French"),
        Word("Charger","Opladen","French"),
        Word("Ecrire","Schrijven","French"),
        Word("Manger","Eten","French"),
        Word("Appeller","Bellen","French"),
        Word("Ecouter","Luisteren","French"),
        Word("Play","Spelen","English"),
        Word("Code","Coderen","English"),
        Word("Sleep","Slapen","English"),
        Word("Watch","Kijken","English"),
        Word("Walk","Stappen","English"),
        Word("Charge","Opladen","English"),
        Word("Write","Schrijven","English"),
        Word("Eat","Eten","English"),
        Word("Call","Bellen","English"),
        Word("Liste,","Luisteren","English"))

    fun play() {

        // Returns list only of matching language == language
        val list = words.filter {
            it.language == language
        }

        // Randomly shuffles the order list and chooses 5 first words, convert number to Int number
        val currentWords = list.shuffled().take(number.toInt()).toMutableSet()

        // When a number of words is chosen program will start
        while (currentWords.isNotEmpty()){
            // Gets a random word
            val selectedWord = currentWords.random()
            println(
                "Could you translate the following word for me?: "+
                        selectedWord.original
            )

            // Waits for user response
            val yourAnswer = readLine()

            // If the user has a correct answer he gets a positive message back
            if(selectedWord.translation.contains(yourAnswer.toString())){
                println(
                    "Great job you're amazing! Continue like that."
                )
                // remove the word of the list
                currentWords.remove(selectedWord)
            // User failed so he receives the answer
            } else {
                println(
                    "Mission failed return to base, we'll have him later. The answer was " + selectedWord.translation
                )
            }
            // Shows how many words are left to translate
            println(currentWords.count())
        }
        println("You're done practising for today :)")
      }
    }

