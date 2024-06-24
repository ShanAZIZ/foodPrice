package fr.esgi.foodpricer.items.food;

import fr.esgi.foodpricer.items.MenuItem;

public class Food extends MenuItem {
    FoodType foodType;

    public Food(FoodType foodType) {
        this.foodType = foodType;
    }
}
