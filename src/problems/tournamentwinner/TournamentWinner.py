# O(n) \ O(k)
HOME_TEAM_WON = 1
SCORE_POINTS = 3


def tournamentWinner(competitions, results):
    currentBestTeam = ""
    scores = {currentBestTeam: 0}

    for team, competition in enumerate(competitions):
        result = results[team]
        homeTeam, awayTeam = competition

        winningTeam = homeTeam if result == HOME_TEAM_WON else awayTeam

        updateScores(winningTeam, scores)

        if scores[winningTeam] > scores[currentBestTeam]:
            currentBestTeam = winningTeam

        return currentBestTeam


def updateScores(team, scores):
    if team not in scores:
        scores[team] = 0

    scores[team] += SCORE_POINTS
