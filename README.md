
# Tick-Based Combat System

## Overview

This is a modular and extensible tick-based combat system designed for games. The system allows for smooth and flexible combat mechanics, making it easy to expand and integrate into your projects.

---

## Features

### Core Features
- **Tick-Based Combat Mechanics**: Every action is processed in discrete "ticks," ensuring synchronized gameplay.
- **Modular Design Through Interfaces**: Easily extend or replace components by implementing standardized interfaces.
- **Extensible Base Classes**: Provides a solid foundation for creating new combatants, abilities, or mechanics.
- **Stats Tracking**: Tracks player and enemy stats, such as health, attack, defense, and more.
- **Flexible Attack Speed System**: Attack speed is calculated dynamically, allowing for diverse gameplay styles.
- **Basic Damage and Defense Calculations**: Simple but effective calculations for determining combat outcomes.

---

## Expansion Ideas

You can enhance this system by adding more advanced features:

### Suggested Features
1. **Status Effects**:
   - Poison, stun, burn, and other effects.
   - Apply buffs or debuffs to stats.
2. **Different Attack Types**:
   - Melee, ranged, and magic support.
   - Introduce piercing, slashing, crushing, and other attack types.
3. **Critical Hit System**:
   - Add critical hit mechanics for extra damage.
   - Include factors like luck or skill-based bonuses.
4. **Equipment System**:
   - Equip weapons, armor, and accessories.
   - Dynamically adjust stats based on equipment.
5. **Combat Styles**:
   - Implement different fighting styles (aggressive, defensive, etc.).
   - Allow style-specific bonuses.
6. **More Complex Damage Calculations**:
   - Introduce armor penetration, elemental damage, or percentage-based damage.
7. **Range/Magic Combat Support**:
   - Create distinct systems for ranged and magic attacks.
   - Add features like mana usage, ammo requirements, or spell cooldowns.

---

## Getting Started

### Prerequisites
- Basic understanding of game development and programming.
- Familiarity with object-oriented programming (OOP) concepts.

### How to Use
1. **Clone the Repository**:
   ```bash
   git clone https://github.com/valkarinc/combat-system.git
   ```
2. **Integrate into Your Project**:
   - Copy the core files into your game's codebase.
3. **Extend the System**:
   - Use the base classes and interfaces to add your own features.

---

## Example Usage

Here's a quick example of creating a combatant and initiating combat:

```java
Combatant player = new Player("Hero", 100, 15, 10);
Combatant enemy = new Enemy("Goblin", 50, 10, 5);

CombatEngine engine = new CombatEngine();
engine.startCombat(player, enemy);
```

---

## Contributing

Contributions are welcome! Please fork the repository and submit a pull request with your improvements.

---

## License

This project is licensed under the MIT License. See the `LICENSE` file for more details.
