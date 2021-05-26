
/**
 * Write a description of class LeafyGreen here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LeafyGreen extends Vegetable
{
    public LeafyGreen(String name, String type){
        super(name, type);
        setInstructions("Leafy Greens grow best in rich soil with plenty of organic matter. Water approximately 1 inch per week. Can be harvested 2-3 times by trimming a few inches above the soil.");
    }
    public String feed(){
        return "N/A";
    }
    public String water(){
        return "you add about half an inch of water to the " + super.getName() + " because you watered them a few days ago";
    }
    public String getInstructions(){
        return super.getInstructions();
    }
    public String harvest(){
        return "You cut the " + super.getName() + " 3 inches above the soil and take it home";
    }
}
