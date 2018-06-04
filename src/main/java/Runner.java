public class Runner {

    public static void main(String[] args) {

//        FruitMachine fruitMachine = new FruitMachine();
//        fruitMachine.generateAllChoices();
//        fruitMachine.getReels();
//
//
//    }
//}

        boolean game = true;
        Integer gamePlay = 0;

        while (game = true) {

            // player spins
            if (gamePlay == 1){

                // exit clause if no credit
                if (playerCredits == 0){
                    System.out.println("Credit Required - Game Over - Collect any Payout!!!");
                    game = false;
                }

                else if (playerCredits != 0){
                    FruitMachine fruitMachine = new FruitMachine();
                    fruitMachine.generateAllChoices();
                    fruitMachine.getReels();
                }
            }

            if (gamePlay == 2){
                System.out.println("Game Over - Collect any Payout!!!");
                game = false;

            }
        }
  }
}