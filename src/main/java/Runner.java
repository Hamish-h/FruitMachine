import org.omg.CORBA.FREE_MEM;
import sun.plugin2.os.windows.SECURITY_ATTRIBUTES;

public class Runner {

    public static void main(String[] args) {

        FruitMachine fruitMachine = new FruitMachine();
        fruitMachine.generateAllChoices();
        fruitMachine.getReels();
    }
}
