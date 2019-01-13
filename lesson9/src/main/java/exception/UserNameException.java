package exception;

public class UserNameException extends Exception {
    private final String userNameInfo;

    public UserNameException(String s) {
        this.userNameInfo = s;
    }

    @Override
    public String toString() {
        return "INVALID user name  " + userNameInfo + ". "
                + "**User name shouldn't contains russian letters!**";
    }
}
