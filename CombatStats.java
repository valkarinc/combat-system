package com.valkarinc.combat;

public class CombatStats {
    private int totalAttacks;
    private int damageTaken;
    private int damageDealt;
    private int kills;

    public CombatStats() {
        this.totalAttacks = 0;
        this.damageTaken = 0;
        this.damageDealt = 0;
        this.kills = 0;
    }

    public void incrementAttacks() {
        totalAttacks++;
    }

    public void addDamageTaken(int damage) {
        damageTaken += damage;
    }

    public void addDamageDealt(int damage) {
        damageDealt += damage;
    }

    public void incrementKills() {
        kills++;
    }

    // Getters
    public int getTotalAttacks() { return totalAttacks; }
    public int getDamageTaken() { return damageTaken; }
    public int getDamageDealt() { return damageDealt; }
    public int getKills() { return kills; }
}
