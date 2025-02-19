import java.awt.*;

public class BurgerMain {
    public static void main(String[] args) {
//        Item coke = new Item("drink","coke",1.50);
//        coke.printItem();
//        coke.setSize("LARGE");
//        coke.printItem();
//        Burger burger = new Burger("regular",4.00);
//        burger.addTopping("BACON","CHEESE","MAYO");
//        burger.printItem();
//        MealOrder mealOrder = new MealOrder();
//        mealOrder.addBurgerToppings("BACON","CHEESE","MAYO");
//        mealOrder.setDrinkSize("SMALL");
//        mealOrder.printItemizedList();

//        MealOrder mealOrder1 = new MealOrder("turkey","7-up","chilli");
//        mealOrder1.addBurgerToppings("BACON","CHEESE","MAYO");
//        mealOrder1.setDrinkSize("SMALL");
//        mealOrder1.printItemizedList();

        MealOrder Deluxe = new MealOrder("deluxe","7-up","chili");
        Deluxe.addBurgerToppings("AVOCADO","BACON","LETTUCE","CHEESE","MAYO");
        Deluxe.setDrinkSize("SMALL");
        Deluxe.printItemizedList();
    }
}
