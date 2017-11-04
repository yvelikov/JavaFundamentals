package wildFarm.food;

public abstract class Food {
    private String type;
    private int quantity;

    public Food(String type, int quantity) {
        this.setType(type);
        this.setQuantity(quantity);
    }

    public String getType() {
        return this.type;
    }

    protected void setType(String type) {
        this.type = type;
    }

    public int getQuantity() {
        return this.quantity;
    }

    private void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
