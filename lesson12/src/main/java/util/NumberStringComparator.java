package util;

import java.util.Comparator;

public class NumberStringComparator implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        //correct check for string numbers
        int difference = o1.length() - o2.length();
        if (difference == 0) {
            // o1.length() and o2.length() are equal
            return o1.compareTo(o2);
        } else {
            //o1.length() and o2.length() are different
            return difference;
        }
    }
}
