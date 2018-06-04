import java.util.Random;

public class FruitMachine {

        private Selection reelOneChoice;
        private Selection reelTwoChoice;
        private Selection reelThreeChoice;

        private String prefix;
        private String pipe;
        private String winnerMessage;
        private String loserMessage;
        private String postfix;
        private Integer cashWinnings;
        private Integer playerCredits;

        public FruitMachine(){

            // System.out.println messages for 'getReels'
            this.prefix = "Spinning reels ... <";
            this.pipe = " | ";
            this.winnerMessage = "> Congratulations, you have won £";
            this.loserMessage = "> You lose, care to try again, winnings £";
            this.postfix = ", credits remaining £";

            this.playerCredits = 20;
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

        if ((reelOne == Selection.APPLE) && (reelTwo == Selection.APPLE) && (reelThree == Selection.APPLE)) {
            cashWinnings = (cashWinnings + 25);
            System.out.println(prefix + pipe + reelOne + pipe + reelTwo + pipe + reelThree + pipe + winnerMessage + cashWinnings + postfix + playerCredits);
        } else if ((reelOne == Selection.PEAR) && (reelTwo == Selection.PEAR) && (reelThree == Selection.PEAR)) {
            cashWinnings = (cashWinnings + 25);
            System.out.println(prefix + pipe + reelOne + pipe + reelTwo + pipe + reelThree + pipe + winnerMessage + cashWinnings + postfix + playerCredits);
        } else if ((reelOne == Selection.ORANGE) && (reelTwo == Selection.ORANGE) && (reelThree == Selection.ORANGE)) {
            cashWinnings = (cashWinnings + 25);
            System.out.println(prefix + pipe + reelOne + pipe + reelTwo + pipe + reelThree + pipe + winnerMessage + cashWinnings + postfix + playerCredits);
        } else {
            cashWinnings = (cashWinnings);
            System.out.println(prefix + pipe + reelOne + pipe + reelTwo + pipe + reelThree + pipe + loserMessage + cashWinnings + postfix + playerCredits);
            return loserMessage;
        }
        return loserMessage;
    }
}



