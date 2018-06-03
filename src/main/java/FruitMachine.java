import java.util.Random;

public class FruitMachine {

    Selection reelOneChoice;
    Selection reelTwoChoice;
    Selection reelThreeChoice;
    String prefix;
    String pipe;
    String winner;
    String loser;

    public FruitMachine(Selection reelOneChoice, Selection reelTwoChoice, Selection reelThreeChoice) {
        this.reelOneChoice = reelOneChoice;
        this.reelTwoChoice = reelTwoChoice;
        this.reelThreeChoice = reelThreeChoice;

        this.prefix = "Spinning... ";
        this.pipe = " | ";
        this.winner = "Congratulations, You Win !!!";
        this.loser = "You lose, care to try again?";
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
            System.out.println(prefix + pipe + reelOne + pipe + reelTwo + pipe + reelThree + pipe + winner);
        } else if ((reelOne == Selection.APPLE) && (reelTwo == Selection.APPLE) && (reelThree == Selection.PEAR)) {
            System.out.println(prefix + reelOne + pipe + reelTwo + pipe + reelThree + pipe + loser);
        } else if ((reelOne == Selection.APPLE) && (reelTwo == Selection.PEAR) && (reelThree == Selection.APPLE)) {
            System.out.println(prefix + reelOne + pipe + reelTwo + pipe + reelThree + pipe + loser);
        } else if ((reelOne == Selection.PEAR) && (reelTwo == Selection.APPLE) && (reelThree == Selection.APPLE)) {
            System.out.println(prefix + reelOne + pipe + reelTwo + pipe + reelThree + pipe + loser);
        } else if ((reelOne == Selection.APPLE) && (reelTwo == Selection.APPLE) && (reelThree == Selection.ORANGE)) {
            System.out.println(prefix + reelOne + pipe + reelTwo + pipe + reelThree + pipe + loser);
        } else if ((reelOne == Selection.APPLE) && (reelTwo == Selection.ORANGE) && (reelThree == Selection.APPLE)) {
            System.out.println(prefix + reelOne + pipe + reelTwo + pipe + reelThree + pipe + loser);
        } else if ((reelOne == Selection.ORANGE) && (reelTwo == Selection.APPLE) && (reelThree == Selection.APPLE)) {
            System.out.println(prefix + reelOne + pipe + reelTwo + pipe + reelThree + pipe + loser);
        } else if ((reelOne == Selection.APPLE) && (reelTwo == Selection.PEAR) && (reelThree == Selection.ORANGE)) {
            System.out.println(prefix + reelOne + pipe + reelTwo + pipe + reelThree + pipe + loser);
        } else if ((reelOne == Selection.APPLE) && (reelTwo == Selection.ORANGE) && (reelThree == Selection.PEAR)) {
            System.out.println(prefix + reelOne + pipe + reelTwo + pipe + reelThree + pipe + loser);
        } else if ((reelOne == Selection.PEAR) && (reelTwo == Selection.PEAR) && (reelThree == Selection.PEAR)) {
            System.out.println(prefix + reelOne + pipe + reelTwo + pipe + reelThree + pipe + winner);
        } else if ((reelOne == Selection.PEAR) && (reelTwo == Selection.PEAR) && (reelThree == Selection.APPLE)) {
            System.out.println(prefix + reelOne + pipe + reelTwo + pipe + reelThree + pipe + loser);
        } else if ((reelOne == Selection.PEAR) && (reelTwo == Selection.APPLE) && (reelThree == Selection.PEAR)) {
            System.out.println(prefix + reelOne + pipe + reelTwo + pipe + reelThree + pipe + loser);
        } else if ((reelOne == Selection.APPLE) && (reelTwo == Selection.PEAR) && (reelThree == Selection.PEAR)) {
            System.out.println(prefix + reelOne + pipe + reelTwo + pipe + reelThree + pipe + loser);
        } else if ((reelOne == Selection.PEAR) && (reelTwo == Selection.PEAR) && (reelThree == Selection.ORANGE)) {
            System.out.println(prefix + reelOne + pipe + reelTwo + pipe + reelThree + pipe + loser);
        } else if ((reelOne == Selection.PEAR) && (reelTwo == Selection.ORANGE) && (reelThree == Selection.PEAR)) {
            System.out.println(prefix + reelOne + pipe + reelTwo + pipe + reelThree + pipe + loser);
        } else if ((reelOne == Selection.ORANGE) && (reelTwo == Selection.PEAR) && (reelThree == Selection.PEAR)) {
            System.out.println(prefix + reelOne + pipe + reelTwo + pipe + reelThree + pipe + loser);
        } else if ((reelOne == Selection.PEAR) && (reelTwo == Selection.APPLE) && (reelThree == Selection.ORANGE)) {
            System.out.println(prefix + reelOne + pipe + reelTwo + pipe + reelThree + pipe + loser);
        } else if ((reelOne == Selection.PEAR) && (reelTwo == Selection.ORANGE) && (reelThree == Selection.APPLE)) {
            System.out.println(prefix + reelOne + pipe + reelTwo + pipe + reelThree + pipe + loser);
        } else if ((reelOne == Selection.ORANGE) && (reelTwo == Selection.ORANGE) && (reelThree == Selection.ORANGE)) {
            System.out.println(prefix + reelOne + pipe + reelTwo + pipe + reelThree + pipe + winner);
        } else if ((reelOne == Selection.ORANGE) && (reelTwo == Selection.ORANGE) && (reelThree == Selection.APPLE)) {
            System.out.println(prefix + reelOne + pipe + reelTwo + pipe + reelThree + pipe + loser);
        } else if ((reelOne == Selection.ORANGE) && (reelTwo == Selection.APPLE) && (reelThree == Selection.ORANGE)) {
            System.out.println(prefix + reelOne + pipe + reelTwo + pipe + reelThree + pipe + loser);
        } else if ((reelOne == Selection.APPLE) && (reelTwo == Selection.ORANGE) && (reelThree == Selection.ORANGE)) {
            System.out.println(prefix + reelOne + pipe + reelTwo + pipe + reelThree + pipe + loser);
        } else if ((reelOne == Selection.ORANGE) && (reelTwo == Selection.ORANGE) && (reelThree == Selection.PEAR)) {
            System.out.println(prefix + reelOne + pipe + reelTwo + pipe + reelThree + pipe + loser);
        } else if ((reelOne == Selection.ORANGE) && (reelTwo == Selection.PEAR) && (reelThree == Selection.ORANGE)) {
            System.out.println(prefix + reelOne + pipe + reelTwo + pipe + reelThree + pipe + loser);
        } else if ((reelOne == Selection.PEAR) && (reelTwo == Selection.ORANGE) && (reelThree == Selection.ORANGE)) {
            System.out.println(prefix + reelOne + pipe + reelTwo + pipe + reelThree + pipe + loser);
        } else if ((reelOne == Selection.ORANGE) && (reelTwo == Selection.APPLE) && (reelThree == Selection.PEAR)) {
            System.out.println(prefix + reelOne + pipe + reelTwo + pipe + reelThree + pipe + loser);
        } else if ((reelOne == Selection.ORANGE) && (reelTwo == Selection.PEAR) && (reelThree == Selection.APPLE)) {
            System.out.println(prefix + reelOne + pipe + reelTwo + pipe + reelThree + pipe + loser);
        } else {return loser;}
        return null;
    }





