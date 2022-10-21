package ru.kharina.study.fridge;

public class PlantProduct extends Foodstuff{
    private String plantName;

    public PlantProduct(String name) {
        super(name);
    }

    public String getPlantName() {
        return plantName;
    }

    public void setPlantName(String plantName) {
        this.plantName = plantName;
    }

    @Override
    public String specification() {
        return "Растительный продукт: " + getName() + " c названием дерева = " + getPlantName();
    }
}
