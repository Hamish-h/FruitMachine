import java.util.Random;

public class FruitMachine {

    private Selection reelOneChoice;
    private Selection reelTwoChoice;
    private Selection reelThreeChoice;
    // Extension
    private Selection reelFourChoice;
    private Selection reelFiveChoice;
    
    private String displayLineFruitMachine;
    private String displayLineDoubleLine;
    private String displayLineApples;
    private String displayLinePears;
    private String displayLineLimes;
    private String displayLineSingleLine;
    private String displayPipe;
    private String displayWinnerMessage;
    private String displayWinnerTotal;
    private String displayLosingMessage;
    private String displayRemainingCredit;

    Integer playerCredits = 0;
    Integer cashWinnings = 0;

    Integer winThreeMatchingReels = 30;
    Integer winFourMatchingReels = 100;
    Integer winFiveMatchingReels = 500;

    public FruitMachine(){

        // machine output messages for 'getReels'
        this.displayLineDoubleLine = "==============================";
        this.displayLineSingleLine = "------------------------------";
        this.displayLineFruitMachine = "|   CODECLAN FRUIT MACHINE   |";
        this.displayLineApples = "| APPLE 3x£30 4x£90 5x£500 ! |";
        this.displayLinePears = "| PEARS 3x£30 4x£90 5x£500 ! |";
        this.displayLineLimes = "| LIMES 3x£30 4x£90 5x£500 ! |";
        this.displayPipe = "|";
        this.displayWinnerTotal = "     WINNINGS TOTAL £";
        this.displayWinnerMessage = "Congratulations, YOU HAVE WON";
        this.displayLosingMessage = "Unlucky this time, try again?";
        this.displayRemainingCredit = "Your remaining credit is £";
    }

