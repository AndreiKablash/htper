package model;

import java.util.Comparator;
import java.util.Objects;

public class Book implements Comparable<Book> {
    private String bookName;
    private String writerName;
    private String writerPatronymic;
    private String writerSurname;

    public Book() {
    }

    public Book(String bookName, String writerName, String writerPatronymic, String writerSurname) {
        this.bookName = bookName;
        this.writerName = writerName;
        this.writerPatronymic = writerPatronymic;
        this.writerSurname = writerSurname;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getWriterName() {
        return writerName;
    }

    public void setWriterName(String writerName) {
        this.writerName = writerName;
    }

    public String getWriterPatronymic() {
        return writerPatronymic;
    }

    public void setWriterPatronymic(String writerPatronymic) {
        this.writerPatronymic = writerPatronymic;
    }

    public String getWriterSurname() {
        return writerSurname;
    }

    public void setWriterSurname(String writerSurname) {
        this.writerSurname = writerSurname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(bookName, book.bookName) &&
                Objects.equals(writerName, book.writerName) &&
                Objects.equals(writerPatronymic, book.writerPatronymic) &&
                Objects.equals(writerSurname, book.writerSurname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, writerName, writerPatronymic, writerSurname);
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", writerName='" + writerName + '\'' +
                ", writerPatronymic='" + writerPatronymic + '\'' +
                ", writerSurname='" + writerSurname + '\'' +
                '}';
    }

    //Comparable.comparator(Object o) for sort object by one field book title
    @Override
    public int compareTo(Book o) {
        return this.bookName.compareTo(o.getBookName());
    }

    //the comparator sorts the list or array of objects by writer name
    public static Comparator<Book> writersNameComparator = new Comparator<Book>() {
        @Override
        public int compare(Book o1, Book o2) {
            return o1.getWriterName().compareTo(o2.getWriterName());
        }
    };
    //the comparator sorts the list or collection of objects by writer surname
    public static Comparator<Book> writersSurnameComparator = new Comparator<Book>() {
        @Override
        public int compare(Book o1, Book o2) {
            return o1.getWriterSurname().compareTo(o2.getWriterSurname());
        }
    };
    //the comparator sorts the list or collection of objects by writer patronymic
    public static Comparator<Book> writerPatronymicComparator = new Comparator<Book>() {
        @Override
        public int compare(Book o1, Book o2) {
            return o1.getWriterPatronymic().compareTo(o2.getWriterPatronymic());
        }
    };
}
