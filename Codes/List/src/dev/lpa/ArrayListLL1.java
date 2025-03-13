package dev.lpa;

import java.util.ArrayList;
import java.util.Arrays;

record GroceryItem(String name,String type,int count){
    public GroceryItem(String name){
        this(name,"DAIRY",1);
    }
    @Override
    public String toString(){
        return String.format(" %d %s in %s",count,name.toUpperCase(),type);
    }
}
public class ArrayListLL1 {
    public static void main(String[] args) {
        Object[] groceryArray = new Object[3];
        groceryArray[0] = new GroceryItem("Milk");
        groceryArray[1] = new GroceryItem("Bread","PRODUCE",6);
        groceryArray[2] = new GroceryItem("5 Oranges","PRODUCE",7);
        //System.out.println(Arrays.toString(groceryArray));

        ArrayList objectList = new ArrayList(); // in arraylist we dont have to specify how much memory we will need
        objectList.add(new GroceryItem("Butter"));
        objectList.add("Milk");

        ArrayList<GroceryItem> groceryArrayList = new ArrayList<>(); //arraylist of type Grocery Item
        groceryArrayList.add(new GroceryItem("Milk"));
        groceryArrayList.add(new GroceryItem("Bread"));
        groceryArrayList.add(new GroceryItem("Milk FULL FAT"));
        groceryArrayList.add(0,new GroceryItem("Chips"));//passing the index where it needs to be added
        System.out.println(groceryArrayList);
        System.out.println(groceryArrayList.getClass());
    }
}
