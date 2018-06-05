import java.util.Random;

public class FruitMachine {

    private Selection reelOneChoice;
    private Selection reelTwoChoice;
    private Selection reelThreeChoice;

    private String prefix;
    private String line;
    private String pipe;
    private String winnerMessage;
    private String winnerTotal;
    private String losingMessage;
    private String postfix;
    protected Integer cashWinnings;
    protected Integer playerCredits;

    public FruitMachine(){

        // machine output messages for 'getReels'
        this.prefix = "-=- CODECLAN FRUIT MACHINE -=-";
        this.line = "=================================";
        this.pipe = " <|> ";
        this.winnerTotal = "        WINNINGS   £";
        this.winnerMessage = "Congratulations, YOU HAVE WON";
        this.losingMessage = "You didn't win this time, try again?";
        this.postfix = "Your remaining credit is £";

        this.playerCredits = 0;
        this.cashWinnings = 0;
    }

    public Selection randomiseReelChoice() {
        Selection[] array = {Selection.APPLE, Selection.ORANGE, Selection.PEAR};
        Random choice = new Random();
        int select = choice.nextInt(array.length);
        return array[select];
    }

    public void generateAllChoices(){
        this.setReelOneChoice();
        this.setReelTwoChoice();
        this.setReelThreeChoice();
    }

    public void setReelOneChoice() {
        this.reelOneChoice = randomiseReelChoice();
    }

    public void setReelTwoChoice() {
        this.reelTwoChoice = randomiseReelChoice();
    }

    public void setReelThreeChoice() {
        this.reelThreeChoice = randomiseReelChoice();
    }

    public Selection getReelOneChoice() {
        return reelOneChoice;
    }

    public Selection getReelTwoChoice() {
        return reelTwoChoice;
    }

    public Selection getReelThreeChoice() {
        return reelThreeChoice;
    }

    public String getReels() {

        Selection reelOne = getReelOneChoice();
        Selection reelTwo = getReelTwoChoice();
        Selection reelThree = getReelThreeChoice();

        playerCredits -= 1;

        System.out.println(prefix);
        System.out.println(line);

        if ((reelOne == Selection.APPLE) && (reelTwo == Selection.APPLE) && (reelThree == Selection.APPLE)) {
            cashWinnings = (cashWinnings + 30);
            System.out.println(pipe + reelOne + pipe + reelTwo + pipe + reelThree + pipe);
            System.out.println(line);
            System.out.println(winnerMessage);
            System.out.println(winnerTotal + cashWinnings);
            System.out.println(postfix + playerCredits);

        } else if ((reelOne == Selection.PEAR) && (reelTwo == Selection.PEAR) && (reelThree == Selection.PEAR)) {
            cashWinnings = (cashWinnings + 25);
            System.out.println(pipe + reelOne + pipe + reelTwo + pipe + reelThree + pipe);
            System.out.println(line);
            System.out.println(winnerMessage);
            System.out.println(winnerTotal + cashWinnings);
            System.out.println(postfix + playerCredits);

        } else if ((reelOne == Selection.ORANGE) && (reelTwo == Selection.ORANGE) && (reelThree == Selection.ORANGE)) {
            cashWinnings = (cashWinnings + 20);
            System.out.println(pipe + reelOne + pipe + reelTwo + pipe + reelThree + pipe);
            System.out.println(line);
            System.out.println(winnerMessage);
            System.out.println(winnerTotal + cashWinnings);
            System.out.println(postfix + playerCredits);

        } else {
            cashWinnings = (cashWinnings);
            System.out.println(pipe + reelOne + pipe + reelTwo + pipe + reelThree + pipe);
            System.out.println(line);
            System.out.println(losingMessage);
            System.out.println(winnerTotal + cashWinnings);
            System.out.println(postfix + playerCredits); return losingMessage;
        }   return losingMessage;
    }
}
