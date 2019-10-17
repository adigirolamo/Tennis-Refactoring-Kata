public class FactoryCalculateScore {

    public static CalculateScore getInstance( TennisFlow tennisFlow)
    {
        CalculateScore c;
        switch (tennisFlow)
        {
            case DEUCE:
                c = new DouceCalculateScore();
                break;
            case MORE_THAN_FOUR_POINTS:
                c = new MoreThanFourCalculateScore();
                break;
            default:
            case LESS_THAN_FOUR_POINTS:
                c = new LessThanFourCalculateScore();
                break;
        }

        return c;
    }
}