    // random
    private Selection randomiseReelChoice() {
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
    public int getWinThreeMatchingReels() { return winThreeMatchingReels; }
    public int getWinFourMatchingReels() { return winFourMatchingReels; }
    public int getWinFiveMatchingReels() { return winFiveMatchingReels; }


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
        System.out.println(displayLineDoubleLine + "\n" + displayLineFruitMachine + "\n" + displayLineApples + "\n" + displayLinePears + "\n" + displayLineLimes + "\n" + displayLineDoubleLine);

        // WINNING LINES

        // winning line of five apples £500
        if ((reelOne == Selection.APPLE) && (reelTwo == Selection.APPLE) && (reelThree == Selection.APPLE) && (reelFour == Selection.APPLE)&& (reelFive == Selection.APPLE)){ cashWinnings = (cashWinnings + winFiveMatchingReels);
            System.out.println(displayPipe + reelOne + displayPipe + reelTwo + displayPipe + reelThree + displayPipe + reelFour + displayPipe + reelFive + displayPipe + "\n" + displayLineDoubleLine + "\n"
                    + displayWinnerMessage + "\n" + displayLineSingleLine + "\n" + displayWinnerTotal + cashWinnings + "\n" + displayLineSingleLine + "\n" + displayRemainingCredit + playerCredits);
        }

        // winning lines of four apples £100
        else if ((reelOne == Selection.APPLE) && (reelTwo == Selection.APPLE) && (reelThree == Selection.APPLE) && (reelFour == Selection.APPLE)) { cashWinnings = (cashWinnings + 100);
            System.out.println(displayPipe + reelOne + displayPipe + reelTwo + displayPipe + reelThree + displayPipe + reelFour + displayPipe + reelFive + displayPipe + "\n" + displayLineDoubleLine + "\n"
                    + displayWinnerMessage + "\n" + displayLineSingleLine + "\n" + displayWinnerTotal + cashWinnings + "\n" + displayLineSingleLine + "\n" + displayRemainingCredit + playerCredits);
        }

        // winning lines of four apples £100
        else if ((reelTwo == Selection.APPLE) && (reelThree == Selection.APPLE) && (reelFour == Selection.APPLE) && (reelFive == Selection.APPLE)) { cashWinnings = (cashWinnings + 100);
            System.out.println(displayPipe + reelOne + displayPipe + reelTwo + displayPipe + reelThree + displayPipe + reelFour + displayPipe + reelFive + displayPipe + "\n" + displayLineDoubleLine + "\n"
                    + displayWinnerMessage + "\n" + displayLineSingleLine + "\n" + displayWinnerTotal + cashWinnings + "\n" + displayLineSingleLine + "\n" + displayRemainingCredit + playerCredits);
        }

        // winning lines of three apples £30
        else if ((reelOne == Selection.APPLE) && (reelTwo == Selection.APPLE) && (reelThree == Selection.APPLE)) { cashWinnings = (cashWinnings + winThreeMatchingReels);
            System.out.println(displayPipe + reelOne + displayPipe + reelTwo + displayPipe + reelThree + displayPipe + reelFour + displayPipe + reelFive + displayPipe + "\n" + displayLineDoubleLine + "\n"
                    + displayWinnerMessage + "\n" + displayLineSingleLine + "\n" + displayWinnerTotal + cashWinnings + "\n" + displayLineSingleLine + "\n" + displayRemainingCredit + playerCredits);
        }

        // winning lines of three apples £30
        else if ((reelTwo == Selection.APPLE) && (reelThree == Selection.APPLE) && (reelFour == Selection.APPLE)){ cashWinnings = (cashWinnings + winThreeMatchingReels);
            System.out.println(displayPipe + reelOne + displayPipe + reelTwo + displayPipe + reelThree + displayPipe + reelFour + displayPipe + reelFive + displayPipe + "\n" + displayLineDoubleLine + "\n"
                    + displayWinnerMessage + "\n" + displayLineSingleLine + "\n" + displayWinnerTotal + cashWinnings + "\n" + displayLineSingleLine + "\n" + displayRemainingCredit + playerCredits);
        }

        // winning lines of three apples £30
        else if ((reelThree == Selection.APPLE) && (reelFour == Selection.APPLE) && (reelFive == Selection.APPLE)) { cashWinnings = (cashWinnings + winThreeMatchingReels);
            System.out.println(displayPipe + reelOne + displayPipe + reelTwo + displayPipe + reelThree + displayPipe + reelFour + displayPipe + reelFive + displayPipe + "\n" + displayLineDoubleLine + "\n"
                    + displayWinnerMessage + "\n" + displayLineSingleLine + "\n" + displayWinnerTotal + cashWinnings + "\n" + displayLineSingleLine + "\n" + displayRemainingCredit + playerCredits);
        }

        // winning line of five pears £500
        else if ((reelOne == Selection.PEAR) && (reelTwo == Selection.PEAR) && (reelThree == Selection.PEAR) && (reelFour == Selection.PEAR)&& (reelFive == Selection.PEAR)){ cashWinnings = (cashWinnings + winFiveMatchingReels);
            System.out.println(displayPipe + reelOne + displayPipe + reelTwo + displayPipe + reelThree + displayPipe + reelFour + displayPipe + reelFive + displayPipe + "\n" + displayLineDoubleLine + "\n"
                    + displayWinnerMessage + "\n" + displayLineSingleLine + "\n" + displayWinnerTotal + cashWinnings + "\n" + displayLineSingleLine + "\n" + displayRemainingCredit + playerCredits);
        }

        // winning lines of four pears £100
        else if ((reelOne == Selection.PEAR) && (reelTwo == Selection.PEAR) && (reelThree == Selection.PEAR) && (reelFour == Selection.PEAR)) { cashWinnings = (cashWinnings + winFourMatchingReels);
            System.out.println(displayPipe + reelOne + displayPipe + reelTwo + displayPipe + reelThree + displayPipe + reelFour + displayPipe + reelFive + displayPipe + "\n" + displayLineDoubleLine + "\n"
                    + displayWinnerMessage + "\n" + displayLineSingleLine + "\n" + displayWinnerTotal + cashWinnings + "\n" + displayLineSingleLine + "\n" + displayRemainingCredit + playerCredits);
        }

        // winning lines of four pears £100
        else if ((reelTwo == Selection.PEAR) && (reelThree == Selection.PEAR) && (reelFour == Selection.PEAR) && (reelFive == Selection.PEAR)) { cashWinnings = (cashWinnings + winFourMatchingReels);
            System.out.println(displayPipe + reelOne + displayPipe + reelTwo + displayPipe + reelThree + displayPipe + reelFour + displayPipe + reelFive + displayPipe + "\n" + displayLineDoubleLine + "\n"
                    + displayWinnerMessage + "\n" + displayLineSingleLine + "\n" + displayWinnerTotal + cashWinnings + "\n" + displayLineSingleLine + "\n" + displayRemainingCredit + playerCredits);
        }

        // winning lines of three pears £30
        else if ((reelOne == Selection.PEAR) && (reelTwo == Selection.PEAR) && (reelThree == Selection.PEAR)) { cashWinnings = (cashWinnings + winThreeMatchingReels);
            System.out.println(displayPipe + reelOne + displayPipe + reelTwo + displayPipe + reelThree + displayPipe + reelFour + displayPipe + reelFive + displayPipe + "\n" + displayLineDoubleLine + "\n"
                    + displayWinnerMessage + "\n" + displayLineSingleLine + "\n" + displayWinnerTotal + cashWinnings + "\n" + displayLineSingleLine + "\n" + displayRemainingCredit + playerCredits);
        }

        // winning lines of three pears £30
        else if ((reelTwo == Selection.PEAR) && (reelThree == Selection.PEAR) && (reelFour == Selection.PEAR)){ cashWinnings = (cashWinnings + winThreeMatchingReels);
            System.out.println(displayPipe + reelOne + displayPipe + reelTwo + displayPipe + reelThree + displayPipe + reelFour + displayPipe + reelFive + displayPipe + "\n" + displayLineDoubleLine + "\n"
                    + displayWinnerMessage + "\n" + displayLineSingleLine + "\n" + displayWinnerTotal + cashWinnings + "\n" + displayLineSingleLine + "\n" + displayRemainingCredit + playerCredits);
        }

        // winning lines of three pears £30
        else if ((reelThree == Selection.PEAR) && (reelFour == Selection.PEAR) && (reelFive == Selection.PEAR)) { cashWinnings = (cashWinnings + winThreeMatchingReels);
            System.out.println(displayPipe + reelOne + displayPipe + reelTwo + displayPipe + reelThree + displayPipe + reelFour + displayPipe + reelFive + displayPipe + "\n" + displayLineDoubleLine + "\n"
                    + displayWinnerMessage + "\n" + displayLineSingleLine + "\n" + displayWinnerTotal + cashWinnings + "\n" + displayLineSingleLine + "\n" + displayRemainingCredit + playerCredits);
        }

        // winning line of five limes £500
        else if ((reelOne == Selection.LIME) && (reelTwo == Selection.LIME) && (reelThree == Selection.LIME) && (reelFour == Selection.LIME)&& (reelFive == Selection.LIME)){ cashWinnings = (cashWinnings + winFiveMatchingReels);
            System.out.println(displayPipe + reelOne + displayPipe + reelTwo + displayPipe + reelThree + displayPipe + reelFour + displayPipe + reelFive + displayPipe + "\n" + displayLineDoubleLine + "\n"
                    + displayWinnerMessage + "\n" + displayLineSingleLine + "\n" + displayWinnerTotal + cashWinnings + "\n" + displayLineSingleLine + "\n" + displayRemainingCredit + playerCredits);
        }

        // winning lines of four limes £100
        else if ((reelOne == Selection.LIME) && (reelTwo == Selection.LIME) && (reelThree == Selection.LIME) && (reelFour == Selection.LIME)) { cashWinnings = (cashWinnings + winFourMatchingReels);
            System.out.println(displayPipe + reelOne + displayPipe + reelTwo + displayPipe + reelThree + displayPipe + reelFour + displayPipe + reelFive + displayPipe + "\n" + displayLineDoubleLine + "\n"
                    + displayWinnerMessage + "\n" + displayLineSingleLine + "\n" + displayWinnerTotal + cashWinnings + "\n" + displayLineSingleLine + "\n" + displayRemainingCredit + playerCredits);
        }

        // winning lines of four limes £100
        else if ((reelTwo == Selection.LIME) && (reelThree == Selection.LIME) && (reelFour == Selection.LIME) && (reelFive == Selection.LIME)) { cashWinnings = (cashWinnings + winFourMatchingReels);
            System.out.println(displayPipe + reelOne + displayPipe + reelTwo + displayPipe + reelThree + displayPipe + reelFour + displayPipe + reelFive + displayPipe + "\n" + displayLineDoubleLine + "\n"
                    + displayWinnerMessage + "\n" + displayLineSingleLine + "\n" + displayWinnerTotal + cashWinnings + "\n" + displayLineSingleLine + "\n" + displayRemainingCredit + playerCredits);
        }

        // winning lines of three limes £30
        else if ((reelOne == Selection.LIME) && (reelTwo == Selection.LIME) && (reelThree == Selection.LIME)) { cashWinnings = (cashWinnings + winThreeMatchingReels);
            System.out.println(displayPipe + reelOne + displayPipe + reelTwo + displayPipe + reelThree + displayPipe + reelFour + displayPipe + reelFive + displayPipe + "\n" + displayLineDoubleLine + "\n"
                    + displayWinnerMessage + "\n" + displayLineSingleLine + "\n" + displayWinnerTotal + cashWinnings + "\n" + displayLineSingleLine + "\n" + displayRemainingCredit + playerCredits);
        }

        // winning lines of three limes £30
        else if ((reelTwo == Selection.LIME) && (reelThree == Selection.LIME) && (reelFour == Selection.LIME)){ cashWinnings = (cashWinnings + winThreeMatchingReels);
            System.out.println(displayPipe + reelOne + displayPipe + reelTwo + displayPipe + reelThree + displayPipe + reelFour + displayPipe + reelFive + displayPipe + "\n" + displayLineDoubleLine + "\n"
                    + displayWinnerMessage + "\n" + displayLineSingleLine + "\n" + displayWinnerTotal + cashWinnings + "\n" + displayLineSingleLine + "\n" + displayRemainingCredit + playerCredits);
        }

        // winning lines of three limes £30
        else if ((reelThree == Selection.LIME) && (reelFour == Selection.LIME) && (reelFive == Selection.LIME)) { cashWinnings = (cashWinnings + winThreeMatchingReels);
            System.out.println(displayPipe + reelOne + displayPipe + reelTwo + displayPipe + reelThree + displayPipe + reelFour + displayPipe + reelFive + displayPipe + "\n" + displayLineDoubleLine + "\n"
                    + displayWinnerMessage + "\n" + displayLineSingleLine + "\n" + displayWinnerTotal + cashWinnings + "\n" + displayLineSingleLine + "\n" + displayRemainingCredit + playerCredits);
        }

        // losing lines
        else {
            cashWinnings = (cashWinnings);
            System.out.println(displayPipe + reelOne + displayPipe + reelTwo + displayPipe + reelThree + displayPipe + reelFour + displayPipe + reelFive + displayPipe + "\n" + displayLineDoubleLine + "\n"
                    + displayLosingMessage + "\n" + displayLineSingleLine + "\n" + displayWinnerTotal + cashWinnings + "\n" + displayLineSingleLine + "\n" + displayRemainingCredit + playerCredits);
        }
        return null;
    }

}
