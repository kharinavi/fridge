package ru.kharina.study.fridge;

public class DairyProduct extends Foodstuff{
    private String percent;

    public DairyProduct(String name) {
        super(name);
    }

    public String getPercent() {
        return percent;
    }

    public void setPercent(String percent) {
        this.percent = percent;
    }

    @Override
    public String specification() {
        return "Молочный продукт: " + getName() + " c процентом жирности = " + getPercent();
    }
}
