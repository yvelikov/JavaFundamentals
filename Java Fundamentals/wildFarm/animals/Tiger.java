package wildFarm.animals;

import wildFarm.visitor.Visitor;
import wildFarm.food.Food;

import java.text.DecimalFormat;

public class Tiger extends Feline {
    private final static String DEFAULT_TYPE = "Tiger";

    public Tiger(String animalName, double animalWeight, String livingRegion) {
        super(animalName, animalWeight, livingRegion);
        super.setAnimalType(DEFAULT_TYPE);
    }

    @Override
    public void makeSound() {
        System.out.println("ROAAR!!!");
    }

    @Override
    public void eatFood(Food food) {
        if (!food.getType().equals("Meat")) {
            throw new IllegalArgumentException("Tigers are not eating that type of food!");
        }
        super.setFoodEaten(super.getFoodEaten() + food.getQuantity());
    }

    @Override
    public String toString() {
        DecimalFormat format = new DecimalFormat("0.#########");
        return String.format("%s[%s, %s, %s, %d]",
                this.getAnimalType(),
                this.getAnimalName(),
                format.format(this.getAnimalWeight()),
                this.getLivingRegion(),
                this.getFoodEaten());
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
