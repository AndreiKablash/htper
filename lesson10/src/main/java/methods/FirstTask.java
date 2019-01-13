package methods;



import model.Book;

import java.util.List;

public class FirstTask {
    private static final int PARAMETER = 1; // due to condition to remove second Book set for PARAMETER value = 1

    private FirstTask() {
        throw new IllegalStateException("Utility class");
    }

    //The method satisfying the following conditions:
    //print collection in console
    //remove element from collection (PARAMETER set number of element to remove)
    //print collection in console after removing
    public static void removeMethod(List<Book> books) {
        for (Book book : books) {
            System.out.println(book);
        }
        books.remove(PARAMETER);//delete second book
        System.out.println("Book list after removal");
        for (Book book : books) {
            System.out.println(book);
        }

    }

}
