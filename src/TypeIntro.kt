const val MAX_EXPERIENCE: Int = 5000

fun main(args: Array<String>) {
    val playerName = "Estragon"
    var experiencePoints = 5

    var hasSteed = false
    var publican = "Taro"
    var gold = 100
    val drinks = listOf("mead", "wine", "LaCroix")

    experiencePoints += 5

    println(message = experiencePoints)
    println(message = playerName)

    println(message = playerName.reversed())
}