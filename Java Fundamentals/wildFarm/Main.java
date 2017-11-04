package wildFarm;

import wildFarm.animals.*;
import wildFarm.food.*;
import wildFarm.visitor.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static Food food;
    private static Animal animal;
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<Animal> animals = new ArrayList<>();

        while(true){
            String input = reader.readLine();
            if("End".equals(input)){
                break;
            }

            String[] inputData = input.split("\\s+");
            String[] foodData = reader.readLine().split("\\s+");
            createFood(foodData);
            createAnimal(inputData);

            animal.makeSound();
            eat();
            animals.add(animal);
        }

        animals.forEach(a-> a.accept(new AnimalDisplayVisitor()));

    }

    private static void createAnimal(String[] inputData) {
        switch(inputData[0]){
            case "Cat":
                animal = new Cat(inputData[1],Double.valueOf(inputData[2]),inputData[3],inputData[4]);
                break;
            case "Tiger":
                animal = new Tiger(inputData[1],Double.valueOf(inputData[2]),inputData[3]);
                break;
            case "Zebra":
                animal = new Zebra(inputData[1],Double.valueOf(inputData[2]),inputData[3]);
                break;
            case "Mouse":
                animal = new Mouse(inputData[1],Double.valueOf(inputData[2]),inputData[3]);
                break;
        }
    }

    private static void eat() {
        try{
            animal.eatFood(food);
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }

    private static void createFood(String[] foodData) {
        switch (foodData[0]){
            case "Vegetable":
                food = new Vegetable(foodData[0],Integer.valueOf(foodData[1]));
                break;
            case "Meat":
                food = new Meat(foodData[0],Integer.valueOf(foodData[1]));
                break;
        }
    }
}
