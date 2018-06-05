import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {

        FruitMachine fruitMachine = new FruitMachine();

        Integer playerInput;
        boolean runGame = true;
        String line = " ";

        while (runGame) {

            // Set player instructions
            System.out.println();
            System.out.println("Enter 1 to play : 2 to exit!");
            System.out.println();

            // Get player input
            Scanner getPlayerInput = new Scanner(System.in);
            playerInput = getPlayerInput.nextInt();

            // player exits game
            if (playerInput == 2){
                System.out.println("Game Over - Collect any Payout!!!");
                runGame = false;
            }

            // player spins
            if (playerInput == 1){

                // exit clause if no credit
                if (fruitMachine.playerCredits == 0){
                    System.out.println("Credit Required - Game Over - Collect any Winnings!");
                    runGame = false;
                }

                // player spins reel
                else if (fruitMachine.playerCredits != 0){
                    fruitMachine.generateAllChoices();
                    fruitMachine.getReels();
                }
            }
        }
    }
}
