import java.util.Objects;
import java.util.Scanner;

public class loginScript {
    public static void main(String[] args) {
        String username = "admin";
        String password = "Password";
        int wrong = 0;

        Scanner u = new Scanner(System.in);
        System.out.println("Enter a username");
        String uinput = u.nextLine();

        while (uinput.isEmpty()){
            System.out.println("Enter a username");
            uinput = u.nextLine();
        }

        System.out.println("Enter password");
        String pinput = u.nextLine();
        //System.out.println(uinput + " " + pinput );

        while (pinput.isEmpty()){
            System.out.println("Enter password");
            pinput = u.nextLine();
        }

        if (username.equals(uinput) && password.equals(pinput)) {
            System.out.println("You have been validated");
        }
        else {
            System.out.println("Access denied");
            wrong++;

        }

    }

}
