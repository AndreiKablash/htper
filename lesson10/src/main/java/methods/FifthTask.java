package methods;


import util.MapComparatorByValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class FifthTask {
    private static final int VALUE_OF_EMPTY_CATEGORY = 0;

    private FifthTask() {
        throw new IllegalStateException("Utility class");
    }

    //The method is used to sort HashMap<> collection by Value
    public static void sortHashMap(Map<String, Integer> maps) {
        List<Map.Entry<String, Integer>> list = new ArrayList<>(maps.entrySet());
        list.sort(new MapComparatorByValue());
        System.out.println();
        for (Map.Entry<String, Integer> lh : list) {
            System.out.println(lh.getKey() + ": " + lh.getValue() + " units");
        }
        System.out.println();
    }

    //The method is used to sort and remove all category with zero units of goods
    public static void zeroUnitsRemove(Map<String, Integer> maps) {
        System.out.println("After deleting category with zero units of goods");
        List<Map.Entry<String, Integer>> list = new ArrayList<>(maps.entrySet());
        list.sort(new MapComparatorByValue());
        Iterator<Map.Entry<String, Integer>> irr = list.iterator();
        while (irr.hasNext()) {
            Map.Entry entryMap = irr.next();
            if (entryMap.getValue().equals(VALUE_OF_EMPTY_CATEGORY))
                irr.remove();
        }
        for (Map.Entry<String, Integer> lh : list) {
            System.out.println(lh.getKey() + ": " + lh.getValue() + " units");
        }
        System.out.println();
    }

    //The method is used to get element of collection with highest value
    public static void getElementWithHighestValue(Map<String, Integer> maps) {
        System.out.println("Element of collection with highest value");
        // getting the maximum value in the collection
        int maxValueInMap = (Collections.max(maps.values()));
        for (Map.Entry<String, Integer> lh : maps.entrySet()) {
            // this is the element which has the max value
            if (lh.getValue() == maxValueInMap) {
                System.out.println(lh.getKey() + ": " + lh.getValue() + " units");
            }
        }
        System.out.println();
    }
}
