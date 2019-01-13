package util;

import model.Book;

import java.util.ArrayList;
import java.util.List;

public class BookGenerator {
    private List<Book> booklist;

    public BookGenerator() {
        this.booklist = new ArrayList<>();
    }

    public List<Book> getBooklist() {
        return booklist;
    }

    public void generate(Book book, int numberOfBooks) {
        for (int i = 0; i < numberOfBooks; i++) {
            booklist.add(book);
        }
    }
}

