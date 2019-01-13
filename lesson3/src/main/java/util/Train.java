package util;

public class Train {
    private String destination;
    private int trainNumber;
    private double depatureTime;
    private int seatsNumber;
    private int generalSeats;
    private int coupe;
    private int secondClass;
    private int lux;
    private int getSeatsNumber;

    public Train() {
    }

    public Train(String destination, int trainNumber, double depatureTime, int generalSeats, int coupe, int secondClass, int lux) {
        this.destination = destination;
        this.trainNumber = trainNumber;
        this.depatureTime = depatureTime;
        this.generalSeats = generalSeats;
        this.coupe = coupe;
        this.secondClass = secondClass;
        this.lux = lux;
        this.seatsNumber = generalSeats + coupe + secondClass + lux;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(int trainNumber) {
        this.trainNumber = trainNumber;
    }

    public double getDepatureTime() {
        return depatureTime;
    }

    public void setDepatureTime(double depatureTime) {
        this.depatureTime = depatureTime;
    }

    public int getSeatsNumber() {
        return seatsNumber;
    }

    public void setSeatsNumber(int seatsNumber) {
        this.seatsNumber = seatsNumber;
    }

    public int getGeneralSeats() {
        return generalSeats;
    }

    public void setGeneralSeats(int generalSeats) {
        this.generalSeats = generalSeats;
    }

    public int getCoupe() {
        return coupe;
    }

    public void setCoupe(int coupe) {
        this.coupe = coupe;
    }

    public int getSecondClass() {
        return secondClass;
    }

    public void setSecondClass(int secondClass) {
        this.secondClass = secondClass;
    }

    public int getLux() {
        return lux;
    }

    public void setLux(int lux) {
        this.lux = lux;
    }

    public int getGetSeatsNumber() {
        return getSeatsNumber;
    }

    public void setGetSeatsNumber(int getSeatsNumber) {
        this.getSeatsNumber = getSeatsNumber;
    }

    //case where the list of trains go to given destination point
    public static void search(Train[] array, String destination) {
        int number = 0;
        for (Train t : array) {
            if (t.getDestination().equals(destination)) {
                System.out.println(t);
                number++;
            }
        }
        if (number == 0) System.out.println("There is no such train");
    }

    //case where the list of trains go to given destination point and after given time
    public static void search(Train[] array, String destination, double depatureTime) {
        int number = 0;
        for (Train t : array) {
            if (t.getDestination().equals(destination) && t.getDepatureTime() > depatureTime) {
                System.out.println(t);
                number++;
            }
        }
        if (number == 0) System.out.println("There is no such train");
    }

    //case where the list of trains go to given destination point and which have general seats
    public static void search(Train[] array, String destination, int generalSeats) {
        int number = 0;
        for (Train t : array) {
            if (t.getDestination().equals(destination) && t.getGeneralSeats() != 0) {
                System.out.println(t);
                number++;
            }
        }
        if (number == 0) System.out.println("There is no such train");
    }

    @Override
    public String toString() {
        return "destination: " + this.getDestination() + ", train number: " + this.getTrainNumber() +
                ", depature time: " + this.getDepatureTime() + ", seats number: " + this.getSeatsNumber() + ", general seats: " + this.getGeneralSeats() +
                ", coupe: " + this.getCoupe() + ", second class: " + this.getSecondClass() + ", lux: " + this.getLux();
    }
}

