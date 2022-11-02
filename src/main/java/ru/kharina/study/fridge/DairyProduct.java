package ru.kharina.study.fridge;

import org.springframework.stereotype.Component;

public class DairyProduct extends Foodstuff{
    private int percent;

    public DairyProduct(String name) {
        super(name);
    }

    public int getPercent() {
        return percent;
    }

    public void setPercent(int percent) {
        this.percent = percent;
    }

    @Override
    public String specification() {
        return "Молочный продукт: " + getName() + " c процентом жирности = " + getPercent();
    }
}
