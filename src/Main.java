import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Person 1
        String p1FirstName = "P";
        String p1LastName = "T";
        String p1Username = p1FirstName + " " + p1LastName;

        //Person 2
        String p2FirstName = InputHelper.getNonZeroLenString(scan, "Enter Person 2's First Name:");
        String p2LastName = InputHelper.getNonZeroLenString(scan, "Enter Person 2's Last Name:");
        String p2Username = p2FirstName + " " + p2LastName;
        int p2X = InputHelper.getRangedInt(scan, "Enter Person 2's X Coordinate:",0,1000);
        int p2Y = InputHelper.getRangedInt(scan, "Enter Person 2's Y Coordinate:",0,100);
        int p2Z = InputHelper.getRangedInt(scan, "Enter Person 2's Z Coordinate:",0,1000);

        //Person 3
        String p3FirstName = InputHelper.getNonZeroLenString(scan, "Enter Person 3's First Name:");
        String p3LastName = InputHelper.getNonZeroLenString(scan, "Enter Person 3's Last Name:");
        String p3Username = p3FirstName + " " + p3LastName;
        int p3Age = InputHelper.getRangedInt(scan, "Get Person 3's Age: [1-99]", 1, 99);
        int p3Health = InputHelper.getRangedInt(scan, "Enter Person 3's HP:",0,100);
        int p3Direction = InputHelper.getRangedInt(scan, "Enter Person 3's Direction:",1,6);
        int p3X = InputHelper.getRangedInt(scan, "Enter Person 3's X Coordinate:",0,1000);
        int p3Y = InputHelper.getRangedInt(scan, "Enter Person 3's Y Coordinate:",0,100);
        int p3Z = InputHelper.getRangedInt(scan, "Enter Person 3's Z Coordinate:",0,1000);

        //Creating Person Objects
        Person p1 = new Person(p1Username);
        Person p2 = new Person(p2Username, 16, 1, p2X, p2Y, p2Z);
        Person p3 = new Person(p3Username, p3Age, p3Health, p3Direction, p3X, p3Y, p3Z);

        //Displaying the info using toString
        System.out.println("Person 1 Info\n" + p1);
        System.out.println("Person 2 Info\n" + p2);
        System.out.println("Person 3 Info\n" + p3);


    }
}
