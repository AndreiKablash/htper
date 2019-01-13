package util;


import domein.Fruit;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Generator {
    private Random random;

    public Generator() {
        this.random = new Random();
    }

    public List<Fruit> getFruitList(int numberOfUnits) {
        String fruitName;
        String id;
        List<Fruit> list = new ArrayList<>();
        for (int i = 0; i < numberOfUnits; i++) {
            id = String.valueOf(i + random.nextInt(10));//generate ID for fruit
            fruitName = "fruit" + id;
            list.add(new Fruit(fruitName));
        }
        return list;
    }

    public Map<Fruit, Integer> getFruitBasket(int numberOfFruits) {
        String fruitName;
        Map<Fruit, Integer> map = new HashMap<>();
        for (int i = 0; i < numberOfFruits; i++) {
            fruitName = "fruit" + "_" + (i + 1);
            map.put(new Fruit(fruitName), random.nextInt(10));
        }
        return map;
    }
}
