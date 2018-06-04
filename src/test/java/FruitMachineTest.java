import org.junit.Before;
import org.junit.Test;
import sun.net.www.ApplicationLaunchException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

public class FruitMachineTest {

    private FruitMachine fruitMachine;

    @Before
    public void before(){
        fruitMachine = new FruitMachine();
    }

    // Fruit machine uses random selection so tests can both pass and fail

    @Test
    public void CanGameSpin(){
        fruitMachine.generateAllChoices();
        // get three choices
        Selection choiceOne = fruitMachine.getReelOneChoice();
        Selection choiceTwo = fruitMachine.getReelTwoChoice();
        Selection choiceThree = fruitMachine.getReelThreeChoice();
        // compare they are all type Selection
        assertEquals(choiceOne instanceof Selection, true);
        assertEquals(choiceTwo instanceof Selection, true);
        assertEquals(choiceThree instanceof Selection, true);
    }

    @Test
    public void CanGetAnyRandomAnswer(){
        fruitMachine.generateAllChoices();
        Selection choiceOne = fruitMachine.getReelOneChoice();
        assertEquals(Selection.APPLE, fruitMachine.getReelOneChoice());
    }


    // seed randomiser (test only) later ???

}

