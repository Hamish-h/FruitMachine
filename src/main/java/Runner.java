import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {

        FruitMachine fruitMachine = new FruitMachine();
        fruitMachine.generateAllChoices();
        fruitMachine.getReels();


    }
}

//        Scanner getPlayerInput = new Scanner(System.in);
//        Integer gamePlay = getPlayerInput.nextInt();
//
//        boolean game = true;
//
//
//        while (game = true) {
//
//            // player spins
//            if (gamePlay == 1){
//
//                // exit clause if no credit
//                if (playerCredits == 0){
//                    System.out.println("Credit Required - Game Over - Collect any Payout!!!");
//                    game = false;
//                }
//
//                // player spins reel
//                else if (playerCredits != 0){
//                    FruitMachine fruitMachine = new FruitMachine();
//                    fruitMachine.generateAllChoices();
//                    fruitMachine.getReels();
//                }
//            }
//
//            // player exits game
//            if (gamePlay == 2){
//                System.out.println("Game Over - Collect any Payout!!!");
//                game = false;
//
//            }
//        }
//  }
//}