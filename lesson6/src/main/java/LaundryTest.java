import domain.EnumStore;
import util.WashingMachine;

public class LaundryTest {
    public static void main(String[] args) {
        WashingMachine washingMachine = new WashingMachine("123", "53", "79", "Bosch",
                EnumStore.AUTOMATIC, "white", 7.5);
        //get type from enum
        System.out.println(EnumStore.AUTOMATIC.getType() + " washing machine " + washingMachine.getName());
        System.out.println(washingMachine.getType() + " - test");//get type from washing machine
        //call switch
        System.out.println(EnumStore.AUTOMATIC.isType());
        //call getSize method
        System.out.print("Washing machine size: ");
        washingMachine.getSize();
        System.out.println();

        //Methods implementation
        System.out.println("Instruction");
        System.out.println("Load a laundry");
        washingMachine.load(5);
        //Plug in
        washingMachine.plugIn();
        //choose program
        washingMachine.setSettings();
        //Start washing machine
        washingMachine.start();
    }
}
