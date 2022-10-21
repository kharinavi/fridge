package ru.kharina.study.fridge;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
        Fridge fridge = context.getBean("fridgeBean", Fridge.class);
        fridge.openTheFridge();
        context.close();
    }
}
