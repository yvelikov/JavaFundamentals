package wildFarm.animals;

import wildFarm.visitor.Visitor;
import wildFarm.food.Food;

import java.text.DecimalFormat;

public class Cat extends Feline {
    private final static String DEFAULT_TYPE = "Cat";
    private String breed;

    public Cat(String animalName, double animalWeight, String livingRegion, String breed) {
        super(animalName, animalWeight, livingRegion);
        super.setAnimalType(DEFAULT_TYPE);
        this.setBreed(breed);
    }

    private String getBreed() {
        return this.breed;
    }

    private void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println("Meowwww");
    }

    @Override
    public void eatFood(Food food) {
        super.setFoodEaten(super.getFoodEaten() + food.getQuantity());
    }

    @Override
    public String toString() {
        DecimalFormat format = new DecimalFormat("0.#########");
        return String.format("%s[%s, %s, %s, %s, %d]",
                this.getAnimalType(),
                this.getAnimalName(),
                this.getBreed(),
                format.format(this.getAnimalWeight()),
                this.getLivingRegion(),
                this.getFoodEaten());
    }

    @Override
    public void accept(Visitor visitor){
        visitor.visit(this);
    }
}
