import java.util.ArrayList;
import java.util.Scanner;

public class Task1 {
    final static String stringQuestions[] = {"Full Name", "Username", "Password", "Phone Number", "Email Address", "Address", "Contact Number"};
    static ArrayList<String> stringResponses = new ArrayList<>();
    final static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        for (int i = 0; i < stringQuestions.length; i++)
        {
            System.out.println("Enter your " + stringQuestions[i]);
            stringResponses.add(stringQuestions[i] + ": " + sc.nextLine());
        }

        System.out.println("Would you like to receive emails? (Enter a yes or a no) ");
        stringResponses.add("Send Emails: " + (sc.next().equals("yes")? "true": "false"));

        for(int i = 0; i<2; i++)
        {
            String date = "";
            if (i == 0) {
                System.out.println("Valid From");
            } else {
                System.out.println("Valid Till");
            }
            System.out.println("Enter day");
            date+=sc.next() + "/";
            System.out.println("Enter month");
            date+=sc.next() + "/";
            System.out.println("Enter year");
            date+=sc.next();
            stringResponses.add((i==0? "Valid From: ": "Valid Till: ") + date);
        }
        System.out.println(stringResponses);
    }
}
