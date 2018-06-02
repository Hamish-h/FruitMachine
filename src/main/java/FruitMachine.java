public class FruitMachine {

    private Selection fruitMachineChoice;

    public FruitMachine (Selection fruitMachineChoice){
        this.fruitMachineChoice = fruitMachineChoice;
    }

    public Selection getSelection(Selection choice) {
        return this.fruitMachineChoice = choice;
    }

}
