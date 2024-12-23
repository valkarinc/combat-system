// only for example purposes
public class GameExample {
    public static void main(String[] args) {
        // player creation (recommend expanding this by a longshot if you pull this)
        Player player1 = new Player(100, 4, 10, 5, 5);
        Player player2 = new Player(100, 3, 8, 4, 6);

        // Simulate combat for 10 ticks
        for (int i = 0; i < 10; i++) {
            CombatSystem.processCombat(player1, player2);
            CombatSystem.processCombat(player2, player1);
            CombatSystem.incrementTick();
            
            System.out.println("Tick " + CombatSystem.getCurrentTick());
            System.out.println("Player 1 Health: " + player1.getHealth());
            System.out.println("Player 2 Health: " + player2.getHealth());
        }
    }
}
