package exception;

public class UserNameLengthException extends Exception {
    private final String userNameInfo;

    public UserNameLengthException(String s) {
        this.userNameInfo = s;
    }

    @Override
    public String toString() {
        return "INVALID length for user name: " + userNameInfo + ". " +
                "**User name length should be from 1 to 13 symbols.**";
    }
}
