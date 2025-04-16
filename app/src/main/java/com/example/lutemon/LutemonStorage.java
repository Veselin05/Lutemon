package com.example.lutemon;

import java.util.ArrayList;
import java.util.List;

public class LutemonStorage {
    private static LutemonStorage instance;
    private List<Lutemon> lutemons;

    private LutemonStorage() {
        this.lutemons = new ArrayList<>();
    }

    public static LutemonStorage getInstance() {
        if (instance == null) {
            instance = new LutemonStorage();
        }
        return instance;
    }

    public void addLutemon(Lutemon lutemon) {
        lutemons.add(lutemon);
    }

    public List<Lutemon> getAllLutemons() {
        return lutemons;
    }

    public List<Lutemon> getLutemonsByLocation(String location) {
        List<Lutemon> result = new ArrayList<>();
        for (Lutemon lutemon : lutemons) {
            if (lutemon.getLocation().equalsIgnoreCase(location)) {
                result.add(lutemon);
            }
        }
        return result;
    }


    public void moveLutemon(int id, String newLocation) {
        for (Lutemon lutemon : lutemons) {
            if (lutemon.getId() == id) {
                lutemon.setLocation(newLocation);
                return; // Exit the loop after updating
            }
        }
        // Handle the case where the Lutemon with the given id is not found (optional)
    }

    public Lutemon getLutemonById(int id) {
        for (Lutemon lutemon : lutemons) {
            if (lutemon.getId() == id) {
                return lutemon;
            }
        }
        return null;
    }

    public void removeLutemon(int id) {
        Lutemon lutemonToRemove = null;
        for (Lutemon lutemon : lutemons) {
            if (lutemon.getId() == id) {
                lutemonToRemove = lutemon;
                break;
            }
        }
        if (lutemonToRemove != null) {
            lutemons.remove(lutemonToRemove);
        }
    }

    public void clearStorage(){
        lutemons.clear();
    }
}