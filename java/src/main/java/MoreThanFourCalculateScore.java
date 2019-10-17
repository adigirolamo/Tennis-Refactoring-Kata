public class MoreThanFourCalculateScore implements CalculateScore {

    public String result(int s1, int s2)
    {
        int minusResult = s1 - s2;
        String score;
        if (minusResult == 1)
            score = "Advantage player1";
        else if (minusResult == -1)
            score = "Advantage player2";
        else if (minusResult >= 2)
            score = "Win for player1";
        else
            score = "Win for player2";

        return score;
    }
}
