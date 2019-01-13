package methods;

import model.Book;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ThirdTask {
    private static List<Book> list;

    private ThirdTask() {
        throw new IllegalStateException("Utility class");
    }

    //The method is used to sort collection of books by writers name
    public static void sortByName(Set<Book> books) {
        System.out.println("Sort by writers name");
        Set<Book> treeSetForHash = new TreeSet<>(Book.writersNameComparator);
        treeSetForHash.addAll(books);
        for (Book element : treeSetForHash) {
            System.out.println(element);
        }
        System.out.println();
    }

    //he method is used to sort collection of books by writers surname
    public static void sortBySurname(Set<Book> books) {
        System.out.println("Sort by writers surname");
        list = new LinkedList<>(books);
        list.sort(Book.writersSurnameComparator);
        for (Book element : list) {
            System.out.println(element);
        }
        System.out.println();
    }

    //he method is used to sort collection of books by writers patronymic
    public static void sortByPatronymics(Set<Book> books) {
        System.out.println("Sort by patronymic");
        list = new LinkedList<>(books);
        list.sort(Book.writerPatronymicComparator);
        for (Book element : list) {
            System.out.println(element);
        }
        System.out.println();
    }
}
