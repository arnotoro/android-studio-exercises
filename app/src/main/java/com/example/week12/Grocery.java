package com.example.week12;

public class Grocery {

    private final Boolean isImportant;
    private String name;
    private String note;

    public Grocery(String name, String note, Boolean isImportant) {
        this.name = name;
        this.note = note;
        this.isImportant = isImportant;
    }

    public String getName() {
        return name;
    }

    public String getNote() {
        return note;
    }
}
