import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class FruitMachineTest {

    private FruitMachine fruitMachine;

    @Before
    public void before(){
        fruitMachine = new FruitMachine();
    }

    @Test
    public void canGetPlayerCredits(){
        assertEquals(0, fruitMachine.getNumberOfPlayerCredits());
    }

    @Test
    public void canGetCashWinnings(){
        assertEquals(0, fruitMachine.getNumberOfCashWinnings());
    }

    @Test
    public void CanGetAnyRandomAnswerReelOne(){
        fruitMachine.generateAllChoices();
        Selection choiceOne = fruitMachine.getReelOneChoice();
        assertNotNull(choiceOne);
    }

    @Test
    public void CanGetAnyRandomAnswerReelTwo(){
        fruitMachine.generateAllChoices();
        Selection choiceOne = fruitMachine.getReelTwoChoice();
        assertNotNull(choiceOne);
    }

    @Test
    public void CanGetAnyRandomAnswerReelThree(){
        fruitMachine.generateAllChoices();
        Selection choiceOne = fruitMachine.getReelThreeChoice();
        assertNotNull(choiceOne);
    }

    @Test
    public void CanGetAnyRandomAnswerReelFour(){
        fruitMachine.generateAllChoices();
        Selection choiceOne = fruitMachine.getReelFourChoice();
        assertNotNull(choiceOne);
    }

    @Test
    public void CanGetAnyRandomAnswerReelFive(){
        fruitMachine.generateAllChoices();
        Selection choiceOne = fruitMachine.getReelFiveChoice();
        assertNotNull(choiceOne);
    }

    @Test
    public void CanGameSpin(){
        fruitMachine.generateAllChoices();
        // get three choices, reel1, reel2, reel3
        Selection choiceOne = fruitMachine.getReelOneChoice();
        Selection choiceTwo = fruitMachine.getReelTwoChoice();
        Selection choiceThree = fruitMachine.getReelThreeChoice();
        Selection choiceFour = fruitMachine.getReelFourChoice();
        Selection choiceFive = fruitMachine.getReelFiveChoice();
        // compare they are all of type Selection
        assertEquals(choiceOne instanceof Selection, true);
        assertEquals(choiceTwo instanceof Selection, true);
        assertEquals(choiceThree instanceof Selection, true);
        assertEquals(choiceFour instanceof Selection, true);
        assertEquals(choiceFive instanceof Selection, true);
    }


    // seed randomiser (test only) later ???
    // read mocking

}

