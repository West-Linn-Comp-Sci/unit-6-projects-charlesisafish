
/**
 * Write a description of class ChessBoard1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ChessBoard1
 
{
    public static void main(String[] args)
    {
        //Create an 8x8 2D String array called chess.
        String[][] chess = {{"Rook", "Knight", "Bishop", "Queen", "King", "Bishop", "Knight", "Rook"}, {"pawn", "pawn", "pawn", "pawn", "pawn", "pawn", "pawn", "pawn"}, {"-", "-", "-", "-", "-", "-", "-", "-"}, {"-", "-", "-", "-", "-", "-", "-", "-"}, {"-", "-", "-", "-", "-", "-", "-", "-"}, {"-", "-", "-", "-", "-", "-", "-", "-"}, {"pawn", "pawn", "pawn", "pawn", "pawn", "pawn", "pawn", "pawn"}, {"Rook", "Knight", "Bishop", "Queen", "King", "Bishop", "Knight", "Rook"}};
        
        //Use this method to print the chess board onto the console
        print(chess);
    }
    
    //Do not make alterations to this method!
    public static void print(String[][] array)
    {
        for(String[] row: array)
        {
            for(String thing: row)
            {
                System.out.print(thing + "\t");
            }
            System.out.println();
        }
    }
}