//        if ((reelOne == Selection.APPLE) && (reelTwo == Selection.APPLE) && (reelThree == Selection.APPLE)) {
//            System.out.println(prefix + pipe + reelOne + pipe + reelTwo + pipe + reelThree + pipe + winner);
//        } else if ((reelOne == Selection.APPLE) && (reelTwo == Selection.APPLE) && (reelThree == Selection.PEAR)) {
//            System.out.println(prefix + reelOne + pipe + reelTwo + pipe + reelThree + pipe + loser);
//        } else if ((reelOne == Selection.APPLE) && (reelTwo == Selection.PEAR) && (reelThree == Selection.APPLE)) {
//            System.out.println(prefix + reelOne + pipe + reelTwo + pipe + reelThree + pipe + loser);
//        } else if ((reelOne == Selection.PEAR) && (reelTwo == Selection.APPLE) && (reelThree == Selection.APPLE)) {
//            System.out.println(prefix + reelOne + pipe + reelTwo + pipe + reelThree + pipe + loser);
//        } else if ((reelOne == Selection.APPLE) && (reelTwo == Selection.APPLE) && (reelThree == Selection.ORANGE)) {
//            System.out.println(prefix + reelOne + pipe + reelTwo + pipe + reelThree + pipe + loser);
//        } else if ((reelOne == Selection.APPLE) && (reelTwo == Selection.ORANGE) && (reelThree == Selection.APPLE)) {
//            System.out.println(prefix + reelOne + pipe + reelTwo + pipe + reelThree + pipe + loser);
//        } else if ((reelOne == Selection.ORANGE) && (reelTwo == Selection.APPLE) && (reelThree == Selection.APPLE)) {
//            System.out.println(prefix + reelOne + pipe + reelTwo + pipe + reelThree + pipe + loser);
//        } else if ((reelOne == Selection.APPLE) && (reelTwo == Selection.PEAR) && (reelThree == Selection.ORANGE)) {
//            System.out.println(prefix + reelOne + pipe + reelTwo + pipe + reelThree + pipe + loser);
//        } else if ((reelOne == Selection.APPLE) && (reelTwo == Selection.ORANGE) && (reelThree == Selection.PEAR)) {
//            System.out.println(prefix + reelOne + pipe + reelTwo + pipe + reelThree + pipe + loser);
//        } else if ((reelOne == Selection.PEAR) && (reelTwo == Selection.PEAR) && (reelThree == Selection.PEAR)) {
//            System.out.println(prefix + reelOne + pipe + reelTwo + pipe + reelThree + pipe + winner);
//        } else if ((reelOne == Selection.PEAR) && (reelTwo == Selection.PEAR) && (reelThree == Selection.APPLE)) {
//            System.out.println(prefix + reelOne + pipe + reelTwo + pipe + reelThree + pipe + loser);
//        } else if ((reelOne == Selection.PEAR) && (reelTwo == Selection.APPLE) && (reelThree == Selection.PEAR)) {
//            System.out.println(prefix + reelOne + pipe + reelTwo + pipe + reelThree + pipe + loser);
//        } else if ((reelOne == Selection.APPLE) && (reelTwo == Selection.PEAR) && (reelThree == Selection.PEAR)) {
//            System.out.println(prefix + reelOne + pipe + reelTwo + pipe + reelThree + pipe + loser);
//        } else if ((reelOne == Selection.PEAR) && (reelTwo == Selection.PEAR) && (reelThree == Selection.ORANGE)) {
//            System.out.println(prefix + reelOne + pipe + reelTwo + pipe + reelThree + pipe + loser);
//        } else if ((reelOne == Selection.PEAR) && (reelTwo == Selection.ORANGE) && (reelThree == Selection.PEAR)) {
//            System.out.println(prefix + reelOne + pipe + reelTwo + pipe + reelThree + pipe + loser);
//        } else if ((reelOne == Selection.ORANGE) && (reelTwo == Selection.PEAR) && (reelThree == Selection.PEAR)) {
//            System.out.println(prefix + reelOne + pipe + reelTwo + pipe + reelThree + pipe + loser);
//        } else if ((reelOne == Selection.PEAR) && (reelTwo == Selection.APPLE) && (reelThree == Selection.ORANGE)) {
//            System.out.println(prefix + reelOne + pipe + reelTwo + pipe + reelThree + pipe + loser);
//        } else if ((reelOne == Selection.PEAR) && (reelTwo == Selection.ORANGE) && (reelThree == Selection.APPLE)) {
//            System.out.println(prefix + reelOne + pipe + reelTwo + pipe + reelThree + pipe + loser);
//        } else if ((reelOne == Selection.ORANGE) && (reelTwo == Selection.ORANGE) && (reelThree == Selection.ORANGE)) {
//            System.out.println(prefix + reelOne + pipe + reelTwo + pipe + reelThree + pipe + winner);
//        } else if ((reelOne == Selection.ORANGE) && (reelTwo == Selection.ORANGE) && (reelThree == Selection.APPLE)) {
//            System.out.println(prefix + reelOne + pipe + reelTwo + pipe + reelThree + pipe + loser);
//        } else if ((reelOne == Selection.ORANGE) && (reelTwo == Selection.APPLE) && (reelThree == Selection.ORANGE)) {
//            System.out.println(prefix + reelOne + pipe + reelTwo + pipe + reelThree + pipe + loser);
//        } else if ((reelOne == Selection.APPLE) && (reelTwo == Selection.ORANGE) && (reelThree == Selection.ORANGE)) {
//            System.out.println(prefix + reelOne + pipe + reelTwo + pipe + reelThree + pipe + loser);
//        } else if ((reelOne == Selection.ORANGE) && (reelTwo == Selection.ORANGE) && (reelThree == Selection.PEAR)) {
//            System.out.println(prefix + reelOne + pipe + reelTwo + pipe + reelThree + pipe + loser);
//        } else if ((reelOne == Selection.ORANGE) && (reelTwo == Selection.PEAR) && (reelThree == Selection.ORANGE)) {
//            System.out.println(prefix + reelOne + pipe + reelTwo + pipe + reelThree + pipe + loser);
//        } else if ((reelOne == Selection.PEAR) && (reelTwo == Selection.ORANGE) && (reelThree == Selection.ORANGE)) {
//            System.out.println(prefix + reelOne + pipe + reelTwo + pipe + reelThree + pipe + loser);
//        } else if ((reelOne == Selection.ORANGE) && (reelTwo == Selection.APPLE) && (reelThree == Selection.PEAR)) {
//            System.out.println(prefix + reelOne + pipe + reelTwo + pipe + reelThree + pipe + loser);
//        } else if ((reelOne == Selection.ORANGE) && (reelTwo == Selection.PEAR) && (reelThree == Selection.APPLE)) {
//            System.out.println(prefix + reelOne + pipe + reelTwo + pipe + reelThree + pipe + loser);
//        } else {return loser;}
//            return null;
//    }



}
