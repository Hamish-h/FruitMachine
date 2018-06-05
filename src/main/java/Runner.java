import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {

        FruitMachine fruitMachine = new FruitMachine();



        Integer playerMoney;
        Integer playerInput;
        boolean runGame = true;

        // Set player instructions
        System.out.println();
        System.out.println();
        System.out.println("ENTER £££ COINS");
        System.out.println();
        System.out.println();

        // get players money
        Scanner getPlayerMoney = new Scanner(System.in);
        playerMoney = getPlayerMoney.nextInt();

        fruitMachine.playerCredits = playerMoney;

        while (runGame) {

            // Set player instructions
            System.out.println();
            System.out.println();
            System.out.println("Enter 1 to play : 2 to exit!");
            System.out.println();
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
                    System.out.println("Game Over - Collect any Winnings!");
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
