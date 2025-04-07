package org.project.object.consumables;

import org.project.entity.Entity;

// TODO: UPDATE IMPLEMENTATION
public class Flask {
    /*
    THIS IS AN EXAMPLE OF A CONSUMABLE DESIGN.
    */

    // TODO: (BONUS) UPDATE USE METHOD
//    @Override
    public void use(Entity target) {
        System.out.println("🧪 Flask use called for " + target.getName() + " with HP: " + target.getHp());

        if (target.getHp() == 10) {
            target.heal(30);
            System.out.println(target.getName() + " used flask!");
        } else {
            System.out.println("❌ Flask condition not met. HP: " + target.getHp());
        }
    }
}
