package org.project.entity.enemies;
import org.project.entity.Entity;
import org.project.object.weapons.Weapon;

// TODO: UPDATE IMPLEMENTATION
public abstract class Enemy implements Entity{
    Weapon weapon;
    private int hp;
    private int mp;
    protected String name;
    public Enemy(int hp, int mp, Weapon weapon, String name) {
        this.hp = hp;
        this.mp = mp;
        this.weapon = weapon;
        this.name = name;
    }

    // TODO: (BONUS) UPDATE THE FORMULA OF TAKING DAMAGE
    @Override

    public  boolean  alive () {
        if (hp <= 0) {
            return false;
        }
            return true;
    }
    public void attack(Entity target) {
        target.takeDamage(weapon.getDamage());
    }

    public void takeDamage(int damage) {
        hp -= damage;
    }

    public int getHp() {
        if(hp<=0)
        {
            return 0;
        }
        return hp;
    }

    public int getMp() {
        return mp;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public int getMaxMP() {
       return 0;
    }

    public int getMaxHP() {
        return 0;
    }

    public String getName() {
        return name;
    }

    public void heal(int damage) {}

    public void fillMana(int mana) {}

    public void defend(){}

    public abstract void Ability(Entity entity);

    @Override
    public void setHp(int hp) {
        this.hp = hp;
    }
}
