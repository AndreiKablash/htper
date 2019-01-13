package domain;

import java.io.Serializable;
import java.util.Objects;

public class Client implements Serializable {
    private int clientID;
    private int durationOfCall;

    public Client() {
    }

    public Client(int clientID, int durationOfCall) {
        this.clientID = clientID;
        this.durationOfCall = durationOfCall;
    }

    public int getClientID() {
        return clientID;
    }

    public int getDurationOfCall() {
        return durationOfCall;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return clientID == client.clientID &&
                durationOfCall == client.durationOfCall;
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientID, durationOfCall);
    }

    @Override
    public String toString() {
        return "Client{" +
                "clientID=" + clientID +
                ", durationOfCall=" + durationOfCall +
                '}';
    }
}
