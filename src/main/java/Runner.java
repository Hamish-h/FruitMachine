import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {

        FruitMachine fruitMachine = new FruitMachine();

        String line01 = "@|@ CODECLAN FRUIT MACHINE @|@";
        String line02 = "     £1 credit per play";
        String line03 = "        Enter Coins";
        String line04 = "Enter 1 to play or 2 to exit!";
        String line05 = "Game Over, the CREDIT and WINNING payout is £";

        Integer playerMoney;
        Integer playerInput;
        Integer payout = 0;
        boolean runGame = true;

        // Set player instructions
        System.out.println();
        System.out.println(line01);
        System.out.println(line02);
        System.out.println(line03);
        System.out.println();

        // get players money
        Scanner getPlayerMoney = new Scanner(System.in);
        playerMoney = getPlayerMoney.nextInt();

        // set values
        fruitMachine.playerCredits = playerMoney;

        // run the FruitMachine
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
                payout = fruitMachine.playerCredits + fruitMachine.cashWinnings;
                System.out.println(line05 + payout);
                runGame = false;
            }

            // player spins
            if (playerInput == 1){

                // exit and payout if no credit left
                if (fruitMachine.playerCredits == 0){
                    payout = fruitMachine.cashWinnings;
                    System.out.println(line05 + payout);
                    runGame = false;
                }

                // player plays game
                else if (fruitMachine.playerCredits != 0){
                    fruitMachine.generateAllChoices();
                    fruitMachine.getReels();
                }
            }
        }
    }
}
