package com.valkarinc.combat;

public abstract class AbstractCombatEntity implements Combat {
    protected int health;
    protected int maxHealth;
    protected int attackSpeed;
    protected int attackDamage;
    protected int lastAttackTick;
    protected CombatStats stats;

    public AbstractCombatEntity(int maxHealth, int attackSpeed, int attackDamage) {
        this.maxHealth = maxHealth;
        this.health = maxHealth;
        this.attackSpeed = attackSpeed;
        this.attackDamage = attackDamage;
        this.lastAttackTick = 0;
        this.stats = new CombatStats();
    }

    @Override
    public void attack(Combat target) {
        if (target == null || !target.isAlive() || !isAlive()) {
            return;
        }
        target.defend(calculateDamage());
        setLastAttackTick(CombatSystem.getCurrentTick());
        stats.incrementAttacks();
    }

    @Override
    public void defend(int damage) {
        if (!isAlive()) return;
        int actualDamage = Math.max(0, damage - calculateDefense());
        health = Math.max(0, health - actualDamage);
        stats.addDamageTaken(actualDamage);
    }

    protected abstract int calculateDamage();
    protected abstract int calculateDefense();

    @Override
    public boolean isAlive() {
        return health > 0;
    }

    @Override
    public int getHealth() {
        return health;
    }

    @Override
    public int getMaxHealth() {
        return maxHealth;
    }

    @Override
    public int getAttackSpeed() {
        return attackSpeed;
    }

    @Override
    public int getLastAttackTick() {
        return lastAttackTick;
    }

    @Override
    public void setLastAttackTick(int tick) {
        this.lastAttackTick = tick;
    }
}
