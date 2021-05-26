
/**
 * Abstract class Vegetable - write a description of the class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class Vegetable implements Growable
{
    private String name;
    private String instructions;
    private String type;
    public Vegetable(String name, String type){
        this.name = name;
        this.type = type;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getInstructions(){
        return instructions;
    }
    protected void setInstructions(String instructions){
        this.instructions = instructions;
    }
    public String getType(){
        return this.type;
    }
}
