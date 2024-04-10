package com.example.week11;

import java.util.ArrayList;

public class ListGrocery {
    private static ListGrocery storage = null;
    private ArrayList<Grocery> groceries = new ArrayList<>();
    private ListGrocery() {

    }
    public static ListGrocery getInstance() {
        if (storage == null) {
            storage = new ListGrocery();
        }
        return storage;
    }

    public void addGrocery(Grocery grocery) {
        groceries.add(grocery);
    }

    public Grocery getGroceryByName(String name) {
        for (Grocery grocery : groceries) {
            if (grocery.getName().equals(name)) {
                return grocery;
            }
        }
        return null;
    }

    public void removeGroceryByName(String name) {
        Grocery grocery = getGroceryByName(name);
        if (grocery != null) {
            groceries.remove(grocery);
        }
    }

    public ArrayList<Grocery> getGroceries() {
        return groceries;
    }

    public void sortGroceriesByAlphabet() {
        sortedData = new ArrayList<>(groceries);
        for (Grocery grocery : groceries) {
            sortedData.add(grocery);
        }
    }

    public void sortGroceriesByTime() {
        groceries.sort((o1, o2) -> o1.getTime().compareTo(o2.getTime()));
    }
}
