
import methods.FifthTask;
import methods.FirstTask;
import methods.FourthTask;
import methods.SecondTask;
import methods.ThirdTask;
import model.Book;
import model.Student;
import util.BookGenerator;
import util.StudentGenerator;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class CollectionsMain {
    public static void main(String[] args) {
        //Task 1
        System.out.println("Task 1");
        BookGenerator bookGenerator = new BookGenerator();
        Book firstBook = new Book("The Hobbit, or There and Back Again",
                "J. R. R.", "", "Tolkien");
        Book secondBook = new Book("Lord of the Rings",
                "J. R. R.", "", "Tolkien");
        Book thirdBook = new Book("All the Light We Cannot See",
                "Anthony", "", "Doerrn");
        bookGenerator.generate(firstBook, 1);
        bookGenerator.generate(secondBook, 1);
        bookGenerator.generate(thirdBook, 1);
        List<Book> bookList = new LinkedList<>(bookGenerator.getBooklist());
        //call method to print list collection and remove second element from book collection
        FirstTask.removeMethod(bookList);

        //Task 2
        System.out.println();
        System.out.println("Task 2");
        // Generation of new copies of books
        Book fourthBook = new Book("Мастер и Маргарита",
                "Михаил", "Афанасьевич", "Булгак");
        Book fifthBook = new Book("Евгений Онегин", "Александр",
                "Сергеевич", "Пушкин");
        Book sixthBook = new Book("Преступление и наказание",
                "Федор", "Михайлович", "Достоевский");
        Book seventhBook = new Book("Война и мир",
                "Лев", "Николаевич", "Толстой");
        Book eighthBook = new Book("Алиса в Стране чудес",
                "Льюис", "", "Кэрролл");
        bookGenerator.generate(fourthBook, 2);
        bookGenerator.generate(fifthBook, 3);
        bookGenerator.generate(sixthBook, 4);
        bookGenerator.generate(seventhBook, 1);
        bookGenerator.generate(eighthBook, 5);
        //fill Set<> collection with books
        Set<Book> hashBook = new HashSet<>(bookGenerator.getBooklist());
        //call method to search for books whose name begins with a vowel
        SecondTask.bookNameSearch(hashBook);

        //Task 3
        System.out.println();
        System.out.println("Task 3");
        //Method to sort Set<Book> collection by writer name using treeSet and method compareTo from Book class
        ThirdTask.sortByName(hashBook);
        //Method to sort Set<Book> collection by writers surname using List and method compareTo from Book class
        ThirdTask.sortBySurname(hashBook);
        //Method to sort Set<Book> collection by patronymics using List and method compareTo from Book class
        ThirdTask.sortByPatronymics(hashBook);


        //Task 4
        System.out.println();
        System.out.println("Task 4");
        //call student generator method and fill TreeSet<> collection
        StudentGenerator studentGenerator = new StudentGenerator();
        Set<Student> students = new TreeSet<>(studentGenerator.generate(10));
        //call static method to remove every odd student from collection
        FourthTask.oddStudentsDelete(students);

        //Task 5
        System.out.println();
        System.out.println("Task 5");
        //fill Map<> collection
        Map<String, Integer> electronics = new HashMap<>();
        electronics.put("Mobile Phones & Accessories", 21563);
        electronics.put("Camera & Photo", 13252);
        electronics.put("Computers & Accessories", 20788);
        electronics.put("Television & Video", 14670);
        electronics.put("Audio", 9340);
        electronics.put("Tablets, eBook Readers, Accessories", 9340);
        electronics.put("Gadgets", 5671);
        electronics.put("Video Games", 2345);
        electronics.put("Ammunition & Explosives", 35689);
        electronics.put("Car & Vehicle Electronics", 0);
        electronics.put("GPS & Navigations", 0);
        //call method to sort collection
        FifthTask.sortHashMap(electronics);
        //call method to remove all category with zero units of goods
        FifthTask.zeroUnitsRemove(electronics);
        //call method to get element of collection with highest value
        FifthTask.getElementWithHighestValue(electronics);
    }
}
