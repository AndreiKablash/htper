package exception;

public class AgeLimitException extends Exception {
    private final String ageInfo;

    public AgeLimitException(String age) {
        this.ageInfo = age;
    }

    @Override
    public String toString() {
        return "INVALID. Age limitations - 16+. Your age is "
                + ageInfo + ".";
    }
}
