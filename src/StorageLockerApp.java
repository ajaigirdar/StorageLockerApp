import java.util.Random;
import java.util.Scanner;

public class StorageLockerApp {
    static String[] lockerID = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
    static String[] lockerPin = new String[10];
    public static boolean[] lockerAvailable = {true, true, true, true, true, true, true, true, true, true};

    public static void main(String[] args) {
        boolean keepRunning = true;
        initializeLocker();

        while(keepRunning) {
            displayMainMenu();
            int menuChoice = getChoices();

            switch (menuChoice) {
                case 1:
                    rentLocker();
                    break;
                case 2:
                    accessLocker();
                    break;
                case 3:
                    releaseLocker();
                    break;
                default:
                    System.out.println("Exiting the application. See you soon!");
                    keepRunning = false;
                    break;
            }
        }
    }

    public static void initializeLocker() {
        for (int i = 0; i < lockerID.length; i++){
            lockerPin[i] = generatePin();
        }
    }

    public static int getAvailableLocker() {
        int firstAvailableLocker = -1;
        for (int i = 0; i < lockerAvailable.length; i++){
            if (lockerAvailable[i]) {
                return i;
            }
        }
        return firstAvailableLocker;
    }

    public static String generatePin() {
        Random random = new Random();
        return String.format("%04d", random.nextInt(10000));
    }

    public static String getLockerPin(){
        Scanner console = new Scanner(System.in);
        System.out.print("Enter locker PIN: ");
        return console.nextLine();
    }

    public static String getLockerNumber(){
        Scanner console = new Scanner(System.in);
        System.out.print("Enter locker number: ");
        return console.nextLine();
    }

    public static void displayMainMenu() {
        System.out.println("What would you like to do next?");
        if (getAvailableLocker() != -1) {
            System.out.println(
                    "              1. Rent a Locker");
        }
        System.out.println(
                "              2. Access a Locker\n" +
                "              3. Release a Locker\n" +
                "              ---\n" +
                "              Any other key to exit.");
    }

    public static int getChoices(){
        Scanner console = new Scanner(System.in);
        System.out.print("Enter: ");
        return Integer.parseInt(console.nextLine());
    }

public static void rentLocker() {
    int firstAvailableLocker = getAvailableLocker();
    if (firstAvailableLocker != -1) {
        System.out.println("Success!");
        System.out.println("Locker ID: " + lockerID[firstAvailableLocker]);
        System.out.println("Your PIN: " + lockerPin[firstAvailableLocker]);
        System.out.println("Thank you.");
        lockerAvailable[firstAvailableLocker] = false;
    } else {
        System.out.println("Sorry! No lockers available.");
    }
}

    public static void accessLocker() {
        String lockerNumber = getLockerNumber();
        String pin = getLockerPin();
        for (int i = 0; i < lockerID.length; i++){
            if ((lockerID[i].equals(lockerNumber)) && lockerPin[i].equals(pin)) {
                System.out.println("Success!");
                System.out.println("Locker " + lockerID[i] + " is open.");
                break;
            } else {
                System.out.println("Locker number and/or locker PIN don't match");
            }
        }
    }

    public static void releaseLocker() {
        String lockerNumber = getLockerNumber();
        String pin = getLockerPin();
        for (int i = 0; i < lockerID.length; i++){
            if ((lockerID[i].equals(lockerNumber)) && lockerPin[i].equals(pin)) {
                System.out.println("Success!");
                System.out.println("Locker " + lockerID[i] + " is released.");
                lockerAvailable[i] = true;
                break;
            } else {
                System.out.println("Locker number and/or locker PIN don't match");
            }
        }
    }
}