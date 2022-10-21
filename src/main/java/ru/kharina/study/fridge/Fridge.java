package ru.kharina.study.fridge;

import java.util.ArrayList;
import java.util.List;

public class Fridge {
    private String model;
    private List<Foodstuff> foodList = new ArrayList<>();

    public Fridge() {
    }

    public void setFoodList(List<Foodstuff> foodList) {
        this.foodList = foodList;
    }

    public void openTheFridge(){
        System.out.println("Список: ");
        for (Foodstuff foodstuff : foodList)
            System.out.println(foodstuff.specification());
    }

}
