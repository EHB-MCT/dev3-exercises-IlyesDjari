class Morewords(var words: Set<Word>) {
    fun filterByLanguage(language: String)  {
        words = words.filter { it.language == language }.toMutableSet()
    }
    fun filterByDifficulty(difficulty: Int)  {
        words = words.filter { it.difficulty == difficulty }.toMutableSet()
    }
}