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

    // Fruit machine uses random selection so this test can both pass and fail
    // The test passes when a losing combination is spun
    // The test fails when a winning combination is spun
    @Test
    public void CanGetLoser(){
        fruitMachine.setReelOneChoice(Selection.APPLE);
        fruitMachine.setReelTwoChoice(Selection.PEAR);
        fruitMachine.setReelThreeChoice(Selection.ORANGE);
        assertEquals(fruitMachine.loser, fruitMachine.getReels());
    }

    // Fruit machine uses random selection so this test can both pass and fail
    // The test passes when a winning combination is spun
    // The test fails when a losing combination is spun
    @Test
    public void CanGetWinner(){
        fruitMachine.setReelOneChoice(Selection.APPLE);
        fruitMachine.setReelTwoChoice(Selection.APPLE);
        fruitMachine.setReelThreeChoice(Selection.APPLE);
        assertEquals(fruitMachine.winner, fruitMachine.getReels());
    }

}

