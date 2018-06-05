import java.util.Scanner;

public class Runner {

//    // bring in playerCredits
//    public Runner(Integer playerCredits) {
//        super(this.playerCredits);
//    }

    public static void main(String[] args) {

        boolean game = true;
        Integer playerCredits = 20;
        Integer gamePlay;

        // User instruct1ions
        System.out.println("Enter 1 to play the game");

        Scanner getPlayerInput = new Scanner(System.in);
        gamePlay = getPlayerInput.nextInt();

        while (game = true) {

            // User instructions
            System.out.println("Enter 1 to spin the reels : Enter 2 to exit!");

            // player exits game
            if (gamePlay == 2){
                System.out.println("Game Over - Collect any Payout!!!");
                game = false;
            }

            // player spins
            if (gamePlay == 1){

                // exit clause if no credit
                if (playerCredits == 0){
                    System.out.println("Credit Required - Game Over - Collect any Payout!!!");
                    game = false;
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





//        FruitMachine fruitMachine = new FruitMachine();
//        fruitMachine.generateAllChoices();
//        fruitMachine.getReels();
//
//
//    }
//}