import java.util.Scanner;

public class loginScript2 {
    public static void main(String[] args){
        String username = "admin";
        String password = "password";

        String uInput = usernameInput();
        String pInput = passwordInput();

        System.out.println("test: " + uInput + " " + pInput);

        if (username.equals(uInput) && password.equals(pInput)) {
            System.out.println("You have been validated");
        }
        else {
            System.out.println("Access denied");
        }


    }

    public static String usernameInput(){
        Scanner u = new Scanner(System.in);
        System.out.println("Enter a username");
        String username = u.nextLine();

        while (username.isEmpty()){
            System.out.println("Enter a username");
            username = u.nextLine();
        }

        return username;
    }
    public static String passwordInput(){
        Scanner u = new Scanner(System.in);
        System.out.println("Enter a password");
        String password = u.nextLine();

        while (password.isEmpty()){
            System.out.println("Enter password");
            password = u.nextLine();
        }

        return password;
    }

}
