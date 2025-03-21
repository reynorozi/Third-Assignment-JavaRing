package org.project.entity.players;

import org.project.entity.Entity;
import org.project.object.armors.KnightArmor;
import org.project.object.armors.SimpleArmor;
import org.project.object.consumables.Flask;
import org.project.object.weapons.Sword;


// TODO: UPDATE IMPLEMENTATION
public class Wizard extends Player {
    // TODO: DESIGN KNIGHT'S WEAPON AND ARMOR AND IMPLEMENT THE CONSTRUCTOR
    boolean flaskUsed = false;
    public Wizard () {
        super("Wizard ", 100, 20, new Sword(),new SimpleArmor(),100,20);
    }
    Flask flask = new Flask();
    @Override
    public void Ability(Entity entity) {
        if (getMp() > 0 && getHp() <= 30) {
            if (getMp() % 5 == 0) {
                heal(10);
                System.out.println("🧙‍♂️Wizard healed himself!!!");
                setMp(getMp() - 5);
            }
        }

        if (getHp() == 10 && !flaskUsed) {
            System.out.println("✅ Flask activated!");
            flask.use(this);
            flaskUsed = true;
        }
    }
}


