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

    @Test
    public void CanGameSpin(){
        fruitMachine.generateAllChoices();
        // get three choices
        Selection choiceOne = fruitMachine.getReelOneChoice();
        Selection choiceTwo = fruitMachine.getReelTwoChoice();
        Selection choiceThree = fruitMachine.getReelThreeChoice();
        // compare they are all of type Selection
        assertEquals(choiceOne instanceof Selection, true);
        assertEquals(choiceTwo instanceof Selection, true);
        assertEquals(choiceThree instanceof Selection, true);
    }

    // note: Fruit machine uses random selection and test
    //       can both pass and fail
    @Test
    public void CanGetAnyRandomAnswerReelOne(){
        fruitMachine.generateAllChoices();
        Selection choiceOne = fruitMachine.getReelOneChoice();
        assertEquals(Selection.APPLE, fruitMachine.getReelOneChoice());
    }

    // note: Fruit machine uses random selection and test
    //       can both pass and fail
    @Test
    public void CanGetAnyRandomAnswerReelTwo(){
        fruitMachine.generateAllChoices();
        Selection choiceOne = fruitMachine.getReelTwoChoice();
        assertEquals(Selection.PEAR, fruitMachine.getReelTwoChoice());
    }

    // note: Fruit machine uses random selection and test
    //       can both pass and fail
    @Test
    public void CanGetAnyRandomAnswerReelThree(){
        fruitMachine.generateAllChoices();
        Selection choiceOne = fruitMachine.getReelThreeChoice();
        assertEquals(Selection.PEAR, fruitMachine.getReelThreeChoice());
    }


    // seed randomiser (test only) later ???
    // read mocking

}

