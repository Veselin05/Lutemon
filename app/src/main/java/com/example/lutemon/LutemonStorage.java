package com.example.lutemon;

import java.util.ArrayList;
import java.util.List;

public class LutemonStorage {
    private static LutemonStorage instance;
    private final List<Lutemon> lutemons;

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
                return;
            }
        }
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

    public void clearStorage() {
        lutemons.clear();
    }

    public List<Lutemon> getStorageLutemons() {
        return getLutemonsByLocation("Home");
    }

    public List<Lutemon> getTrainingLutemons() {
        return getLutemonsByLocation("Training");
    }

    public List<Lutemon> getBattleLutemons() {
        return getLutemonsByLocation("Battle");
    }
}