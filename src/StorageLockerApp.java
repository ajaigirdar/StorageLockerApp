import java.util.Random;
import java.util.Scanner;

public class StorageLockerApp {
    static String[] lockerID = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
    static String[] lockerPin = {"1111", "2222", "3333", "4444", "5555", "6666", "7777", "8888", "9999", "1010"};
    public static boolean[] lockerAvailable = {true, true, true};
    static int totalAvailableLockers = 10;

    public static void main(String[] args) {
        boolean keepRunning = true;

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
        String pin;
        Random random = new Random();
        return Integer.toString(random.nextInt(9999));
    }

    public static String getLockerPin(){
        Scanner console = new Scanner(System.in);
        System.out.print("Enter locker PIN: ");
        return console.nextLine();
    }

    public static boolean isLockerNumberValid(String prompt) {
        boolean isValid = false;
        for (int i = 0; i < lockerID.length; i++){
            if (lockerID[i].equals(prompt)) {
                isValid = true;
                break;
            }
        }
        return isValid;
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
    int firstAvailableLocker;
    if (getAvailableLocker() != -1) {
        firstAvailableLocker = getAvailableLocker();
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
            }
        }
    }
}