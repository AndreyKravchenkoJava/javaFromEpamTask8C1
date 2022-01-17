package project;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("Enter the your password: ");
        Scanner scanner = new Scanner(System.in);
        String password = scanner.next();


        Pattern pattern = Pattern.compile("^(?=.*[0-9])(?=.*[A-Z])(?=.*[a-z])(\\_?).{10,}$");
        Matcher matcher = pattern.matcher(password);

        if (matcher.find() == true) {
                System.out.println("Password: " + password + " strong");
            } else {
                    System.out.println("Password: " + password + " weak");
        }
    }
}
