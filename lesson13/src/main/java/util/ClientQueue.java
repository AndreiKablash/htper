package util;

import domain.Client;

import java.util.concurrent.LinkedBlockingQueue;

public class ClientQueue {
    private static ClientQueue instance;
    private int counter;
    private LinkedBlockingQueue<Client> queue;

    public ClientQueue() {
        this.counter = 1;
        this.queue = new LinkedBlockingQueue<Client>();
    }

    public static void queueClient(int duration) {
        Client client = null;
        try {
            client = new Client(getInstance().counter++, duration);
            System.out.println("New clint id" + client.getClientID());
            getInstance().queue.put(client);
        } catch (InterruptedException e) {
            System.out.println("Error in the queueing the client id" + client.getClientID());
        }
    }

    public static Client retrieveCall() {
        Client client = getInstance().queue.poll();
        if (client != null) {
            System.out.println("Retrieving call from client id" + client.getClientID());
        }
        return client;
    }

    private static ClientQueue getInstance() {
        if (instance == null) {
            instance = new ClientQueue();
        }
        return instance;
    }
}


