package util;

import domain.EnumCity;

import java.util.Random;

public class GeneratorTrains {
    private static final int HOURS_IN_ONE_DAY = 24;
    private static final int NUMBER_OF_TRAINS_IN_THE_DEPOT = 100;
    private Random random = new Random();

    public Train[] generatorTrains(int numberOfTrains) {
        Train trains = new Train("null", 0, 0.0,
                100, 40, 40, 20); //this is a pattern of train
        EnumCity[] types = EnumCity.values();
        Train[] train = new Train[numberOfTrains];
        for (int i = 0; i < numberOfTrains; i++) {
            train[i] = new Train(types[random.nextInt(4)].getCity(), random.nextInt(NUMBER_OF_TRAINS_IN_THE_DEPOT),
                    random.nextInt(HOURS_IN_ONE_DAY), trains.getGeneralSeats(), trains.getCoupe(),
                    trains.getSecondClass(), trains.getLux());
            System.out.println("train[" + i + "]= " + train[i]);
        }
        return train;
    }
}

