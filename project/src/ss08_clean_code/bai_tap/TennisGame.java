package ss08_clean_code.bai_tap;

public class TennisGame {
    public static String getScore(String playerOneName, String playerTwoName, int scoreOfPersonOne, int scoreOfPersonTwo) {
        if (scoreOfPersonOne == scoreOfPersonTwo) {
            return displayScore(scoreOfPersonOne);
        } else if (scoreOfPersonOne >= 4 || scoreOfPersonTwo >= 4) {
            return displayScoreCase2(scoreOfPersonOne, scoreOfPersonTwo);
        } else {
            return displayScoreCase3(scoreOfPersonOne, scoreOfPersonTwo);
        }
    }

    private static String displayScore(int scoreOfPersonOne) {
        switch (scoreOfPersonOne) {
            case 0:
                return "Love-All";
            case 1:
                return "Fifteen-All";
            case 2:
                return "Thirty-All";
            case 3:
                return "Forty-All";
            default:
                return "Deuce";
        }
    }

    private static String displayScoreCase2(int scoreOfPersonOne, int scoreOfPersonTwo) {
        int scoreOfPersonOneMinusPersonTwo = scoreOfPersonOne - scoreOfPersonTwo;
        if (scoreOfPersonOneMinusPersonTwo == 1) {
            return "Advantage player1";
        } else if (scoreOfPersonOneMinusPersonTwo == -1) {
            return "Advantage player2";
        } else if (scoreOfPersonOneMinusPersonTwo >= 2) {
            return "Win for player1";
        } else {
            return "Win for player2";
        }
    }

    private static String displayScoreCase3(int scoreOfPersonOne, int scoreOfPersonTwo) {
        int tempScore = 0;
        String result = "";
        for (int numberPlayer = 1; numberPlayer < 3; numberPlayer++) {
            if (numberPlayer == 1) {
                tempScore = scoreOfPersonOne;
            } else {
                result += "-";
                tempScore = scoreOfPersonTwo;
            }
            switch (tempScore) {
                case 0:
                    result += "Love";
                    break;
                case 1:
                    result += "Fifteen";
                    break;
                case 2:
                    result += "Thirty";
                    break;
                case 3:
                    result += "Forty";
                    break;
            }
        }
        return result;
    }
}
