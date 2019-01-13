
import domain.User;
import util.UserGenerator;
import util.Validator;

public class UserCheckMain {
    public static void main(String[] args) {
        //create instance of UserGenerator
        UserGenerator userGenerator = new UserGenerator();
        //call method generate from UserGenerator and print the list of users in console
        //validation check block
        System.out.println("Validation check:");
        for (User list : userGenerator.generate(15)) {
            //print user information in console
            System.out.println(list);
            //checking user fields
            Validator.checkUser(list);
            System.out.println();
        }
    }
}
