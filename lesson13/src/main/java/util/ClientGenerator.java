package util;

import java.util.Random;

public class ClientGenerator {
    private Random random;

    public ClientGenerator() {
        this.random = new Random();
    }

    public void generateClients(int numberOfClients) {
        int count = 0;
        while (count < numberOfClients) {
            int duration = random.nextInt(10000);
            if (duration > 1) {
                ClientQueue.queueClient(duration);
                System.out.println("Created new call in duration  " + duration + " milliseconds");
                count++;
                sleep();
            }
        }
    }

    private void sleep() {
        try {
            int sleep = random.nextInt(10);
            Thread.sleep(sleep * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
