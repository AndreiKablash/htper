package exception;

public class EmailFormatException extends Exception {
    private final String emailInfo;

    public EmailFormatException(String s) {
        this.emailInfo = s;
    }

    @Override
    public String toString() {
        return "INVALID email: " + emailInfo;
    }
}
