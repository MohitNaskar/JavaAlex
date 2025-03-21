package dev.lpa;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;//arraylist of type contact

    public MobilePhone(String number) {
        this.myNumber = number;
        this.myContacts = new ArrayList<>();
    }
    public boolean addNewContact(Contact contact){
        if(findContact(contact.getName()) >= 0){
            return false;
        }
        myContacts.add(contact);
        return true;
    }
    public boolean updateContact(Contact oldContact,Contact newContact){
        int position = findContact(oldContact.getName());
        if(position < 0)
            return false;
        myContacts.set(position, newContact);
        return true;
    }
    public boolean removeContact(Contact contact){
        int position = findContact(contact);
        if(position < 0)
            return false;
        myContacts.remove(position);
        return true;
    }
    private int findContact(Contact contact){
        return myContacts.indexOf(contact);
    }
    private int findContact(String name) {
        for (int i = 0; i < myContacts.size(); i++) {
            if (myContacts.get(i).getName().equalsIgnoreCase(name)) {
                return i;
            }
        }
        return -1; // Not found
    }
    public Contact queryContact(String name){
        int position = findContact(name);
        if(position >= 0)
            return myContacts.get(position);
        return null;
    }
    public void printContacts(){
        System.out.println("Contact List:");
        for (int i = 0; i < myContacts.size(); i++) {
            Contact contact = myContacts.get(i);
            System.out.println((i + 1) + ". " + contact.getName() + " -> " + contact.getPhoneNumber());
        }
    }
}
