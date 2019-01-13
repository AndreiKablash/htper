package methods;

import model.Student;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class FourthTask {

    private FourthTask() {
        throw new IllegalStateException("Utility class");
    }

    //the method is used to remove every odd student from collection
    public static void oddStudentsDelete(Set<Student> students) {
        //add TreeSet collection in LinkedList to use ListIterator
        List<Student> list = new LinkedList<>(students);
        for (Student st : list) {
            System.out.println(st);
        }
        System.out.println("after removing the odd student from collection");
        ListIterator<Student> ir = list.listIterator();
        while (ir.hasNext()) {
            ir.next();
            if (ir.previousIndex() % 2 == 0 && ir.previousIndex() != -1) {
                System.out.println(ir.next());
            } else {
                ir.previous();
                ir.remove();
            }
        }
    }
}
