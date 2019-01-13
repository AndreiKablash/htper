package util;



import domain.User;
import exception.AgeLimitException;
import exception.EmailFormatException;
import exception.UserNameException;
import exception.UserNameLengthException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {
    private static final int AGE_LIMIT = 16;
    private static final String VALID_LENGTH_FOR_FIELD = "^[а-яА-ЯёЁa-zA-Z0-9]{4,13}$";
    private static final String CHECK_FOR_RUSSIAN_LETTERS = "[а-яёА-ЯЁ]+";
    private static final String EMAIL_ADDRESS_VALID_REGEX = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$";

    private Validator() {
        throw new IllegalStateException("Utility class");
    }

    public static boolean checkUser(User user) {
        int count = 0;
        boolean validator;

        //Check for russian letters in user name
        try {
            Pattern userNameLanguageP = Pattern.compile(CHECK_FOR_RUSSIAN_LETTERS,
                    Pattern.UNICODE_CHARACTER_CLASS | Pattern.CASE_INSENSITIVE);
            Matcher m = userNameLanguageP.matcher(user.getUserName());
            if (m.find()) throw new UserNameException(user.getUserName());
        } catch (UserNameException e) {
            System.out.println(e.toString());
            count++;
        }
        //Check for invalid length of field
        try {
            Pattern userNameLengthP = Pattern.compile(VALID_LENGTH_FOR_FIELD);
            Matcher m = userNameLengthP.matcher(user.getUserName());
            if (!m.find()) throw new UserNameLengthException(user.getUserName());
        } catch (UserNameLengthException e) {
            System.out.println(e.toString());
            count++;
        }
        //Check for invalid age
        try {
            if (Integer.parseInt(user.getUserAge()) < AGE_LIMIT) {
                throw new AgeLimitException(user.getUserAge());
            }
        } catch (NumberFormatException e) {
            user.setUserAge("Invalid number format for field age: '" + user.getUserAge() + ".'");
        } catch (AgeLimitException e) {
            System.out.println(e.toString());
            count++;
        }
        //Check for invalid email name address
        try {
            Pattern emailValidator = Pattern.compile(EMAIL_ADDRESS_VALID_REGEX, Pattern.CASE_INSENSITIVE);
            Matcher m = emailValidator.matcher(user.getUserEmail());
            if (!m.find()) throw new EmailFormatException(user.getUserEmail());
        } catch (EmailFormatException e) {
            System.out.println(e.toString());
            count++;
        }
        //This block returns result of checking the user: valid or invalid.
        if (count > 0) {
            System.out.println("Invalid user with user name: " + user.getUserName());
            validator = false;
        } else {
            System.out.println("Valid user with user name: " + user.getUserName());
            validator = true;
        }
        return validator;
    }
}
