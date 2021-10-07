fun main(args: Array<String>) {
    print("Make your choice; Rock, Paper or Scissors? ")
    val user = readLine()
    doit("$user")
}

fun doit(user:String) {

    val options = arrayOf("Rock","Paper","Scissors")
    val pos = (0..2).random()
    val res = options.elementAt(pos)
    val out = "You chose $user and the computer $res so"

    when {
        user == "Rock" && pos == 1 || user == "Scissors" && pos == 0 || user == "Paper" && pos == 2-> println("$out you've lost")
        user == "Rock" && pos == 2 || user == "Paper" && pos == 0 || user == "Scissors" && pos == 1 -> println("$out you've won")
        user == res -> println("$out it's a draw")

    }
}
