package util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Performer {
    //The method is used to join to List<> collection, returns in result ArrayList<>
    public <T> List<T> joinLists(List<T> list1, List<T> list2) {
        if ((list1 == null) || (list1.isEmpty() && (list2 != null))) return list2;
        if ((list2 == null) || list2.isEmpty()) return list1;
        int size = list1.size() + list2.size();
        List<T> resultList = new ArrayList<>(size);
        resultList.addAll(list1);
        resultList.addAll(list2);
        return resultList;
    }

    //intersection of two lists
    public <T> List<T> getIntersection(List<T> list1, List<T> list2) {
        if ((list1 == null) || (list1.isEmpty() && (list2 != null))) return list2;
        if ((list2 == null) || list2.isEmpty()) return list1;
        int size = list1.size() + list2.size();
        List<T> resultList = new ArrayList<>(size);
        for (T t : list1) {
            if (list2.contains(t)) {
                resultList.add(t);
            }
        }
        return resultList;
    }

    //The method is used with getIntersection method to check list
    public void emptyListCheck(List list) {
        if (list.isEmpty()) {
            System.out.println("There is no intersection");
            System.out.println("The result list is empty");
        } else {
            System.out.println(list);
        }
    }

    //The method used to merge two Maps collection.
    // If two collections have identical keys, new Value of resultMap is combined from given Maps value
    public static <K> Map<K, Integer> mergeAndAdd(Map<K, Integer> map1, Map<K, Integer> map2) {
        Map<K, Integer> resultMap = new HashMap<>(map1);
        for (Map.Entry<K, Integer> entry : map2.entrySet()) {
            K key = entry.getKey();
            Integer current = resultMap.get(key);
            resultMap.put(key, current == null ? entry.getValue() : entry.getValue() + current);
        }
        return resultMap;
    }
}
