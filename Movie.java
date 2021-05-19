
/**
 * Write a description of class Movie here.
 *
 * @Gregory McCoy
 * @5/18/21
 */
public class Movie
{
    private String name;
    private int length;

    public Movie(String setName, int setLength)
    {
        name = setName;
        length = setLength;
    }
    public String getName()
    {
        return name;
    }
    public int getLength()
    {
        return length;
    }
    public String watchMovie()
    {
        return "wow, just finished " + name;
    }
    public double numHours()
    {
        return length/60;
    }
    @Override
    public String toString()
    {
        return name + " is " + length + " minutes long";
    }
}
