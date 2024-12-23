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
    //@todo: add in further combat logic
    void applyStatusEffect(StatusEffect effect);
    void removeStatusEffect(StatusEffect effect);
    boolean hasStatusEffect(StatusEffect effect);
    int getCriticalHitChance();
    void equip(Item item);
    void unequip(Item item);
    boolean hasEquipped(Item item);
    CombatStyle getCombatStyle();
    void setCombatStyle(CombatStyle style);
}
