package dev.lpa;

import java.sql.SQLOutput;
import java.util.LinkedList;

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
        System.out.println(placesToVisit);
    }
    private static void addPlace(LinkedList<Place> list,Place place) {
        if(list.contains(place)){
            System.out.println("Place already exists");
            return;
        }
        for (Place p : list) {
            if(p.name().equalsIgnoreCase(place.name()));
            System.out.println("Place already exists");
            return;
        }
        list.add(place);
    }
}
