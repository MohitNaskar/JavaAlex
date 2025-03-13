package dev.lpa;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MoreList {
    public static void main(String[] args) {
        String[] items = {"apples","bananas","milks","eggs"};//array of Strings
        List<String> list = List.of(items);//list of the items(making of the list)
        System.out.println(list);//list is immutable
        System.out.println(list.getClass().getName());
        ArrayList<String> list1 = new ArrayList<>(list);
        System.out.println(list1.getClass());//arraylist is mutable
        list1.add("apples");
        System.out.println(list1);
        ArrayList<String> list2 = new ArrayList<>(List.of("apples","bananas","milks","eggs"));
        list1.addAll(list2);
        System.out.println(list1);
        System.out.println("Third Item = "+ list1.get(3));//fetching by index

        //to find a element in the array list we can use the contains method
        if(list1.contains("apples")){
            System.out.println("Contains apples");
        }

        System.out.println(list1.indexOf("apples"));//gives the (first)index of the apples
        System.out.println(list1.lastIndexOf("apples"));//gives the last index of apples
        list1.remove(1);//removes the element at index 1
        System.out.println(list1);
        list1.remove("apples");//removes apples from the arraylist the first occurrence
        System.out.println(list1);

        list1.removeAll(List.of("apples","milk"));//removes all the mentioned items
        System.out.println(list1);
        list1.retainAll(List.of("apples"));//retains all the mentioned items in the list
        //list1.clear();//removes everything
        System.out.println(list1);
        list1.sort(Comparator.naturalOrder());//sorts the arraylist in natural order
    }
}
