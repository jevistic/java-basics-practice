package com.example.composition;

import java.util.ArrayList;
import java.util.List;

public class House {
    private String address;
    private List<Room> rooms; // Composition

    public House(String address) {
        this.address = address;
        this.rooms = new ArrayList<>();
    }

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public List<Room> getRooms() {
        return rooms;
    }
    public String getAddress() {
        return address;
    }
}