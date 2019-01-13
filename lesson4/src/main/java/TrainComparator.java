import java.util.Comparator;

public class TrainComparator implements Comparator<Train> {
    @Override
    public int compare(Train o1, Train o2) {
        if(o1.getDepatureTime()>o2.getDepatureTime()){
            return 1;
        }
        else {
            if (o1.getDepatureTime() == o2.getDepatureTime()) {
                return 0;
            } else return -1;
        }
    }
}
