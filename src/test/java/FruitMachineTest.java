import org.junit.Before;
import org.junit.Test;
import sun.net.www.ApplicationLaunchException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

public class FruitMachineTest {

    FruitMachine fruitMachine;

    @Before
    public void before(){
        fruitMachine = new FruitMachine(Selection.APPLE, Selection.ORANGE, Selection.PEAR);
        //
//        fruitMachine.setReelOneChoice(Selection.PEAR);
//        fruitMachine.setReelTwoChoice(Selection.PEAR);
//        fruitMachine.setReelThreeChoice(Selection.PEAR);
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

    // Fruit machine uses random selection so tests can both pass and fail

    @Test
    public void CanSpin(){
        assertSame(fruitMachine.loserMessage, fruitMachine.getReels());
    }

    @Test
    public void CanGetLoser(){
//        fruitMachine.setReelOneChoice(Selection.APPLE);
//        fruitMachine.setReelTwoChoice(Selection.ORANGE);
//        fruitMachine.setReelThreeChoice(Selection.PEAR);
        assertEquals(Selection.APPLE, fruitMachine.getSelection(Selection.APPLE));
        assertEquals(Selection.ORANGE, fruitMachine.getSelection(Selection.ORANGE));
        assertEquals(Selection.PEAR, fruitMachine.getSelection(Selection.PEAR));
    }

    @Test
    public void CanGetWinner(){
//        fruitMachine.setReelOneChoice(Selection.PEAR);
//        fruitMachine.setReelTwoChoice(Selection.PEAR);
//        fruitMachine.setReelThreeChoice(Selection.PEAR);
        assertEquals(Selection.APPLE, fruitMachine.getReelOneChoice());
        assertEquals(Selection.ORANGE, fruitMachine.getReelTwoChoice());
        assertEquals(Selection.PEAR, fruitMachine.getReelThreeChoice());
    }



}

