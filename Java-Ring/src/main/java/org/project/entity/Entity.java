package org.project.entity;

import java.lang.foreign.SymbolLookup;

public interface Entity {
    void attack(Entity target);

    void defend();

    void heal(int health);

    void fillMana(int mana);

    void takeDamage(int damage);

    int getMaxHP();

    int getMaxMP();

    boolean alive();
    /*
    TODO: ADD OTHER REQUIRED AND BONUS METHODS
    */
    int getHp();
    String getName();
    void Ability (Entity entity);
    void setHp(int hp);
}
