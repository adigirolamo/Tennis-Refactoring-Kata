public class LessThanFourCalculateScore implements CalculateScore {
    @Override
    public String result(int s1, int s2) {
        String score= "";
        int tempScore=0;
        for (int i=1; i<3; i++)
        {
            if (i==1) tempScore = s1;
            else { score+="-"; tempScore = s2;}
            switch(tempScore)
            {
                case 0:
                    score+="Love";
                    break;
                case 1:
                    score+="Fifteen";
                    break;
                case 2:
                    score+="Thirty";
                    break;
                case 3:
                    score+="Forty";
                    break;
            }
        }

        return score;
    }
}
