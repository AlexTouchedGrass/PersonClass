import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Person 1
        String p1FirstName = InputHelper.getNonZeroLenString(scan, "Enter Person 1's First Name:");
        String p1lastName = InputHelper.getNonZeroLenString(scan, "Enter Person 1's Last Name:");
        int p1Age = InputHelper.getRangedInt(scan, "Get Person 1's Age: [1-99]", 1, 99);

        //Person 2
        String p2FirstName = InputHelper.getNonZeroLenString(scan, "Enter Person 2's First Name:");
        String p2lastName = InputHelper.getNonZeroLenString(scan, "Enter Person 2's Last Name:");
        int p2Age = InputHelper.getRangedInt(scan, "Get Person 2's Age: [1-99]", 1, 99);

        //Creating Person Objects
        Person p1 = new Person(p1FirstName, p1lastName, p1Age);
        Person p2 = new Person(p2FirstName, p2lastName, p2Age);

        //Displaying the info using toString
        System.out.println("Person 1 Info\n" + p1);
        System.out.println("Person 2 Info\n" + p2);

        //Updating Info
        p2.setLastName("Noob");
        p1.setAge(32);

        //Redisplaying Info
        System.out.println("Person 1 Info\n" + p1);
        System.out.println("Person 2 Info\n" + p2);
    }
}
