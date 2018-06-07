import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {

        FruitMachine fruitMachine = new FruitMachine();
        Player player = new Player();

        // runner messages for player
        String displayDoubleLine = "==============================";
        String displaySingleLine = "------------------------------";
        String displayFruitMachine = "|   CODECLANS FRUIT MACHINE   |";
        String displayLineApples = "|  APPLE 3x£30 4x£90 5x£500!  |";
        String displayPears = "|  PEARS 3x£30 4x£90 5x£500!  |";
        String displayLimes = "|  LIMES 3x£30 4x£90 5x£500!  |";
        String displayPayout = "|     * * * PAYOUT * * *      |";
        String displayCreditPerPlay = "|     £1  Credit per play     |";
        String displayBuyCredits = "=======  BUY CREDITS  ========";
        String displayPlayerOptions = "   1 = play   2 = winnings!";
        String displayCreditRefundWinnings = " CREDIT REFUND & WINNINGS £";
        String displayYouHave = "You have £";
        String displayOnYourVisa = " on your VisaCard!";
        String displayDataInvalidGameOver = "Data entered invalid, Game Over!";
        String displayExceedsVisaCredit = "That exceeds your VisaCard credit!";
        String displayInvalidAmount = "Invalid amount, £1 credit per play!";

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
        System.out.println(displayDoubleLine + "\n" + displayFruitMachine + "\n" + displayLineApples + "\n" + displayPears + "\n" + displayLimes + "\n" + displaySingleLine + "\n" + displayCreditPerPlay);

        // players wallet contents message
        System.out.println(displaySingleLine);
        System.out.println(displayYouHave + player.visaCard() + displayOnYourVisa);
        System.out.println(displaySingleLine + "\n" + displayBuyCredits);
        //     System.out.println(displayBuyCredits);

        // get player input
        Scanner getPlayerMoney = new Scanner(System.in);
        playerCash = getPlayerMoney.nextInt();

        // exit if player input exceeds credit card limit
        if (playerCash > 100){
            System.out.println(displayExceedsVisaCredit);
            runGame = false;
        }

        // exit if player enters negative or zero value
        if (playerCash <= 0){
            System.out.println(displayInvalidAmount);
            runGame = false;
        }

        // set values
        fruitMachine.playerCredits = playerCash;

        // run the Fruit Machine Game
        while (runGame) {

            // adjust visa contents
            PlayerVisaCard = (player.visaCard() - playerCash);

            // Set player instructions
            System.out.println(displaySingleLine);
            System.out.println(displayYouHave + PlayerVisaCard + displayOnYourVisa);
            System.out.println(displaySingleLine + "\n" + displayPlayerOptions + "\n" + displaySingleLine);

            // Get player input
            Scanner getPlayerInput = new Scanner(System.in);
            playerInput = getPlayerInput.nextInt();

            // exit if player enters any other characters
            if (playerInput != 1 && playerInput != 2) {
                System.out.println(displayDataInvalidGameOver);
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

                System.out.println(displaySingleLine + "\n" + displayPayout + "\n" + displayFruitMachine + "\n" + displaySingleLine);
                System.out.println(displayCreditRefundWinnings + playerPayout);
                System.out.println(displaySingleLine);
                System.out.println(displayYouHave + playerTally + displayOnYourVisa);
                System.out.println(displaySingleLine + "\n" + date + "\n" + displayDoubleLine);


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
                    System.out.println(displaySingleLine + "\n" + displayPayout + "\n" + displayFruitMachine + "\n" + displaySingleLine);
                    System.out.println(displayCreditRefundWinnings + playerPayout);
                    System.out.println(displaySingleLine);
                    System.out.println(displayYouHave + playerTally + displayOnYourVisa);
                    System.out.println(displaySingleLine + "\n" + date + "\n" + displayDoubleLine);

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
