package wildFarm.food;

public class Vegetable extends Food {
    private final static String DEFAULT_TYPE = "Vegetable";
    public Vegetable(String type, int quantity) {
        super(type, quantity);
    }

    @Override
    protected void setType(String type) {
        super.setType(DEFAULT_TYPE);
    }
}
