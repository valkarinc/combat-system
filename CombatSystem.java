package com.valkarinc.combat;

public class CombatSystem {
    private static int currentTick = 0;
    private static final int TICKS_PER_SECOND = 100; //definitely recommend adjusting this (for my 2d game i utilize 60-100 ticks for developmental purposes)
    public static int getCurrentTick() {
        return currentTick;
    }

    public static void incrementTick() {
        currentTick++;
    }

    public static boolean canAttack(Combatable entity) {
        int ticksSinceLastAttack = currentTick - entity.getLastAttackTick();
        return ticksSinceLastAttack >= (TICKS_PER_SECOND / entity.getAttackSpeed());
    }

    public static void processCombat(Combatable attacker, Combatable defender) {
        if (canAttack(attacker)) {
            attacker.attack(defender);
        }
    }

    public static void reset() {
        currentTick = 0;
    }
}
