package dev.lpa;

import java.sql.SQLOutput;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Scanner;

record Place(String name,int distance){
    @Override
    public String toString() {
        return String.format("%s (%d)", name, distance);
    }
}
public class ListIteratorChallenge {
    public static void main(String[] args) {
        LinkedList<Place> placesToVisit = new LinkedList<>();

        Place adelaide = new Place("Adelaide", 1374);//creating a record for place adelaide
        addPlace(placesToVisit, adelaide);//passing the object and linkedList to the function
        addPlace(placesToVisit,new Place("Brisbane",3324));
        addPlace(placesToVisit,new Place("Perth",3924));
        addPlace(placesToVisit,new Place("Melbourne",2324));
        addPlace(placesToVisit,new Place("Darwin",1324));
        addPlace(placesToVisit,new Place("Sydney",1283));
        addPlace(placesToVisit,new Place("Canberra",4204));
        System.out.println(placesToVisit);

        var iterator = placesToVisit.listIterator();
        Scanner scanner = new Scanner(System.in);
        boolean quitLoop = false;
        boolean forward = true;

        printMenu();
        while(!quitLoop) {
            if(!iterator.hasPrevious()) {
                System.out.println("Originating : "+iterator.next());
                forward = true;
            }
            if(!iterator.hasNext()) {
                System.out.println("Ending : "+iterator.previous());
                forward = false;
            }
            System.out.println("Please enter your choice: ");
            String menuItem = scanner.nextLine().toUpperCase().substring(0, 1);

            switch (menuItem){
                case "F":
                    System.out.println("User wants to go forward");
                    if(iterator.hasNext()){
                        System.out.println(iterator.next());
                    }
                    break;
                case "B":
                    System.out.println("User wants to go backward");
                    if (iterator.hasPrevious()) {
                        System.out.println(iterator.previous());
                    }
                    break;
                case "M":
                    printMenu();
                    break;
                case "L":
                    System.out.println(placesToVisit);
                    break;
                default:
                    quitLoop = true;
                    break;
            }
        }
    }
    private static void addPlace(LinkedList<Place> list,Place place) {
        if(list.contains(place)){
            System.out.println("Place already exists");
            return;
        }
        for (Place p : list) {
            if(p.name().equalsIgnoreCase(place.name())) {
                System.out.println("Place already exists");
                return;
            }
        }
        int matchedIndex = 0;
        for (var listPlace : list){
            if(place.distance() < listPlace.distance()){
                list.add(place);
                return;
            }
            matchedIndex++;
        }
        list.add(place);

    }
    private static void printMenu(){
        System.out.println("""
                Available actions(Select wor or letter):
                (F)orward
                (B)ackward
                (L)ist Places
                (M)enu
                (Q)uit""");
    }
}
