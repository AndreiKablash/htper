import util.GeneratorTrains;
import util.Train;

public class TrainStation {
    public static void main(String[] args) {
        //creation of trains array using generator
        System.out.println("List of trains:");
        GeneratorTrains generator = new GeneratorTrains();
        Train[] trainsArray = generator.generatorTrains(11);
        System.out.println("Results of your search: ");

        //search trains by destination point - condition #1
        System.out.println("Search condition #1");
        Train.search(trainsArray, "Prague");

        //search trains by destination point and depature time - condition #2
        System.out.println("Search condition #2");
        Train.search(trainsArray, "Prague", 10.00);

        //search trains by destination point and general seats - condition #3
        System.out.println("Search condition #3");
        Train.search(trainsArray, "Prague", 10);

    }
}
