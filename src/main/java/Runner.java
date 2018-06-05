import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {

        FruitMachine fruitMachine = new FruitMachine();
        Player player = new Player();

        // user interface messages for player
        String line01 = "-=- CODECLAN FRUIT MACHINE -=-";
        String line02 = "     £1 credit per play";
        String line03 = "        Enter Coins";
        String line04 = "Enter 1 to play or 2 to exit!";
        String line05 = "CREDIT and WINNING payout £";
        String line06 = "Your have £";
        String line07 = " in your wallet!";
        String line08 = "That's more than you have in your wallet!";
        String line09 = "Invalid amount, enter £1 credit per play!";

        // runner values
        Integer playerWallet;
        Integer playerMoney;
        Integer playerInput = 0;
        Integer playerPayout = 0;
        boolean runGame = true;

        // player instructions
        System.out.println();
        System.out.println(line01);
        System.out.println(line02);
        System.out.println(line03);
        System.out.println();

        // players money message
        System.out.println(line06 + player.getWallet() + line07);
        System.out.println(line03);

        // request player user input
        Scanner getPlayerMoney = new Scanner(System.in);
        playerMoney = getPlayerMoney.nextInt();

            // if input value exceeds wallet contents then exit
            if (playerMoney > 100){
                System.out.println(line08);
                runGame = false;
            }

            // if input value zero or less then exit
            if (playerMoney <= 0){
                System.out.println(line09);
                runGame = false;
            }

            // set values
            fruitMachine.playerCredits = playerMoney;

        // run the Fruit Machine Game
        while (runGame) {

            // Set player instructions
            System.out.println();
            System.out.println(line04);
            System.out.println();

            // Get player input
                Scanner getPlayerInput = new Scanner(System.in);
                playerInput = getPlayerInput.nextInt();
            
            // player exits game
            if (playerInput == 2){
                playerPayout = fruitMachine.playerCredits + fruitMachine.cashWinnings;
                System.out.println(line05 + playerPayout);
                runGame = false;
            }

            // player spins
            if (playerInput == 1){

                // exit game if player has no credits
                if (fruitMachine.playerCredits == 0){
                    playerPayout = fruitMachine.cashWinnings;
                    System.out.println(line05 + playerPayout);
                    runGame = false;
                }

                // player plays the game
                else if (fruitMachine.playerCredits != 0){
                    fruitMachine.generateAllChoices();
                    fruitMachine.getReels();
                }
            }
        }
    }
}
