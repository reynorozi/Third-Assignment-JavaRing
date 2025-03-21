package org.project.location;

import org.project.entity.enemies.Enemy;

import java.util.ArrayList;

public class Location {
    private String name;

    private ArrayList<Location> locations;
    private ArrayList<Enemy> enemies;

    public Location(ArrayList<Location> locations, ArrayList<Enemy> enemies) {
        this.locations = locations;
        this.enemies = enemies;
    }

    /*
    TODO: (BONUS) RESET EACH LOCATION AFTER PLAYER LEAVES
    */

    public void setlocatinname(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public ArrayList<Location> getLocations() {
        return locations;
    }

    public ArrayList<Enemy> getEnemies() {
        return enemies;
    }
    public void resetLocation() {
        enemies.clear();
    }
}
