

import domein.Fruit;
import util.Generator;
import util.Performer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Generator generator = new Generator();
        Performer performer = new Performer();

        System.out.println("Task 1");
        //call generator to get first list of Fruit collection
        List<Fruit> list1 = new ArrayList<>(generator.getFruitList(4));
        //call generator to get second list of Fruit collection
        List<Fruit> list2 = new ArrayList<>(generator.getFruitList(5));
        System.out.println(list1);
        System.out.println(list2);
        //call method to join lists
        System.out.println("union");
        System.out.println(performer.joinLists(list1, list2));
        //call method to get intersection and check result list on emptiness
        System.out.println("intersection");
        performer.emptyListCheck(performer.getIntersection(list1, list2));
        System.out.println();

        //call method to merge two maps
        System.out.println("First basket of fruits");
        Map<Fruit, Integer> firstBasket = new HashMap<>(generator.getFruitBasket(10));
        System.out.println(firstBasket);
        System.out.println("Second basket of fruits");
        Map<Fruit, Integer> secondBasket = new HashMap<>(generator.getFruitBasket(5));
        System.out.println(secondBasket);
        System.out.println("Merged baskets ");
        Map<Fruit, Integer> mergedBaskets = new HashMap<>(performer.mergeAndAdd(firstBasket, secondBasket));
        for (Map.Entry<Fruit, Integer> map : mergedBaskets.entrySet()) {
            System.out.println(map.getKey() + "=" + map.getValue());
        }
    }
}
