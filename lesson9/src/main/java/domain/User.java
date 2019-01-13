package domain;

import java.util.Objects;

public class User {
    private String userName;
    private String userAge;
    private String userLogin;
    private String userPassword;
    private String userEmail;

    public User() {
    }

    public User(String userName, String userAge, String userLogin, String userPassword, String userEmail) {
        this.userName = userName;
        this.userAge = userAge;
        this.userLogin = userLogin;
        this.userPassword = userPassword;
        this.userEmail = userEmail;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserAge() {
        return userAge;
    }

    public void setUserAge(String userAge) {
        this.userAge = userAge;
    }

    public String getUserLogin() {
        return userLogin;
    }

    public void setUserLogin(String userLogin) {
        this.userLogin = userLogin;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(userName, user.userName) &&
                Objects.equals(userAge, user.userAge) &&
                Objects.equals(userLogin, user.userLogin) &&
                Objects.equals(userPassword, user.userPassword) &&
                Objects.equals(userEmail, user.userEmail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userName, userAge, userLogin, userPassword, userEmail);
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", userAge='" + userAge + '\'' +
                ", userLogin='" + userLogin + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", userEmail='" + userEmail + '\'' +
                '}';
    }
}
