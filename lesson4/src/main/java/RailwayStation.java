import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class RailwayStation {
    public static void main(String[] args) {
        //creation of trains using Array
        Train train = new Train();
        Train[] trainArr = new Train[6];
        trainArr[0] = new Train("Minsk", "Moscow", 123, 10.00, 24.00, "lux");
        trainArr[1] = new Train("Minsk", "Prague", 203, 8.00, 5.00, "coupe");
        trainArr[2] = new Train("Minsk", "Moscow", 345, 15.00, 18.00, "generalseats");
        trainArr[3] = new Train("Moscow", "Minsk", 798, 9.00, 23.00, "generalseats");
        trainArr[4] = new Train("Prague", "Moscow", 1245, 15.00, 12.00, "lux");
        trainArr[5] = new Train("Moscow", "Prague", 132, 17.00, 21.00, "lux");

        //List of trains
        System.out.println("Sort trains");
        Comparator<Train> trainComparator = new TrainComparator();
        List<Train> trains = new LinkedList<>();
        trains.add(new Train("Minsk", "Moscow", 123, 10.00, 24.00, "lux"));
        trains.add(new Train("Minsk", "Prague", 203, 8.00, 5.00, "coupe"));
        trains.add(new Train("Minsk", "Moscow", 345, 15.00, 18.00, "generalseats"));
        trains.add(new Train("Moscow", "Minsk", 798, 9.00, 23.00, "generalseats"));
        trains.add(new Train("Prague", "Moscow", 1245, 15.00, 12.00, "lux"));
        trains.add(new Train("Moscow", "Prague", 132, 17.00, 21.00, "lux"));
        trains.sort(trainComparator);
        trains.forEach(System.out::println);

        //search test
        System.out.println("Condition 1");//search parameter: destination point
        train.searchTransport(trainArr, "Prague");
        System.out.println("Condition 2");//search parameters: destination point and departure time(after specific time)
        train.searchTransport(trainArr, "Prague", 17);
        System.out.println("condition 3");//search parameters: destination point and conditions
        train.searchTransport(trainArr, "prague", "lux");

        //search test for List<Train>
        System.out.println(" only  one condition for Lest<Train>");//search parameter: destination point
        train.searchTransport(trains, "Prague");
    }
}
