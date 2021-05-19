
/**
 * Write a description of class InheritanceTest here.
 *
 * @Gregory McCoy
 * @5/18/21
 */
public class InheritanceTest
{
    public static void main(String[] args)
    {
        Movie avatar = new Movie("Avatar", 162);        
        MovieGenre napoleonDynamite = new MovieGenre("Napoleon Dynamite", 96, "comedy");
        MovieScore theShining = new MovieScore("The Shining", 146, "horror", 8.4);
        System.out.println(avatar);
        System.out.println(napoleonDynamite);
        System.out.println(theShining);
        System.out.println(theShining.rating() + theShining.isGood());
    }
}
