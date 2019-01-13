import java.util.Objects;

public class Train extends Transport {
    private String comfort;

    public Train() {
    }
    public Train(String depaturePoint, String destinationPoint, int transportNumber, double depatureTime, double arrivalTime, String comfort) {
        super(depaturePoint, destinationPoint, transportNumber, depatureTime, arrivalTime);
        this.comfort = comfort;
    }
    public String getComfort() {
        return comfort;
    }

    @Override
    public void searchTransport(AbstractTransport[] array, String destinationPoint) {
        super.searchTransport(array, destinationPoint);
    }
    @Override
    public void searchTransport(Transport[] array, String destinationPoint, double depatureTime) {
        super.searchTransport(array, destinationPoint, depatureTime);
    }
    //overload searchTransport train Train class
    public void searchTransport(Train[] array, String destinationPoint, String comfort){
        int number=0;
        for(Train t: array){
            if(t.getDestinationPoint().equalsIgnoreCase(destinationPoint)&&t.getComfort().equalsIgnoreCase(comfort)){
                System.out.println(t);
                number++;
            }
        }
        if(number==0) System.out.println("There is no such train");
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Train train = (Train) o;
        return Objects.equals(comfort, train.comfort);
    }
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), comfort);
    }
    @Override
    public String toString() {
        return super.toString() + ", comfort = "+ comfort;
    }
}
