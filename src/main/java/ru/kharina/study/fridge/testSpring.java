package ru.kharina.study.fridge;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class testSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                SpringConfig.class
        );
        Fridge fridge = context.getBean("fridge", Fridge.class);
        fridge.openTheFridge();
        context.close();
    }
}
