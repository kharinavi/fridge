package ru.kharina.study.fridge;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

public class Fridge {
    private String model;
    private List<Foodstuff> foodList = new ArrayList<>();

    public Fridge(List<Foodstuff> foodList) {
        this.foodList = foodList;
    }

    //@Autowired
    public void setFoodList(List<Foodstuff> foodList) {
        this.foodList = foodList;
    }

    public void openTheFridge(){
        System.out.println("Список: ");
        for (Foodstuff foodstuff : foodList)
            System.out.println(foodstuff.specification());
    }

}
