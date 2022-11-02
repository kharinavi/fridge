package ru.kharina.study.fridge;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

@Configuration
public class SpringConfig {
    @Bean
    public DairyProduct dairyProduct1(){
        DairyProduct res =  new DairyProduct("йогурт");
        res.setPercent(20);
        return res;
    }

    @Bean
    public DairyProduct dairyProduct2(){
        DairyProduct res = new DairyProduct("сливки");
        res.setPercent(30);
        return res;
    }

    @Bean
    public PlantProduct plantProduct1(){
        PlantProduct res = new PlantProduct("банан");
        res.setPlantName("пальма");
        return res;
    }

    @Bean
    public PlantProduct plantProduct2(){
        PlantProduct res = new PlantProduct("яблоко");
        res.setPlantName("яблоня");
        return res;
    }

    @Bean
    public List<Foodstuff> foodList() {
        return Arrays.asList(plantProduct1(), plantProduct2(), dairyProduct1(), dairyProduct2());
    }

    @Bean
    public Fridge fridge(){
        return new Fridge(foodList());
    }
}
