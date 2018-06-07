import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {

        FruitMachine fruitMachine = new FruitMachine();
        Player player = new Player();

        // runner messages for player
        String line00 = "==============================";
        String line01 = "|   CODECLANS FRUIT MACHINE   |";
        String line02 = "|     £1  Credit per play     |";
        String line03 = "=======  BUY CREDITS  ========";
        String line04 = " Enter 1 to play or 2 to exit!";
        String line05 = " CREDIT REFUND & WINNINGS £";
        String line06 = "You have £";
        String line07 = " on your VisaCard!";
        String line08 = "Data entered invalid, Game Over!";
        String line09 = "That exceeds your VisaCard credit!";
        String line10 = "Invalid amount, £1 credit per play!";
        String line11 = "-------------------------------";
        String line12 = "|  APPLE 3x£30 4x£90 5x£500!  |";
        String line13 = "|  PEARS 3x£30 4x£90 5x£500!  |";
        String line14 = "|  LIMES 3x£30 4x£90 5x£500!  |";
        String line15 = "|     * * * PAYOUT * * *      |";

        // runner values
        Integer PlayerVisaCard;
        Integer playerCash;
        Integer playerTally = 0;
        Integer playerInput = 0;
        Integer playerPayout = 0;
        Integer lines;
        boolean runGame = true;
        java.util.Date date = new java.util.Date();

        // player instructions
        System.out.println(line00 + "\n" + line01 + "\n" + line12 + "\n" + line13 + "\n" + line14 + "\n" + line11 + "\n" + line02);

        // players wallet contents message
        System.out.println(line11);
        System.out.println(line06 + player.visaCard() + line07);
        System.out.println(line11 + "\n" + line03);
        //     System.out.println(line03);

        // get player input
        Scanner getPlayerMoney = new Scanner(System.in);
        playerCash = getPlayerMoney.nextInt();

        // exit if player input exceeds credit card limit
        if (playerCash > 100){
            System.out.println(line09);
            runGame = false;
        }

        // exit if player enters negative or zero value
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
            System.out.println(line11 + "\n" + line04 + "\n" + line11);

            // Get player input
            Scanner getPlayerInput = new Scanner(System.in);
            playerInput = getPlayerInput.nextInt();

            // exit if player enters any other characters
            if (playerInput != 1 && playerInput != 2) {
                System.out.println(line08);
                runGame = false;
            }

            // player exits game
            if (playerInput == 2){
                // tally payouts (credits, winnings and visa)
                playerPayout = fruitMachine.playerCredits + fruitMachine.cashWinnings;
                playerTally = (playerPayout + PlayerVisaCard);

                // clear screen
                for (lines = 0; lines <= 20; lines++)
                    System.out.println();

                // set output payout

                System.out.println(line11 + "\n" + line15 + "\n" + line01 + "\n" + line11);
                System.out.println(line05 + playerPayout);
                System.out.println(line11);
                System.out.println(line06 + playerTally + line07);
                System.out.println(line11 + "\n" + date + "\n" + line11);


                // spacer
                for (lines = 0; lines <= 2; lines++)
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

                    // clear screen
                    for (lines = 0; lines <= 20; lines++)
                        System.out.println();

                    // set output payout
                    System.out.println(line11 + "\n" + line15 + "\n" + line01 + "\n" + line11);
                    System.out.println(line05 + playerPayout);
                    System.out.println(line11);
                    System.out.println(line06 + playerTally + line07);
                    System.out.println(line11 + "\n" + date + "\n" + line11);

                    // spacer
                    for (lines = 0; lines <= 2; lines++)
                        System.out.println();

                    //end the game
                    runGame = false;
                }

                // player plays the game
                else if (fruitMachine.playerCredits != 0){

                    // clear space
                    for (lines = 0; lines <= 20; lines++)
                        System.out.println();

                    // run FruitMachine
                    fruitMachine.generateAllChoices();
                    fruitMachine.getReels();
                }
            }
        }
    }
}
