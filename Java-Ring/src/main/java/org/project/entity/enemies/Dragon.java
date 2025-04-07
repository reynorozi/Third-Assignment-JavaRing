package org.project.entity.enemies;
//import org.project.entity.enemies.Enemy;
import org.project.entity.Entity;
import org.project.entity.players.Player;
import org.project.object.weapons.Sword;
// TODO: UPDATE IMPLEMENTATION
public class Dragon extends Enemy {
    // TODO: DESIGN ENEMY'S WEAPON AND ARMOR AND IMPLEMENT THE CONSTRUCTOR
    private int  invisiblecount =10 ;
    public Dragon() {
        super(180, 0, new Sword(),"Dragon");
    }
    public void Ability(Entity entity) {
        if(invisiblecount > 0 && ((Player) entity).getHp() <= 70 ) {
            if (entity instanceof Player) {
                ((Player) entity).takeDamageIgnoreArmor(20);
                System.out.println("🔥 Dragon used Fire Breath! Armor is ignored!");
                invisiblecount-= 10;
            }
    }
}
}