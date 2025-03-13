package dev.lpa;

import java.util.LinkedList;

public class LinkedListPractice {
    public static void main(String[] args) {
        //LinkedList<String> placesToVisit = new LinkedList();
        var placesToVisit = new LinkedList();
        placesToVisit.add("Sydney");
        placesToVisit.add("Canberra");
        addMoreElements(placesToVisit);
        System.out.println(placesToVisit);
//        removeElements(placesToVisit);
//        System.out.println(placesToVisit);
        gettingElements(placesToVisit);
    }
    private static void addMoreElements(LinkedList<String> list) {
        list.addFirst(("Darwin"));
        list.addLast("Hobart");
        list.offer("Melbourne");//offer is same as addlast adds at the last
        list.offerFirst("Brisbane");//adds element to the first
        list.push("Alice Springs");//pushes an element to the head of the list
    }
    private static void removeElements(LinkedList<String> list) {
        list.remove(4);
        list.remove("Brisbane");
        System.out.println("Brisbane removed");
        System.out.println(list);
        String s1 = list.remove();
        System.out.println(s1 +" was removed");
        System.out.println(list);
    }
    private static void gettingElements(LinkedList<String> list) {
        System.out.println("Getting element = "+list.get(4));
    }
}
