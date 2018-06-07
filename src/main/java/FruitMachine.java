import java.util.Random;

public class FruitMachine {

    private Selection reelOneChoice;
    private Selection reelTwoChoice;
    private Selection reelThreeChoice;
    // Extension
    private Selection reelFourChoice;
    private Selection reelFiveChoice;

    private String prefix;
    private String line01;
    private String line02;
    private String line03;
    private String line04;
    private String line05;
    private String pipe;
    private String winnerMessage;
    private String winnerTotal;
    private String losingMessage;
    private String postfix;

    Integer cashWinnings = 0;
    Integer playerCredits = 0;

    public FruitMachine(){

        // machine output messages for 'getReels'
        this.line01 = "==============================";
        this.line02 = "| APPLE 3x£30 4x£90 5x£500 ! |";
        this.line03 = "| PEARS 3x£30 4x£90 5x£500 ! |";
        this.line04 = "| LIMES 3x£30 4x£90 5x£500 ! |";
        this.line05 = "------------------------------";
        this.prefix = "|   CODECLAN FRUIT MACHINE   |";
        this.pipe = "|";
        this.winnerTotal = "      WINNINGS   £";
        this.winnerMessage = "Congratulations, YOU HAVE WON";
        this.losingMessage = "Unlucky this time, try again?";
        this.postfix = "Your remaining credit is £";

        // values
        this.playerCredits = 0;
        this.cashWinnings = 0;
    }

    // random
    public Selection randomiseReelChoice() {
        Selection[] array = {Selection.APPLE, Selection.LIME, Selection.PEAR};
        Random choice = new Random();
        int select = choice.nextInt(array.length);
        return array[select];
    }

    // setters
    public void generateAllChoices(){
        this.setReelOneChoice();
        this.setReelTwoChoice();
        this.setReelThreeChoice();
        this.setReelFourChoice();
        this.setReelFiveChoice();
    }
    public void setReelOneChoice() { this.reelOneChoice = randomiseReelChoice(); }
    public void setReelTwoChoice() { this.reelTwoChoice = randomiseReelChoice(); }
    public void setReelThreeChoice() { this.reelThreeChoice = randomiseReelChoice(); }
    public void setReelFourChoice() { this.reelFourChoice = randomiseReelChoice(); }
    public void setReelFiveChoice() { this.reelFiveChoice = randomiseReelChoice(); }

    // getters
    public Selection getReelOneChoice() { return reelOneChoice; }
    public Selection getReelTwoChoice() { return reelTwoChoice; }
    public Selection getReelThreeChoice() { return reelThreeChoice; }
    public Selection getReelFourChoice() { return reelFourChoice; }
    public Selection getReelFiveChoice() { return reelFiveChoice; }
    public int getNumberOfPlayerCredits(){ return playerCredits; }
    public int getNumberOfCashWinnings(){ return cashWinnings; }

