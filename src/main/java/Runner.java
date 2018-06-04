import org.omg.CORBA.FREE_MEM;

public class Runner {

    public static void main(String[] args) {

        FruitMachine fruitMachine = new FruitMachine();
        fruitMachine.randomiseReelChoice();
        fruitMachine.getReelOneChoice();
        fruitMachine.getReelTwoChoice();
        fruitMachine.getReelThreeChoice();
        fruitMachine.getReels();
    }
}
