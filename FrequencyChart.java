import java.util.Scanner;
/**
 * FrequencyChart takes user inputted integers and uses loops to categorize them into ranges and display 
 * how many integers are within each range, only including numbers from 1 to 100.
 *
 * @Gregory McCoy
 * @4/29/21
*/
public class FrequencyChart
{
    public static void main (String[] args){
        boolean continue1 = true;
        int count = 0;
        int array[] = new int[100];
        String frequency[] = new String[100];
        Scanner in = new Scanner(System.in);
        System.out.println("Enter in integers between 1 and 100 and when you are finished enter 0");
            for (int i=1; i<101; i+=10){
                frequency[i] = "";
            }
            while (continue1){
                int userinput = in.nextInt();
                if (userinput == 0){
                    continue1 = false;
                }
                if (userinput > 0 && userinput <=100){
                    array[count] = userinput;
                    count++;
                    for(int i=1; i<101; i += 10){
                        if(array[count-1] >= i && array[count-1] <= i+9){
                            frequency[i] += "*";
                        }
                    }
                }
            }
            for (int i=1; i<101; i += 10){
                    System.out.println(i + " - " + (i+9) + " | " + frequency[i]);
            }
    }
}
/**
* I had a decent amount of trouble with this initial assignment having it been so long
* since last using java. I had to look some things up but was able to get it working
* somewhat and figure out what I needed to do. Later on I kept having this weird bug 
* where the 91-100 group would always be either 1 or 2 more than it was supposed to 
* and I spent over an hour trying to fix it and was finally able to after I moved the block of 
* code inside one of the previous loops.
*/