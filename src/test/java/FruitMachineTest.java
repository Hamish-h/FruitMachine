import org.junit.Before;
import org.junit.Test;
import sun.net.www.ApplicationLaunchException;

import static org.junit.Assert.assertEquals;

public class FruitMachineTest {

    FruitMachine fruitMachine;

    @Before
    public void before(){
        fruitMachine = new FruitMachine(Selection.APPLE, Selection.ORANGE, Selection.PEAR);
    }

    @Test
    public void canGetSelectionApple(){
        assertEquals(Selection.APPLE, fruitMachine.getSelection(Selection.APPLE));
    }

    @Test
    public void canGetSelectionOrange(){
        assertEquals(Selection.ORANGE, fruitMachine.getSelection(Selection.ORANGE));
    }

    @Test
    public void canGetSelectionPear(){
        assertEquals(Selection.PEAR, fruitMachine.getSelection(Selection.PEAR));
    }

    @Test
    public void CanGetSelectionAppleAppleApple(){
        fruitMachine.setReelOneChoice(Selection.APPLE);
        fruitMachine.setReelTwoChoice(Selection.APPLE);
        fruitMachine.setReelThreeChoice(Selection.APPLE);
        assertEquals("Congratulations", fruitMachine.getReels());
    }

}
