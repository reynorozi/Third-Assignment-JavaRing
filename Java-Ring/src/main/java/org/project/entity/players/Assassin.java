package org.project.entity.players;

import org.project.entity.Entity;
import org.project.object.armors.SimpleArmor;
import org.project.object.weapons.Sword;

public class Assassin extends Player {
    private boolean isInvisible = false;

    public Assassin() {
        super("Assassin", 100, 10, new Sword(), new SimpleArmor(), 100, 10);
    }

    @Override
    public void Ability(Entity entity) {
        if ( getMp() > 0 && getMp() % 5 == 0 && getHp() <= 50) {
            setMp(getMp() - 5);
            isInvisible = true;
            System.out.println("Assassin used Invisible! He is now untouchable.");
        }
    }

    @Override
    public void attack(Entity enemy) {
        if (isInvisible) {
            System.out.println("💀 Assassin attacks from the shadows! (Double Damage)");
            enemy.takeDamage(20);
            isInvisible = false;
            System.out.println("🕶️ Assassin is now visible!");
        } else {
            super.attack(enemy);
        }
    }
    public boolean isInvisible() {
        return isInvisible;
    }

}
