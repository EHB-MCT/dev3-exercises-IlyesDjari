class FrenchWord(
    override val original: String,
    override var difficulty: Int,
    override val translation: String):Word(original, translation , difficulty, "fr"){
}