package ru.kharina.study.fridge;

public abstract class Foodstuff {
    private String name;

    public Foodstuff(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract String specification();
}
