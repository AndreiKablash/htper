package util;

import domain.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class UserGenerator {
    private static final int AGE_MIN_BOUND = 5;
    private static final int AGE_MAX_BOUND = 100;
    private Random random; //used to generate random number
    private Random userNameRandom; //used to generate a condition to create a unique value of userName field
    private Random userAgeRandom;// used to generate a condition to create a unique value of userAge field
    private Random userEmailRandom;//used to generate a condition to create a unique value of userEmail field
    private List<User> userList;

    public UserGenerator() {
        this.random = new Random();
        this.userNameRandom = new Random();
        this.userAgeRandom = new Random();
        this.userEmailRandom = new Random();
        this.userList = new ArrayList<>();
    }

    //    This method generate instance of User and returns List<User>. Input parameter numberOfUsers - number of users.
//    User fields (userName, userAge, userLogin,userPassword,userEmail) can be valid or invalid under the condition.
//    The condition is:
//              0,1-valid field for user;
//              2-invalid field for user;
//    The condition is set by the method of nextInt() with bound 2 from java.util.Random;
    public List<User> generate(int numberOfUsers) {
        String userNameString;
        String userAgeString;
        String userLoginString;
        String userPasswordString;
        String userEmailString;
        for (int i = 0; i < numberOfUsers; i++) {
            //generate the unique user name  under the condition: valid or invalid
            userNameString = userNameRandom.nextInt(3) == 2 ? "пользователь" + i : "user" + i;
            //generate the age filed for user
            userAgeString = Integer.toString(userAgeRandom.nextInt((AGE_MAX_BOUND - AGE_MIN_BOUND) + 1)
                    + AGE_MIN_BOUND); //generate age from 5 to 100 inclusive.
            //generate unique login field for user
            userLoginString = "login" + i;
            //generate password field for user
            userPasswordString = "password" + random.nextInt();
            //generate email field for user under the condition: valid or invalid
            userEmailString = userLoginString + (userEmailRandom.nextInt(3) == 2 ? "_" : "@") + "gmail.com";
            //create new User
            userList.add(new User(userNameString, userAgeString, userLoginString, userPasswordString, userEmailString));
        }
        return userList;
    }
}
