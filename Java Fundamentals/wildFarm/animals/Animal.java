package wildFarm.animals;

import wildFarm.visitor.Visitor;
import wildFarm.food.Food;

public abstract class Animal {
    private String animalName;
    private String animalType;
    private double animalWeight;
    private int foodEaten;

    public Animal(String animalName, double animalWeight) {
        this.setAnimalName(animalName);
        this.setAnimalWeight(animalWeight);
        this.foodEaten = 0;
    }

    String getAnimalName() {
        return this.animalName;
    }

    private void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    String getAnimalType() {
        return this.animalType;
    }

    void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    double getAnimalWeight() {
        return this.animalWeight;
    }

    private void setAnimalWeight(double animalWeight) {
        this.animalWeight = animalWeight;
    }

    int getFoodEaten() {
        return this.foodEaten;
    }

    void setFoodEaten(int foodEaten) {
        this.foodEaten = foodEaten;
    }

    public abstract void makeSound();

    public abstract void eatFood(Food food);

    public abstract void accept(Visitor visitor);
}
