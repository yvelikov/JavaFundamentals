package wildFarm.animals;

import wildFarm.visitor.Visitor;
import wildFarm.food.Food;

import java.text.DecimalFormat;

public class Zebra extends Mammal {
    private static final String DEFAULT_TYPE = "Zebra";

    public Zebra(String animalName, double animalWeight, String livingRegion) {
        super(animalName, animalWeight, livingRegion);
        super.setAnimalType(DEFAULT_TYPE);
    }


    @Override
    public void makeSound() {
        System.out.println("Zs");
    }

    @Override
    public void eatFood(Food food) {
        if (!food.getType().equals("Vegetable")) {
            throw new IllegalArgumentException("Zebras are not eating that type of food!");
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
