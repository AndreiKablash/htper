import java.util.Objects;

public abstract class AbstractTransport {
    private String depaturePoint;
    private String destinationPoint;
    private int transportNumber;

    public AbstractTransport() {
    }

    public AbstractTransport(String depaturePoint, String destinationPoint, int transportNumber) {
        this.depaturePoint = depaturePoint;
        this.destinationPoint = destinationPoint;
        this.transportNumber = transportNumber;
    }
    public String getDepaturePoint() {
        return depaturePoint;
    }
    public String getDestinationPoint() {
        return destinationPoint;
    }
    public int getTransportNumber() {
        return transportNumber;
    }
    //specific method
    protected final String printAbstract(){
        return "Your search result:";
    }
    // abstract method
    abstract void searchTransport(AbstractTransport[] array, String destinationPoint);

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbstractTransport that = (AbstractTransport) o;
        return transportNumber == that.transportNumber &&
                Objects.equals(depaturePoint, that.depaturePoint) &&
                Objects.equals(destinationPoint, that.destinationPoint);
    }

    @Override
    public int hashCode() {
        return Objects.hash(depaturePoint, destinationPoint, transportNumber);
    }

    @Override
    public String toString() {
        return  printAbstract()+ " depature Point='" + depaturePoint + '\'' +
                ", destination Point='" + destinationPoint + '\'' +
                ", transport Number=" + transportNumber;
    }
}
