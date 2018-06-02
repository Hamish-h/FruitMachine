import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FruitMachineTest {

    FruitMachine fruitMachine;

    @Before
    public void before(){
        fruitMachine = new FruitMachine(Selection.APPLE);
    }

    @Test
    public void canGetSelection(){
        assertEquals(Selection.APPLE, fruitMachine.getSelection(Selection.APPLE));
    }

}
