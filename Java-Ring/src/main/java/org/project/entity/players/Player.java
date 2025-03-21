package org.project.entity.players;

import org.project.entity.Entity;
import org.project.object.armors.Armor;
import org.project.object.weapons.Weapon;

// TODO: UPDATE IMPLEMENTATION
public abstract class Player implements Entity{
    protected String name;
    Weapon weapon;
    Armor armor;
    private int hp;
    private int maxHP;
    private int mp;
    private int maxMP;

    public Player(String name, int hp, int mp, Weapon weapon, Armor armor, int maxHP, int maxMP) {
        this.name = name;
        this.hp = hp;
        this.mp = mp;
        this.maxHP = hp;
        this.maxMP = mp;
        this.weapon = weapon;
        this.armor = armor;
    }

    @Override
    public void attack(Entity target) {
        target.takeDamage(weapon.getDamage());
    }

    @Override
    public void defend() {
        // TODO: (BONUS) IMPLEMENT A DEFENSE METHOD FOR SHIELDS
    }

    // TODO: (BONUS) UPDATE THE FORMULA OF TAKING DAMAGE
    @Override
    public void takeDamage(int damage) {
        if (armor != null) {
            armor.useArmor();
            damage -= armor.getDefense();
            if (armor.getDurability() <= 0) {
                armor = null;
                System.out.println("Armor is broken!");
            }
        }
        if (damage > 0) {
            hp -= damage;
        }
    }


    @Override
    public void heal(int health) {
        hp += health;
        if (hp > maxHP) {
            hp = maxHP;
        }
    }

    @Override
    public void fillMana(int mana) {
        mp += mana;
        if (mp > maxMP) {
            mp = maxMP;
        }
    }


    public String getName() {
        return name;
    }

    public int getHp() {
        if(hp<=0)
        {
            return 0;
        }
        return hp;
    }

    @Override
    public int getMaxHP() {
        return maxHP;
    }

    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        if(mp <0){
            mp = 0;
        }
        this.mp = mp;
    }
    @Override
    public int getMaxMP() {
        return maxMP;
    }

    public boolean alive () {
        if (hp <= 0) {
            return false;
        }
        return true;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public Armor getArmor() {
        return armor;
    }

    public abstract void Ability(Entity entity);

    public void takeDamageIgnoreArmor(int damage) {
        this.hp -= damage;
        System.out.println(getName() + " took " + damage + " damage ignoring armor!");
    }

    @Override
    public void setHp(int hp) {
        this.hp = hp;
    }
}
