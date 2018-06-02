public class FruitMachine {

    Selection reelOneChoice;
    Selection reelTwoChoice;
    Selection reelThreeChoice;

    public FruitMachine (Selection reelOneChoice, Selection reelTwoChoice, Selection reelThreeChoice){
        this.reelOneChoice = reelOneChoice;
        this.reelTwoChoice = reelTwoChoice;
        this.reelThreeChoice = reelThreeChoice;

    }

    public Selection getSelection(Selection choice) {
        return this.reelOneChoice = choice;
    }

}
