package util;

import java.util.Collection;
import java.util.Random;

public class Generator{
    private Random random;

    public Generator(){
        this.random = new Random();
    }

    //method to generate Collection<Integer> with random numbers
    public Collection<Integer> getRandomNumbers(Collection<Integer> collection, int bound, int length) {
        for (int i = 0; i < length; i++) {
            collection.add(random.nextInt(bound));
        }
        return collection;
    }

    //method to generate integer array with random numbers
    public int[] getRandomNumbers(int bound, int length) {
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = random.nextInt(bound);
        }
        return array;
    }
}
