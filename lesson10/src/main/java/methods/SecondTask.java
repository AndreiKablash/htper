package methods;

import model.Book;

import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SecondTask {
    private static final String SEARCH_PARAMETER = "^[aeiouyAEIOUYаоиеёэыуюяАОИЕЁЭЫУЮЯ]";

    private SecondTask() {
        throw new IllegalStateException("Utility class");
    }

    //The method is used to search for books whose name begins with a vowel
    public static void bookNameSearch(Set<Book> books) {
        Pattern pattern = Pattern.compile(SEARCH_PARAMETER);
        for (Book book : books) {
            Matcher matcher = pattern.matcher(book.getBookName());
            if (matcher.find()) {
                System.out.println(book);
            }
        }
    }
}
