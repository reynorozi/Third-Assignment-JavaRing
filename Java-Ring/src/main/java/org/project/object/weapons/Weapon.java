package org.project.object.weapons;

import org.project.entity.Entity;
import org.project.object.GameObject;

// TODO: UPDATE IMPLEMENTATION
public abstract class Weapon implements GameObject {
    private int damage;
//    private int manaCost;

    /*
    TODO: ADD OTHER REQUIRED AND BONUS ATTRIBUTES
    */


    public Weapon(int damage) {
        this.damage = damage;
//        this.manaCost = manaCost;
    }

    @Override

    public void use(Entity target) {
        target.takeDamage(damage);
    }

    public int getDamage() {
        return damage;
    }

//    public int getManaCost() {
//        return manaCost;
//    }

    /*
    TODO: ADD OTHER REQUIRED AND BONUS METHODS
    */
}
