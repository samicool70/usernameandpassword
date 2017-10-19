import java.util.Scanner;
import java.lang.String;
public class usernameandpassword {
    public static void main(String[]args) {
        Scanner keyboard= new Scanner(System.in);//use a scanner named keyboard
        String username,password;
        System.out.println("Enter your username");//prompt user to input username
        username=keyboard.nextLine();//read username
        System.out.println("Enter your password");//prompt user to input password
        password=keyboard.nextLine();//read password
        if (username.equals("Sami")&&(password.equals("cscsami200"))) {
            System.out.println("welcome Samy");//Display Welcome Sami
        }
        else {//if username and password do not match
            System.out.println("Wrong username and password");//display wrong username or password
	}
    }
}

