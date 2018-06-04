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
        // get our three choices
        Selection choiceOne = fruitMachine.getReelOneChoice();
        Selection choiceTwo = fruitMachine.getReelTwoChoice();
        Selection choiceThree = fruitMachine.getReelThreeChoice();
        // check they are all of type Selection
        assertEquals(choiceOne instanceof Selection, true);
        assertEquals(choiceTwo instanceof Selection, true);
        assertEquals(choiceThree instanceof Selection, true);
    }

    @Test


    // seed randomiser later ???

}

