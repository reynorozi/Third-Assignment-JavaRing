package org.project.entity.enemies;
//import org.project.entity.enemies.Enemy;
import org.project.entity.Entity;
import org.project.object.weapons.Sword;
// TODO: UPDATE IMPLEMENTATION
public class Skeleton extends Enemy {
    // TODO: DESIGN ENEMY'S WEAPON AND ARMOR AND IMPLEMENT THE CONSTRUCTOR
    private boolean alive= true;
    public Skeleton() {
        super(150, 0, new Sword(),"Skeleton");
    }
    //SKELETON HAS EXTRA HEALTH
    public void Ability(Entity entity) {
        if(entity.getHp() == 0 && alive) {
            entity.setHp(50);
            alive = false;
            System.out.println("💀 Skeleton revived with 50 HP!");
        }
    }

}