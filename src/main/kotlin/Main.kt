fun main() {
    val likes = 111
    val lastCharacter = likes % 10
    val twoLastCharacters = likes % 100
    val peopleOrHuman = if (lastCharacter == 1 && twoLastCharacters != 11) "человеку" else "людям"
    println("Понравилось $likes $peopleOrHuman")
}