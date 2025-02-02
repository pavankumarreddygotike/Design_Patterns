package client;

import decorator.Beverage;
import decorator.Coffee;
import decorator.MilkDecorator;
import decorator.SugarDecorator;
import decorator.WhippedCreamDecorator;

public class DecoratorPatternExample {
    public static void main(String[] args) {
        // Start with a basic coffee
        Beverage coffee = new Coffee();
        System.out.println(coffee.getDescription() + " $" + coffee.cost());

        // Add milk to the coffee
        coffee = new MilkDecorator(coffee);
        System.out.println(coffee.getDescription() + " $" + coffee.cost());

        // Add sugar to the coffee
        coffee = new SugarDecorator(coffee);
        System.out.println(coffee.getDescription() + " $" + coffee.cost());

        // Add whipped cream to the coffee
        coffee = new WhippedCreamDecorator(coffee);
        System.out.println(coffee.getDescription() + " $" + coffee.cost());
    }
}
