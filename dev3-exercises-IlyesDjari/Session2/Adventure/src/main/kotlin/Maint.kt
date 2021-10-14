fun main() {
    challengeOne()
}

fun challengeOne() {
    println("Challenge 1")
    println("To which of the 12 of the most famous pyramids in Egypt do you want to head?")
    val answers = setOf<String>("Lahun","Userkaf","Hawara", "Teti", "Unas", "Meidum", "Menkaure", "Djoser", "Bent", "Red", "Khafre","Khufu")
    val userAnswer = readLine()
    if(answers.contains(userAnswer)) {
        win(userAnswer)
    } else {
        gameover()
    }
}

fun win (userAnswer: String?) {
    println("Congrats, you found the way trough the desert to the pyramid of $userAnswer.")
    challengeTwo()
}

fun gameover() {
    println("Game over, you didn't found your way to a pyramid and you died in the hot dessert.")
}

fun challengeTwo() {
    println("At the entry of this pyramid they are two different entrances, which one will you choose? Left or Right?")

    val diceResult = (1..6).random()
    val userAnswer = readLine()
    var acceptedAnswers = setOf<Int>()
    if (userAnswer == "Left") {
        acceptedAnswers = setOf(1, 2, 3)
    } else {
        acceptedAnswers = setOf(4, 5, 6)
    }

    if (acceptedAnswers.contains(diceResult)) {
        winTwo();
    } else {
        lostTwo()
    }
}

fun winTwo() {
    println("You chose the good entrance and entered the mystic pyramid with your burning torch.")
    challengeThree()
}

fun lostTwo() {
    println("The entrance just fell apart on you, it was a trap! You died while suffering.")
}

fun challengeThree() {
    println("In the darkness of the alley you're exploring you hear a strange noise. You have a list of items in" +
            "your backpack which one will you use? Sword, Arch or Book? ")

}