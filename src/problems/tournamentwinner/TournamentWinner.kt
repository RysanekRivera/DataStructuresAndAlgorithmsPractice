package problems

fun main() {
    val competitions = listOf(listOf("HTML", "C#"), listOf("C#", "Python"), listOf("Python", "HTML"))
    val results = listOf(0, 0, 1)
    
    println(tournamentWinner(competitions, results))
}

const val HOME_TEAM_WON = 1
const val SCORE_POINTS = 3
fun tournamentWinner(competitions: List<List<String>>, results: List<Int>): String {
    var currentBestTeam = ""
    val scores = mutableMapOf(currentBestTeam to 0)
    
    for (teams in competitions.indices) {
        val competition = competitions[teams]
        val result = results[teams]
        
        val (homeTeam, awayTeam) = competition
        
        val winningTeam = if (result == HOME_TEAM_WON) homeTeam else awayTeam
        
        updateScores(winningTeam, scores)
        
        if (scores[winningTeam]!! > scores[currentBestTeam]!!) currentBestTeam = winningTeam
    }
    
    return currentBestTeam
}

private fun updateScores(team: String, scores: MutableMap<String, Int>) {
    if (team !in scores) scores[team] = 0
    scores[team] = scores[team]!! + SCORE_POINTS
 }
