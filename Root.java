public class Root extends Vegetable
{
    public Root(String name, String type){
        super(name, type);
        setInstructions("Use fertilizer and grow in 50-60°C add a 1-2 inch layer of compost on top of seed. 1 inch per week, make sure the water reaches deep into the soil where the roots are. Pull up the roots from the ground when they are an adequate size");
    }
    public String feed(){
        return "N/A";
    }
    public String water(){
        return "You added an inch of water yesterday so you don't need to water them again for another week";
    }
    public String getInstructions(){
        return super.getInstructions();
    }
    public String harvest(){
        return "You pull the " + super.getName() + " out of the ground, brushing off the dirt.";
    }
}
