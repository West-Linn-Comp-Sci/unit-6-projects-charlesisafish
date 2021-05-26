public class Cruciferous extends Vegetable
{
    public Cruciferous(String name, String type){
        super(name, type);
        setInstructions("Cruciferous vegetables grow ideally when seeded indoors 5-6 weeks before spring, move to the garden 2-3 weeks before spring. 1 inch per week, keep soil moist and adjust based on temperature harvest 70-100 days after seeding. Yields 2-4 plants per seed, cut buds while they are still green approx. 5-6 inches from the stem.");
    }
    public String feed(){
        return "N/A";
    }
    public String water(){
        return "You add an inch of water to the " + super.getName() + " because you haven't watered them for a week";
    }
    public String getInstructions(){
        return super.getInstructions();
    }
    public String harvest(){
        return "You cut the " + super.getName() + " about 5 inches above the stem, harvesting 3" + super.getName();
    }
}