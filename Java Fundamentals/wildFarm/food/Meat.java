package wildFarm.food;

public class Meat extends Food {
    private final static String DEFAULT_TYPE = "Meat";
    public Meat(String type, int quantity) {
        super(type, quantity);
    }

    @Override
    protected void setType(String type) {
        super.setType(DEFAULT_TYPE);
    }
}
