import java.util.Random;

public class FruitMachine {

    Selection reelOneChoice;
    Selection reelTwoChoice;
    Selection reelThreeChoice;
    String prefix;
    String pipe;
    String winner;
    String loser;
    Integer cashWinnings;

    public FruitMachine(Selection reelOneChoice, Selection reelTwoChoice, Selection reelThreeChoice) {
        this.reelOneChoice = reelOneChoice;
        this.reelTwoChoice = reelTwoChoice;
        this.reelThreeChoice = reelThreeChoice;

        this.prefix = "Spinning... <";
        this.pipe = " | ";
        this.winner = "> Congratulations, you have won £";
        this.loser = "> You lose, care to try again, you have £";
        this.cashWinnings = 0;
    }

    public Selection randomiseReelChoice() {
        Selection[] array = {Selection.APPLE, Selection.ORANGE, Selection.PEAR};
        Random choice = new Random();
        int select = choice.nextInt(array.length);
        return array[select];
    }

    public Selection getSelection(Selection choice) {
        return this.reelOneChoice = choice;
    }

    public void setReelOneChoice(Selection choice) {
        choice = randomiseReelChoice();
        this.reelOneChoice = choice;
    }

    public void setReelTwoChoice(Selection choice) {
        choice = randomiseReelChoice();
        this.reelTwoChoice = choice;
    }

    public void setReelThreeChoice(Selection choice) {
        choice = randomiseReelChoice();
        this.reelThreeChoice = choice;
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

        if ((reelOne == Selection.APPLE) && (reelTwo == Selection.APPLE) && (reelThree == Selection.APPLE)) {
            cashWinnings = (cashWinnings + 25); System.out.println(prefix + pipe + reelOne + pipe + reelTwo + pipe + reelThree + pipe + winner + cashWinnings);
        } else if ((reelOne == Selection.PEAR) && (reelTwo == Selection.PEAR) && (reelThree == Selection.PEAR)) {
            cashWinnings = (cashWinnings + 25); System.out.println(prefix + pipe + reelOne + pipe + reelTwo + pipe + reelThree + pipe + winner + cashWinnings);
        } else if ((reelOne == Selection.ORANGE) && (reelTwo == Selection.ORANGE) && (reelThree == Selection.ORANGE)) {
            cashWinnings = (cashWinnings + 25); System.out.println(prefix + pipe + reelOne + pipe + reelTwo + pipe + reelThree + pipe + winner + cashWinnings);
        } else {System.out.println(prefix + pipe + reelOne + pipe + reelTwo + pipe + reelThree + pipe + loser + cashWinnings);
            return loser;
        }   return winner;
    }
}
