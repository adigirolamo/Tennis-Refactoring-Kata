public class TennisScoreFlow {

    public static TennisFlow whichFlow(int m_score1, int m_score2)
    {
        TennisFlow flow;

        if (m_score1==m_score2)
        {
            flow = TennisFlow.DEUCE;
        }
        else if (m_score1>=4 || m_score2>=4)
        {
            flow = TennisFlow.MORE_THAN_FOUR_POINTS;
        }
        else
        {
            flow = TennisFlow.LESS_THAN_FOUR_POINTS;
        }

        return flow;
    }
}
