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
        MealOrder mealOrder = new MealOrder();
        mealOrder.addBurgerToppings("BACON","CHEESE","MAYO");
        mealOrder.setDrinkSize("LARGE");
        mealOrder.printItemizedList();
    }
}
