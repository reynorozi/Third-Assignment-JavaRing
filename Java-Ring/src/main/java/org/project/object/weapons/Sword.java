package org.project.object.weapons;

import org.project.entity.Entity;
import org.project.entity.players.Player;

import java.util.ArrayList;

// TODO: UPDATE IMPLEMENTATION
public class Sword extends Weapon{
    /*
    THIS IS AN EXAMPLE OF A WEAPON DESIGN.
    */

    int abilityCharge;

    public Sword() {
        // TODO: DESIGN SWORD'S ATTRIBUTES IMPLEMENT THE CONSTRUCTOR
        super(10);
    }

    // TODO: (BONUS) UPDATE THE UNIQUE ABILITY
    public void uniqueAbility(ArrayList<Entity> targets) {
        abilityCharge += 2;
        for (Entity target : targets) {
            target.takeDamage(getDamage());
        }
    }
}
