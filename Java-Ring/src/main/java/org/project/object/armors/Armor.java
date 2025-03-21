package org.project.object.armors;
import org.project.entity.Entity;
import org.project.object.GameObject;

// TODO: UPDATE IMPLEMENTATION
public abstract class Armor implements GameObject{
    private int defense;
    private int maxDefense;
    private int durability;
    private int maxDurability;

    private boolean isBroke;

    public Armor(int defense, int durability) {
        this.defense = defense;
        this.durability = durability;
    }

    public void checkBreak() {
        if (durability <= 0) {
            isBroke = true;
            defense = 0;
        }
    }

    // TODO: (BONUS) UPDATE THE REPAIR METHOD
    public void repair() {
        isBroke = false;
        defense = maxDefense;
        durability = maxDurability;
    }

    public void use(Entity target) {
    }
    public void useArmor() {
        if (durability > 0) {
            durability -= 10;
        }
    }

    public int getDefense() {
        return defense;
    }

    public int getDurability() {
        return durability;
    }

    public boolean isBroke() {
        return isBroke;
    }
}
