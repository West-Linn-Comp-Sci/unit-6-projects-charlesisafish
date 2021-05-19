
/**
 * Write a description of class MovieScore here.
 *
 * @Gregory McCoy
 * @5/18/21
 */
public class MovieScore extends MovieGenre
{
    private double score;
    public MovieScore(String name, int length, String genre, double score)
    {
        super(name, length, genre);
        this.score = score;
    }
    public double getScore()
    {
        return score;
    }
    public String isGood()
    {
        if(score > 5){
            return " and was a great movie";
        }
        else{
            return " and was not a good movie";
        }
    }
    @Override
    public String toString()
    {
        return super.toString() + " and is an " + score + "/10";
    }
}
