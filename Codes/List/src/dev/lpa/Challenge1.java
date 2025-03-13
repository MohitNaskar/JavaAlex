//package dev.lpa;
///*
//the challenge is to create an interactive console program with a menu of option
//as shown here and functionality that I'll describe now:
//*/
//
//import java.util.ArrayList;
//import java.util.Comparator;
//import java.util.List;
//import java.util.Scanner;
//
//public class Challenge1 {
//    private static Scanner scanner = new Scanner(System.in);
//
//    public static void main(String[] args) {
//        boolean flag = true;
//        ArrayList<String> groceriesList = new ArrayList<>();//creation of the arrayList
//        while (flag) {
//            printActions();
//            switch(Integer.parseInt(scanner.nextLine())){//reads the entire line a a string then converts it to integer
//                case 1 -> addItems(groceriesList);
//                case 2 -> removeItems(groceriesList);
//                default -> flag = false;
//            };
//            groceriesList.sort(Comparator.naturalOrder());//sort the arrayList
//            System.out.println(groceriesList);
//
//        }
//    }
//    private static void addItems(ArrayList<String> groceriesList){
//        System.out.println("Add item(s) [separated by comma]");
//        String[] items = scanner.nextLine().split(","); //takes the input as the array of strings using commas
//        groceriesList.addAll(List.of(items));// add the input string
//        for (String i : groceriesList) {
//            String trimed = i.trim(); // trims the extra spaces
//            if (groceriesList.indexOf(trimed) < 0) {//checks if the item is already in the list
//                groceriesList.add(trimed);
//            }
//        }
//    }
//    private static void removeItems(ArrayList<String> groceriesList){
//        System.out.println("Remove item(s) [separated by comma]");
//        String[] items = scanner.nextLine().split(","); //takes the input as the array of strings using commas
//        for (String i : groceriesList) {
//            String trimed = i.trim(); // trims the extra spaces
//            groceriesList.remove(trimed);
//        }
//    }
//    private static void printActions(){
//        String textBlock = """
//                Available actions:
//                0 = to shutdown
//                1 = to add item(s) to list (comma delimited list)
//                2 = to remove any items (comma delimited list)
//
//                Enter a number for which active you want to do:
//                """;
//        System.out.println(textBlock+"= ");
//
//    }
//}
package dev.lpa;

import java.util.*;

public class Challenge1 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean flag = true;
        ArrayList<String> groceriesList = new ArrayList<>();

        while (flag) {
            printActions();
            switch (Integer.parseInt(scanner.nextLine())) {
                case 1 -> addItems(groceriesList);
                case 2 -> removeItems(groceriesList);
                default -> flag = false;
            }
            groceriesList.sort(Comparator.naturalOrder()); // Sort the list
            System.out.println(groceriesList);
        }
    }

    private static void addItems(ArrayList<String> groceriesList) {
        System.out.println("Add item(s) [separated by comma]");
        String[] items = scanner.nextLine().split(",");

        for (String item : items) {
            String trimmed = item.trim(); // Trim spaces before adding
            if (!groceriesList.contains(trimmed)) { // Prevent duplicates
                groceriesList.add(trimmed);
            }
        }
    }

    private static void removeItems(ArrayList<String> groceriesList) {
        System.out.println("Remove item(s) [separated by comma]");
        String[] items = scanner.nextLine().split(",");

        // Using `removeIf()` to safely remove items without modifying the list while iterating
        Set<String> toRemove = new HashSet<>();
        for (String item : items) {
            toRemove.add(item.trim()); // Trim spaces
        }

        groceriesList.removeIf(toRemove::contains);
    }

    private static void printActions() {
        String textBlock = """
                Available actions:
                0 = to shutdown
                1 = to add item(s) to list (comma delimited list)
                2 = to remove any items (comma delimited list)

                Enter a number for which action you want to do:
                """;
        System.out.print(textBlock + "= ");
    }
}
