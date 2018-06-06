import java.util.Random;

public class FruitMachine {

    private Selection reelOneChoice;
    private Selection reelTwoChoice;
    private Selection reelThreeChoice;

    private String prefix;
    private String line01;
    private String line02;
    private String line03;
    private String line04;
    private String pipe;
    private String winnerMessage;
    private String winnerTotal;
    private String losingMessage;
    private String postfix;
    protected Integer cashWinnings;
    protected Integer playerCredits;

    public FruitMachine(){

        // machine output messages for 'getReels'
        this.prefix = "|   CODECLAN FRUIT MACHINE   |";
        this.line01 = "==============================";
        this.line02 = "|      £30 Three APPLES      |";
        this.line03 = "|      £25 Three PEARS       |";
        this.line04 = "|      £20 Three ORANGES     |";
        this.pipe = "<|>";
        this.winnerTotal = "        WINNINGS   £";
        this.winnerMessage = "Congratulations, YOU HAVE WON";
        this.losingMessage = "Unlucky this time, try again?";
        this.postfix = "Your remaining credit is £";

        // values
        this.playerCredits = 0;
        this.cashWinnings = 0;
    }

    // random
    public Selection randomiseReelChoice() {
        Selection[] array = {Selection.APPLE, Selection.ORANGE, Selection.PEAR};
        Random choice = new Random();
        int select = choice.nextInt(array.length);
        return array[select];
    }


    // setters
    public void generateAllChoices(){
        this.setReelOneChoice();
        this.setReelTwoChoice();
        this.setReelThreeChoice();
    }

    public void setReelOneChoice() { this.reelOneChoice = randomiseReelChoice(); }

    public void setReelTwoChoice() { this.reelTwoChoice = randomiseReelChoice(); }

    public void setReelThreeChoice() { this.reelThreeChoice = randomiseReelChoice(); }

    // getters
    public Selection getReelOneChoice() { return reelOneChoice; }

    public Selection getReelTwoChoice() { return reelTwoChoice; }

    public Selection getReelThreeChoice() { return reelThreeChoice; }

    // get reel choice
    public String getReels() {
        Selection reelOne = getReelOneChoice();
        Selection reelTwo = getReelTwoChoice();
        Selection reelThree = getReelThreeChoice();

        // deduct credits
        playerCredits -= 1;

        // display output
        System.out.println(line01);
        System.out.println(prefix);
        System.out.println(line02);
        System.out.println(line03);
        System.out.println(line04);
        System.out.println(line01);

            // winning line of three apples £30
        if ((reelOne == Selection.APPLE) && (reelTwo == Selection.APPLE) && (reelThree == Selection.APPLE)) {
            cashWinnings = (cashWinnings + 30);
            System.out.println(pipe + reelOne + pipe + reelTwo + pipe + reelThree + pipe);
            System.out.println(line01);
            System.out.println(winnerMessage);
            System.out.println(winnerTotal + cashWinnings);
            System.out.println(postfix + playerCredits);

            // winning line of three pears £25
        } else if ((reelOne == Selection.PEAR) && (reelTwo == Selection.PEAR) && (reelThree == Selection.PEAR)) {
            cashWinnings = (cashWinnings + 25);
            System.out.println(pipe + reelOne + pipe + reelTwo + pipe + reelThree + pipe);
            System.out.println(line01);
            System.out.println(winnerMessage);
            System.out.println(winnerTotal + cashWinnings);
            System.out.println(postfix + playerCredits);

            // winning line of three oranges £20
        } else if ((reelOne == Selection.ORANGE) && (reelTwo == Selection.ORANGE) && (reelThree == Selection.ORANGE)) {
            cashWinnings = (cashWinnings + 20);
            System.out.println(pipe + reelOne + pipe + reelTwo + pipe + reelThree + pipe);
            System.out.println(line01);
            System.out.println(winnerMessage);
            System.out.println(winnerTotal + cashWinnings);
            System.out.println(postfix + playerCredits);

            // losing line
        } else {
            cashWinnings = (cashWinnings);
            System.out.println(pipe + reelOne + pipe + reelTwo + pipe + reelThree + pipe);
            System.out.println(line01);
            System.out.println(losingMessage);
            System.out.println(winnerTotal + cashWinnings);
            System.out.println(postfix + playerCredits); return losingMessage;
        }   return losingMessage;
    }
}
