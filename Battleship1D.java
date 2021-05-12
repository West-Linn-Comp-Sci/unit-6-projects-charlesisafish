import java.util.Scanner;
import java.util.Random;
/**
 * The battle ship program creates a battleship program and allows a user
 * to guess spaces of the single line array grid to see if it is a hit
 * or a miss. The game ends when all hits are found and the user is given
 * a rating depending on how many turns they took.
 *
 * @Gregory
 * @
 */
public class Battleship1D
{
    private boolean[] grid;
    private int guess;
    private boolean ships;
    private int rating;
    private int setup;
    private int counter;
    private int shipCounter;
    Scanner input = new Scanner(System.in);
    public Battleship1D(){
        grid = new boolean[7];
        setup = (int)(Math.random() * 7);
        ships = true;
        shipCounter=3;
        counter = 0;
        for(int i=0; i<7; i++){
            grid[i] = false;
        }
        for(int i=setup; i<=setup+2; i++){
            grid[i] = true;
        }
        System.out.println("To make a guess, enter a number 0-6"); 
    }
    public void play(){
        while(ships){
            System.out.println("Make a guess");
            guess = input.nextInt();
            if(grid[guess]){
                grid[guess] = false;
                System.out.println("Hit!");
                shipCounter--;
            }
            else{
                System.out.println("Miss");
            }
            counter++;
            if(shipCounter==0){
                ships = false;
            }
        }
        if(counter<4){
            rating = 3;
        }
        else if(counter<6){
            rating = 2;
        }
        else{
            rating = 1;
        }
        System.out.println("Great! You sunk the battleship and your rating is " + rating + "/3");
    }
}
/**
 * As usual I encountered numerous bugs that took a while to deal with but once I understood
 * the instructions this project was not too difficult and I was able to complete it
 * and get it working. Almost the entirety was done in the main program and I only used two methods.
 */
