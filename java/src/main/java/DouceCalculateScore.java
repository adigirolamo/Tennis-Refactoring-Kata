public class DouceCalculateScore implements CalculateScore{

    public String result(int s1, int s2)
    {
        String score;
        switch (s1)
        {
            case 0:
                score = "Love-All";
                break;
            case 1:
                score = "Fifteen-All";
                break;
            case 2:
                score = "Thirty-All";
                break;
            default:
                score = "Deuce";
                break;

        }

        return score;
    }
}
