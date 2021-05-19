
/**
 * Write a description of class MovieGenre here.
 *
 * @Gregory McCoy
 * @5/18/21
 */
public class MovieGenre extends Movie
{
    private String genre;
    public MovieGenre(String name, int length, String genre)
    {
        super(name, length);
        this.genre = genre;
    }
    public String getGenre()
    {
        return this.genre;
    }
    public String rating()
    {
        String rating;
        if(genre.equals("horror")){
            rating = "R";
        }
        else if(genre.equals("action")){
            rating = "PG-13";
        }
        else if(genre.equals("comedy")){
            rating = "PG";
        }
        else{
            rating = "PG";
        }
        return super.getName() + " is rated " + rating;
    }
    @Override
    public String toString(){
        return "The " + genre + " movie, " + super.toString();
    }
}
