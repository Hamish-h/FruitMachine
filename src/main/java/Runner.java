import java.util.Scanner;

public class Runner extends FruitMachine {

    // bring in playerCredits
    public Runner(Integer playerCredits){
        super(this.playerCredits);
    }

    public static void main(String[] args) {

//        FruitMachine fruitMachine = new FruitMachine();
//        fruitMachine.generateAllChoices();
//        fruitMachine.getReels();
//
//
//    }
//}

        // User instructions
        System.out.println("Enter 1 to play the game");

        Scanner getPlayerInput = new Scanner(System.in);
        Integer gamePlay = getPlayerInput.nextInt();

        boolean game = true;

        while (game = true) {

            // User instructions
            System.out.println("Enter 1 to play the game : Enter 2 to exit the game when running");

            // player spins
            if (gamePlay == 1){

                // exit clause if no credit
                if (playerCredits == 0){
                    System.out.println("Credit Required - Game Over - Collect any Payout!!!");
                    game = false;
                }

                // player spins reel
                else if (playerCredits != 0){
                    FruitMachine fruitMachine = new FruitMachine();
                    fruitMachine.generateAllChoices();
                    fruitMachine.getReels();
                }
            }

            // player exits game
            if (gamePlay == 2){
                System.out.println("Game Over - Collect any Payout!!!");
                game = false;

            }
        }
    }
}