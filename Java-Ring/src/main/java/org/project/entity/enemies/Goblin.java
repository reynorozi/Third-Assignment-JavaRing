package org.project.entity.enemies;
//import org.project.entity.enemies.Enemy;
import org.project.entity.Entity;
import org.project.object.weapons.Sword;
// TODO: UPDATE IMPLEMENTATION
public class Goblin extends Enemy {
    // TODO: DESIGN ENEMY'S WEAPON AND ARMOR AND IMPLEMENT THE CONSTRUCTOR
    public Goblin() {
        super(140, 0, new Sword(),"Goblin");
    }
    //SKELETON HAS EXTRA HEALTH
    public void Ability(Entity entity) {
       //goblin has no skill :)
    }

}