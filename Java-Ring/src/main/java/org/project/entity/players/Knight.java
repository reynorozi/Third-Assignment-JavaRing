package org.project.entity.players;

import org.project.entity.Entity;
import org.project.object.GameObject;
import org.project.object.armors.KnightArmor;
import org.project.object.weapons.Sword;
import org.project.object.weapons.Weapon;

// TODO: UPDATE IMPLEMENTATION
public class Knight extends Player {
    // TODO: DESIGN KNIGHT'S WEAPON AND ARMOR AND IMPLEMENT THE CONSTRUCTOR
    public Knight () {
        super("Knight ", 150, 10, new Sword(),new KnightArmor(),150,10);
    }
    @Override
    public void Ability (Entity MM) {
        if(getMp() > 0){
        if(getMp() % 5 == 0 && getHp() <= 100 ){
            MM.takeDamage(20);
            System.out.println("✊Knight punched\n" + MM.getName() + "HP is " + MM.getHp());
                setMp(getMp() - 5);

        }
    }
}
}

