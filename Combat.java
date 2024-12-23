package com.valkarinc.combat;

public interface Combat {
    void attack(Combatable target);
    void defend(int damage);
    boolean isAlive();
    int getHealth();
    int getMaxHealth();
    int getAttackSpeed();
    int getLastAttackTick();
    void setLastAttackTick(int tick);
}
