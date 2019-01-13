import java.util.List;
import java.util.Objects;

public class Transport extends AbstractTransport {
    private double depatureTime;
    private double arrivalTime;

    public Transport() {
    }

    public Transport(String depaturePoint, String destinationPoint, int transportNumber,
                     double depatureTime, double arrivalTime) {
        super(depaturePoint, destinationPoint, transportNumber);
        this.depatureTime = depatureTime;
        this.arrivalTime = arrivalTime;
    }

    public double getDepatureTime() {
        return depatureTime;
    }
    public double getArrivalTime() {
        return arrivalTime;
    }


    @Override
    public void searchTransport(AbstractTransport[] array, String destinationPoint) {
        int number=0;
        for(AbstractTransport t: array)
            if(t.getDestinationPoint().equalsIgnoreCase(destinationPoint)){
                System.out.println(t);
                number++;
            }
        if(number==0) System.out.println("There is no such train");
    }
    //Method overload for searchTransport in class Transport
    public void searchTransport(Transport[] array, String destinationPoint, double depatureTime) {
        int number=0;
        for(Transport t: array)
            if(t.getDestinationPoint().equalsIgnoreCase(destinationPoint)&&t.getDepatureTime()>=depatureTime){
                System.out.println(t);
                number++;
            }
        if(number==0) System.out.println("There is no such train");
    }

    //search for List<Train>
    public void searchTransport(List<Train> trains, String destinationPoint) {
        int number=0;
        for(Train t: trains)
            if(t.getDestinationPoint().equalsIgnoreCase(destinationPoint)&&t.getDepatureTime()>=depatureTime){
                System.out.println(t);
                number++;
            }
        if(number==0) System.out.println("There is no such train");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Transport transport = (Transport) o;
        return Double.compare(transport.depatureTime, depatureTime) == 0 &&
                Double.compare(transport.arrivalTime, arrivalTime) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), depatureTime, arrivalTime);
    }

    @Override
    public String toString() {
        return super.toString()+ ", depature Time= " +depatureTime+
                ", arrival Time= " + arrivalTime;
    }
}
