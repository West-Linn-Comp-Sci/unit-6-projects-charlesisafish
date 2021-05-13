import java.util.ArrayList;
public class Purse { 
    private ArrayList<Coin> coins; 
    public Purse() { 
        coins = new ArrayList(); 
    }
    // adds aCoin to the purse 
    public void add(Coin aCoin) { 
        coins.add(aCoin); 
    } 
    // returns total value of all coins in purse 
    public double getTotal() { 
        double sum = 0;
    	for(int i=0; i<coins.size(); i++){
        	sum += coins.get(i).getValue();
        }
        return sum;
    } 
    // returns the number of coins in the Purse that matches aCoin 
    // (both myName & myValue) 
    public int count(Coin aCoin) {
        int count = 0;
        for(int i=0; i<coins.size(); i++){
            if(aCoin.getValue() == coins.get(i).getValue()){
            	if(aCoin.getName() == coins.get(i).getName()){
        	    count++;
        	}
            }
        } 
        return count;
    }
     // returns the name of the Coin in the Purse that has the smallest value 
    public String findSmallest(){
        int min = 100;
        String name = "";
        for(int i=0; i<coins.size(); i++){
            if(coins.get(i).getValue() < min){
                name = coins.get(i).getName();
            }
            }
        return name;
    }
    
}
