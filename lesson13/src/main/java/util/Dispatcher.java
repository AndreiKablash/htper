package util;

import domain.Client;
import domain.DispatcherStatus;

public class Dispatcher implements Runnable {
    private static final int TIME_OF_WAITING_IN_SECONDS = 20;
    private String dispatcherName;
    private boolean running;
    private DispatcherStatus status;

    public Dispatcher(String dispatcherName) {
        this.dispatcherName = dispatcherName;
        this.status = DispatcherStatus.FREE;
    }

    @Override
    public void run() {
        Client client = null;
        long callExpiration = 0L;
        long lastProcessingStartTime = System.currentTimeMillis();
        while (running) {
            if (status == DispatcherStatus.FREE) {
                client = ClientQueue.retrieveCall();
                if (client != null) {
                    System.out.println("{" + this.dispatcherName + "] - answering call from client id"
                            + client.getClientID());
                    callExpiration = System.currentTimeMillis() + client.getDurationOfCall();
                    status = DispatcherStatus.IN_A_CALL;
                    lastProcessingStartTime = System.currentTimeMillis();
                } else {
                    long currentTime = System.currentTimeMillis();
                    if ((currentTime - lastProcessingStartTime) / 1000 > TIME_OF_WAITING_IN_SECONDS) {
                        System.out.println("{" + this.dispatcherName + "]- call handling has been finished");
                        running = false;
                    }
                }
            } else {
                long currentTime = System.currentTimeMillis();
                if (currentTime < callExpiration) {
                    System.out.println("{" + this.dispatcherName + "] - processing call from client id"
                            + client.getClientID());
                } else {
                    System.out.println("{" + this.dispatcherName + "] - answering call from client id"
                            + client.getClientID() + " has been finished");
                    status = DispatcherStatus.FREE;
                }
            }
            sleep();
        }
    }

    public void start() {
        running = true;
        new Thread(this).start();
    }

    public void stop() {
        running = false;
    }

    private void sleep() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

