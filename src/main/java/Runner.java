import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {

        Integer playerCredits = 20;
        Integer playerInput;

        // User instructions
        System.out.println("Enter 1 to play the game");

        Scanner getPlayerInput = new Scanner(System.in);
        playerInput = getPlayerInput.nextInt();

        boolean runGame = true;

        while (runGame) {

            // User instructions
            System.out.println("Enter 1 to spin the reels : Enter 2 to exit!");

            playerInput = getPlayerInput.nextInt();

            // player exits game
            if (playerInput == 2){
                System.out.println("Game Over - Collect any Payout!!!");
                runGame = false;
            }

            // player spins
            if (playerInput == 1){

                // exit clause if no credit
                if (playerCredits == 0){
                    System.out.println("Credit Required - Game Over - Collect any Payout!!!");
                    runGame = false;
                }

                // player spins reel
                else if (playerCredits != 0){
                    playerCredits -= 1;
                    FruitMachine fruitMachine = new FruitMachine();
                    fruitMachine.generateAllChoices();
                    fruitMachine.getReels();
                }
            }
        }
    }
}
