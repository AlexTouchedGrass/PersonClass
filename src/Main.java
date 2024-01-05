import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String msg = "SkyWorld VI";
        //Title
        int leftSpaces = ((54-msg.length())/2);
        int rightSpaces = (54-leftSpaces-msg.length());

        InputHelper.printCharacter("*", 60, true);

        InputHelper.printCharacter("*",3, false);
        InputHelper.printCharacter(" ", leftSpaces, false);
        System.out.print(msg);
        InputHelper.printCharacter(" ", rightSpaces, false);
        InputHelper.printCharacter("*", 3, true);

        InputHelper.printCharacter("*", 60, false);

        System.out.println("");
        //Person 1
        String p1FirstName = InputHelper.getNonZeroLenString(scan, "Enter Person 3's First Name:");
        String p1LastName = InputHelper.getNonZeroLenString(scan, "Enter Person 3's Last Name:");
        String p1Username = p1FirstName + " " + p1LastName;
        int p1Age = InputHelper.getRangedInt(scan, "Get Person 1's Age: [1-99]", 1, 99);
        int p1Health = InputHelper.getRangedInt(scan, "Enter Person 1's HP:",0,100);
        int p1Direction = InputHelper.getRangedInt(scan, "Enter Person 1's Direction:",1,6);
        int p1X = InputHelper.getRangedInt(scan, "Enter Person 1's X Coordinate:",0,100);
        int p1Y = InputHelper.getRangedInt(scan, "Enter Person 1's Y Coordinate:",0,100);
        int p1Z = InputHelper.getRangedInt(scan, "Enter Person 1's Z Coordinate:",0,100);

        //Person 2
        String p2FirstName = InputHelper.getNonZeroLenString(scan, "Enter Person 2's First Name:");
        String p2LastName = InputHelper.getNonZeroLenString(scan, "Enter Person 2's Last Name:");
        String p2Username = p2FirstName + " " + p2LastName;
        int p2Age = InputHelper.getRangedInt(scan, "Get Person 2's Age: [1-99]", 1, 60);
        int p2Health = InputHelper.getRangedInt(scan, "Enter Person 3's HP:",0,100);
        int p2Direction = InputHelper.getRangedInt(scan, "Enter Person 3's Direction:",1,6);
        int p2X = InputHelper.getRangedInt(scan, "Enter Person 2's X Coordinate:",0,100);
        int p2Y = InputHelper.getRangedInt(scan, "Enter Person 2's Y Coordinate:",0,100);
        int p2Z = InputHelper.getRangedInt(scan, "Enter Person 2's Z Coordinate:",0,100);

        //Person 3
        String p3FirstName = InputHelper.getNonZeroLenString(scan, "Enter Person 3's First Name:");
        String p3LastName = InputHelper.getNonZeroLenString(scan, "Enter Person 3's Last Name:");
        String p3Username = p3FirstName + " " + p3LastName;
        int p3Age = InputHelper.getRangedInt(scan, "Get Person 3's Age: [1-99]", 1, 60);
        int p3Health = InputHelper.getRangedInt(scan, "Enter Person 3's HP:",0,100);
        int p3Direction = InputHelper.getRangedInt(scan, "Enter Person 3's Direction:",1,6);
        int p3X = InputHelper.getRangedInt(scan, "Enter Person 3's X Coordinate:",0,100);
        int p3Y = InputHelper.getRangedInt(scan, "Enter Person 3's Y Coordinate:",0,100);
        int p3Z = InputHelper.getRangedInt(scan, "Enter Person 3's Z Coordinate:",0,100);

        //Creating Person Objects
        Person p1 = new Person(p1FirstName,p1LastName, p1Age, p1Health, p1Direction, p1X, p1Y, p1Z);
        Person p2 = new Person(p2FirstName, p2LastName, p2Age, p2Direction, p2X, p2Y, p2Z);
        Person p3 = new Person(p3FirstName, p3LastName, p3Age, p3Health, p3Direction, p3X, p3Y, p3Z);

        //Displaying the info using toString
        System.out.println("Person 1 Info\n" + p1);
        System.out.println("Person 2 Info\n" + p2);
        System.out.println("Person 3 Info\n" + p3);


    }
}
