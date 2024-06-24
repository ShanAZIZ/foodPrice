package fr.esgi.foodpricer.factory;

import fr.esgi.foodpricer.items.food.Food;
import fr.esgi.foodpricer.items.food.Plate;
import fr.esgi.foodpricer.items.food.Sandwich;

public class FoodFactory {
    public Food createPlate() {
        return new Food(new Plate());
    }
    public Food createSandwich() {
        return new Food(new Sandwich());
    }
}