    // reel choice
    public String getReels() {
        Selection reelOne = getReelOneChoice();
        Selection reelTwo = getReelTwoChoice();
        Selection reelThree = getReelThreeChoice();
        Selection reelFour = getReelFourChoice();
        Selection reelFive = getReelFiveChoice();

        // deduct credits
        playerCredits -= 1;

        // display output
        System.out.println(line01 + "\n" + prefix + "\n" + line02 + "\n" + line03 + "\n" + line04 + "\n" + line01);

        // WINNING LINES

        // winning line of five apples £500
        if ((reelOne == Selection.APPLE) && (reelTwo == Selection.APPLE) && (reelThree == Selection.APPLE) && (reelFour == Selection.APPLE)&& (reelFive == Selection.APPLE)){ cashWinnings = (cashWinnings + 500);
            System.out.println(pipe + reelOne + pipe + reelTwo + pipe + reelThree + pipe + reelFour + pipe + reelFive + pipe + "\n" + line01 + "\n" + winnerMessage + "\n" + line05 + "\n" + winnerTotal + cashWinnings + "\n" + line05 + "\n" + postfix + playerCredits);
        }

        // winning lines of four apples £100
        else if ((reelOne == Selection.APPLE) && (reelTwo == Selection.APPLE) && (reelThree == Selection.APPLE) && (reelFour == Selection.APPLE)) { cashWinnings = (cashWinnings + 100);
            System.out.println(pipe + reelOne + pipe + reelTwo + pipe + reelThree + pipe + reelFour + pipe + reelFive + pipe + "\n" + line01 + "\n" + winnerMessage + "\n" + line05 + "\n" + winnerTotal + cashWinnings + "\n" + line05 + "\n" + postfix + playerCredits);
        }

        // winning lines of four apples £100
        else if ((reelTwo == Selection.APPLE) && (reelThree == Selection.APPLE) && (reelFour == Selection.APPLE) && (reelFive == Selection.APPLE)) { cashWinnings = (cashWinnings + 100);
            System.out.println(pipe + reelOne + pipe + reelTwo + pipe + reelThree + pipe + reelFour + pipe + reelFive + pipe + "\n" + line01 + "\n" + winnerMessage + "\n" + line05 + "\n" + winnerTotal + cashWinnings + "\n" + line05 + "\n" + postfix + playerCredits);
        }

        // winning lines of three apples £30
        else if ((reelOne == Selection.APPLE) && (reelTwo == Selection.APPLE) && (reelThree == Selection.APPLE)) { cashWinnings = (cashWinnings + 30);
            System.out.println(pipe + reelOne + pipe + reelTwo + pipe + reelThree + pipe + reelFour + pipe + reelFive + pipe + "\n" + line01 + "\n" + winnerMessage + "\n" + line05 + "\n" + winnerTotal + cashWinnings + "\n" + line05 + "\n" + postfix + playerCredits);
        }

        // winning lines of three apples £30
        else if ((reelTwo == Selection.APPLE) && (reelThree == Selection.APPLE) && (reelFour == Selection.APPLE)){ cashWinnings = (cashWinnings + 30);
            System.out.println(pipe + reelOne + pipe + reelTwo + pipe + reelThree + pipe + reelFour + pipe + reelFive + pipe + "\n" + line01 + "\n" + winnerMessage + "\n" + line05 + "\n" + winnerTotal + cashWinnings + "\n" + line05 + "\n" + postfix + playerCredits);
        }

        // winning lines of three apples £30
        else if ((reelThree == Selection.APPLE) && (reelFour == Selection.APPLE) && (reelFive == Selection.APPLE)) { cashWinnings = (cashWinnings + 30);
            System.out.println(pipe + reelOne + pipe + reelTwo + pipe + reelThree + pipe + reelFour + pipe + reelFive + pipe + "\n" + line01 + "\n" + winnerMessage + "\n" + line05 + "\n" + winnerTotal + cashWinnings + "\n" + line05 + "\n" + postfix + playerCredits);
        }

        // winning line of five pears £500
        else if ((reelOne == Selection.PEAR) && (reelTwo == Selection.PEAR) && (reelThree == Selection.PEAR) && (reelFour == Selection.PEAR)&& (reelFive == Selection.PEAR)){ cashWinnings = (cashWinnings + 500);
            System.out.println(pipe + reelOne + pipe + reelTwo + pipe + reelThree + pipe + reelFour + pipe + reelFive + pipe + "\n" + line01 + "\n" + winnerMessage + "\n" + line05 + "\n" + winnerTotal + cashWinnings + "\n" + line05 + "\n" + postfix + playerCredits);
        }

        // winning lines of four pears £100
        else if ((reelOne == Selection.PEAR) && (reelTwo == Selection.PEAR) && (reelThree == Selection.PEAR) && (reelFour == Selection.PEAR)) { cashWinnings = (cashWinnings + 100);
            System.out.println(pipe + reelOne + pipe + reelTwo + pipe + reelThree + pipe + reelFour + pipe + reelFive + pipe + "\n" + line01 + "\n" + winnerMessage + "\n" + line05 + "\n" + winnerTotal + cashWinnings + "\n" + line05 + "\n" + postfix + playerCredits);
        }

        // winning lines of four pears £100
        else if ((reelTwo == Selection.PEAR) && (reelThree == Selection.PEAR) && (reelFour == Selection.PEAR) && (reelFive == Selection.PEAR)) { cashWinnings = (cashWinnings + 100);
            System.out.println(pipe + reelOne + pipe + reelTwo + pipe + reelThree + pipe + reelFour + pipe + reelFive + pipe + "\n" + line01 + "\n" + winnerMessage + "\n" + line05 + "\n" + winnerTotal + cashWinnings + "\n" + line05 + "\n" + postfix + playerCredits);
        }

        // winning lines of three pears £30
        else if ((reelOne == Selection.PEAR) && (reelTwo == Selection.PEAR) && (reelThree == Selection.PEAR)) { cashWinnings = (cashWinnings + 30);
            System.out.println(pipe + reelOne + pipe + reelTwo + pipe + reelThree + pipe + reelFour + pipe + reelFive + pipe + "\n" + line01 + "\n" + winnerMessage + "\n" + line05 + "\n" + winnerTotal + cashWinnings + "\n" + line05 + "\n" + postfix + playerCredits);
        }

        // winning lines of three pears £30
        else if ((reelTwo == Selection.PEAR) && (reelThree == Selection.PEAR) && (reelFour == Selection.PEAR)){ cashWinnings = (cashWinnings + 30);
            System.out.println(pipe + reelOne + pipe + reelTwo + pipe + reelThree + pipe + reelFour + pipe + reelFive + pipe + "\n" + line01 + "\n" + winnerMessage + "\n" + line05 + "\n" + winnerTotal + cashWinnings + "\n" + line05 + "\n" + postfix + playerCredits);
        }

        // winning lines of three pears £30
        else if ((reelThree == Selection.PEAR) && (reelFour == Selection.PEAR) && (reelFive == Selection.PEAR)) { cashWinnings = (cashWinnings + 30);
            System.out.println(pipe + reelOne + pipe + reelTwo + pipe + reelThree + pipe + reelFour + pipe + reelFive + pipe + "\n" + line01 + "\n" + winnerMessage + "\n" + line05 + "\n" + winnerTotal + cashWinnings + "\n" + line05 + "\n" + postfix + playerCredits);
        }

        // winning line of five limes £500
        else if ((reelOne == Selection.LIME) && (reelTwo == Selection.LIME) && (reelThree == Selection.LIME) && (reelFour == Selection.LIME)&& (reelFive == Selection.LIME)){ cashWinnings = (cashWinnings + 500);
            System.out.println(pipe + reelOne + pipe + reelTwo + pipe + reelThree + pipe + reelFour + pipe + reelFive + pipe + "\n" + line01 + "\n" + winnerMessage + "\n" + line05 + "\n" + winnerTotal + cashWinnings + "\n" + line05 + "\n" + postfix + playerCredits);
        }

        // winning lines of four limes £100
        else if ((reelOne == Selection.LIME) && (reelTwo == Selection.LIME) && (reelThree == Selection.LIME) && (reelFour == Selection.LIME)) { cashWinnings = (cashWinnings + 100);
            System.out.println(pipe + reelOne + pipe + reelTwo + pipe + reelThree + pipe + reelFour + pipe + reelFive + pipe + "\n" + line01 + "\n" + winnerMessage + "\n" + line05 + "\n" + winnerTotal + cashWinnings + "\n" + line05 + "\n" + postfix + playerCredits);
        }

        // winning lines of four limes £100
        else if ((reelTwo == Selection.LIME) && (reelThree == Selection.LIME) && (reelFour == Selection.LIME) && (reelFive == Selection.LIME)) { cashWinnings = (cashWinnings + 100);
            System.out.println(pipe + reelOne + pipe + reelTwo + pipe + reelThree + pipe + reelFour + pipe + reelFive + pipe + "\n" + line01 + "\n" + winnerMessage + "\n" + line05 + "\n" + winnerTotal + cashWinnings + "\n" + line05 + "\n" + postfix + playerCredits);
        }

        // winning lines of three limes £30
        else if ((reelOne == Selection.LIME) && (reelTwo == Selection.LIME) && (reelThree == Selection.LIME)) { cashWinnings = (cashWinnings + 30);
            System.out.println(pipe + reelOne + pipe + reelTwo + pipe + reelThree + pipe + reelFour + pipe + reelFive + pipe + "\n" + line01 + "\n" + winnerMessage + "\n" + line05 + "\n" + winnerTotal + cashWinnings + "\n" + line05 + "\n" + postfix + playerCredits);
        }

        // winning lines of three limes £30
        else if ((reelTwo == Selection.LIME) && (reelThree == Selection.LIME) && (reelFour == Selection.LIME)){ cashWinnings = (cashWinnings + 30);
            System.out.println(pipe + reelOne + pipe + reelTwo + pipe + reelThree + pipe + reelFour + pipe + reelFive + pipe + "\n" + line01 + "\n" + winnerMessage + "\n" + line05 + "\n" + winnerTotal + cashWinnings + "\n" + line05 + "\n" + postfix + playerCredits);
        }

        // winning lines of three limes £30
        else if ((reelThree == Selection.LIME) && (reelFour == Selection.LIME) && (reelFive == Selection.LIME)) { cashWinnings = (cashWinnings + 30);
            System.out.println(pipe + reelOne + pipe + reelTwo + pipe + reelThree + pipe + reelFour + pipe + reelFive + pipe + "\n" + line01 + "\n" + winnerMessage + "\n" + line05 + "\n" + winnerTotal + cashWinnings + "\n" + line05 + "\n" + postfix + playerCredits);
        }

        // losing lines
        else {
            cashWinnings = (cashWinnings);
            System.out.println(pipe + reelOne + pipe + reelTwo + pipe + reelThree + pipe + reelFour + pipe + reelFive + pipe + "\n" + line01 + "\n" + losingMessage + "\n" + line05 + "\n" + winnerTotal + cashWinnings + "\n" + line05 + "\n" + postfix + playerCredits);
        }
        return null;
    }
}
