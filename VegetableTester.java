import java.util.ArrayList;
public class VegetableTester
{
    public static void main (String[] args){
        ArrayList<Vegetable> garden = new ArrayList();
        garden.add(new LeafyGreen("Lettuce", "Leafy Green"));
        garden.add(new Cruciferous("Broccoli", "Cruciferous"));
        garden.add(new Root("Potato", "Root"));
        for(int i=0; i<garden.size(); i++){
            System.out.println(garden.get(i).getName());
            System.out.println(garden.get(i).getType());
            System.out.println(garden.get(i).getInstructions());
            System.out.println(garden.get(i).water());
            System.out.println(garden.get(i).harvest());
        }
    }
}
