import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {

        FruitMachine fruitMachine = new FruitMachine();
        Player player = new Player();

        // user messages for player
        String line00 = "==============================";
        String line01 = "|   CODECLANS FRUIT MACHINE   |";
        String line02 = "|     £1  Credit per play     |";
        String line03 = "=======  ENTER AMOUNT ========";
        String line04 = " Enter 1 to play or 2 to exit!";
        String line05 = "CREDIT REFUND & WINNINGS £";
        String line06 = "You have £";
        String line07 = " on your VisaCard!";
        String line08 = " in credits!";
        String line09 = "That exceeds your VisaCard credit!";
        String line10 = "Invalid amount, enter £1 credit per play!";
        String line11 = "-------------------------------";

        // runner values
        Integer PlayerVisaCard;
        Integer playerCash;
        Integer playerTally = 0;
        Integer playerInput = 0;
        Integer playerPayout = 0;
        boolean runGame = true;

        // player instructions
        System.out.println();
        System.out.println(line00);
        System.out.println(line01);
        System.out.println(line02);

        // players wallet contents message
        System.out.println(line11);
        System.out.println(line06 + player.visaCard() + line07);
        System.out.println(line11);
        System.out.println(line03);

        // request player user input
        Scanner getPlayerMoney = new Scanner(System.in);
        playerCash = getPlayerMoney.nextInt();

            // if input value exceeds wallet contents then exit
            if (playerCash > 100){
                System.out.println(line09);
                runGame = false;
            }

            // if input value zero or less then exit
            if (playerCash <= 0){
                System.out.println(line10);
                runGame = false;
            }

            // set values
            fruitMachine.playerCredits = playerCash;

        // run the Fruit Machine Game
        while (runGame) {

            // adjust wallet contents
            PlayerVisaCard = (player.visaCard() - playerCash);

            // Set player instructions
            System.out.println(line11);
            System.out.println(line06 + PlayerVisaCard + line07);
            System.out.println(line11);
            System.out.println(line04);
            System.out.println(line11);
            System.out.println();

            // Get player input
                Scanner getPlayerInput = new Scanner(System.in);
                playerInput = getPlayerInput.nextInt();
            
            // player exits game
            if (playerInput == 2){
                // tally payouts (credits, winnings and visa)
                playerPayout = fruitMachine.playerCredits + fruitMachine.cashWinnings;
                playerTally = (playerPayout + PlayerVisaCard);
                // set output
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println(line11);
                System.out.println(line05 + playerPayout);
                System.out.println(line11);
                System.out.println(line06 + playerTally + line07);
                System.out.println(line11);
                System.out.println();
                System.out.println();
                // end the game
                runGame = false;
            }

            // player spins
            if (playerInput == 1){

                // exit game if player has no credits
                if (fruitMachine.playerCredits == 0){
                    // tally payouts (winnings and visa)
                    playerPayout = fruitMachine.cashWinnings;
                    playerTally = (playerPayout + PlayerVisaCard);
                    // set output
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println(line11);
                    System.out.println(line05 + playerPayout);
                    System.out.println(line11);
                    System.out.println(line06 + playerTally + line07);
                    System.out.println(line11);
                    System.out.println();
                    System.out.println();
                    //end the game
                    runGame = false;
                }

                // player plays the game
                else if (fruitMachine.playerCredits != 0){
                    // run FruitMachine
                    fruitMachine.generateAllChoices();
                    fruitMachine.getReels();
                }
            }
        }
    }
}
