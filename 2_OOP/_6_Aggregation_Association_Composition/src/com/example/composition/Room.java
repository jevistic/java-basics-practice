package com.example.composition;

public class Room {
    private String name;
    private Door door;     // Composition
    private Window window; // Composition

    public Room(String name, String doorMaterial, String windowType) {
        this.name = name;
        this.door = new Door(doorMaterial);     // Composition
        this.window = new Window(windowType);  // Composition
    }

    public String getName() {
        return name;
    }

    public Door getDoor() {
        return door;
    }

    public Window getWindow() {
        return window;
    }
}