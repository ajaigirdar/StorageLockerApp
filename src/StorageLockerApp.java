// TODO import java utilities - Scanner, Random

import javax.xml.transform.Source;
import java.util.Random;
import java.util.Scanner;

public class StorageLockerApp {
//    TODO define variables and array
    static String[] lockerID = {"1", "2", "3"};
    static String[] lockerPin = {"1111", "2222", "3333"};
    public static boolean[] lockerAvailable = {true, false, true};
//    TODO establish variable to 10 lockers
    static int totalAvailableLockers = 10;
//    TODO setup Scanner

    public static void main(String[] args) {

        while(true) {
            displayMainMenu();
            int menuChoice = getChoices();
            if (menuChoice == 1) {
                rentLocker();
            }
            if (menuChoice == 2) {
                accessLocker();
            }
            if (menuChoice == 3) {
                releaseLocker();
            }else
                break;
        }
//        getAvailableLocker();
//        getAvailableLocker();
//        getAvailableLocker();






        /*
        2. user rents a locker.
            - find first available locker

            - assign a random pin (from 0 to 9999)
            - print a thank you with locker number and pin
            - display main menu

        3. user Accesses a locker
            - enter the locker number
            - if the locker is rented ask for pin. if not then ask for locker number again.
            - enter the locker pin
            - if pin is correct, open the locker and print success message. if not ask for pin again.
            - display the main menu.

        4. user releases a locker
            - access the locker
            - confirm user is sure
            - if they're sure, release the locker. if not display the main menu.

        5. user exits
            - exit application

         */
    }

    // methods

    public static int getAvailableLocker() {
        int firstAvailableLocker = -1;
        for (int i = 0; i < lockerAvailable.length; i++){
            if (lockerAvailable[i]) {
                return i;
            }
        }
        return firstAvailableLocker;
    }
    // generatePin

    public static int generatePin() {
        Random random = new Random();
        int lockerPinTest = 0000 + random.nextInt(9999);
        return lockerPinTest;
    }
    // printReceipt

    // getLockerPin
    public static String getLockerPin(){
        Scanner console = new Scanner(System.in);
        System.out.print("Enter locker PIN: ");
        return console.nextLine();
    }
    // isLockerNumberValid
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
    // getLockerNumber
//    public static String getLockerNumber(String prompt){
//        String lockerNumberInput;
//        Scanner console = new Scanner(System.in);
//        System.out.print("Enter locker number: ");
//        lockerNumberInput = prompt;
//        return lockerNumberInput;
//    }

    public static String getLockerNumber(){
        Scanner console = new Scanner(System.in);
        System.out.print("Enter locker number: ");
        return console.nextLine();
    }
    // openLocker
    // releaseLocker


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
        /*
        - what would you like to do next?
        - if locker is available, print -
            1. rent a locker
            2. access a locker
            3. release a locker
            ---
            4. any other key to exit
         */
    }

    public static int getChoices(){
        Scanner console = new Scanner(System.in);
        System.out.print("Enter: ");
        return Integer.parseInt(console.nextLine());
    }


    public static void rentLocker() {
        int firstAvailableLocker = getAvailableLocker();
        System.out.println("Success!");
        System.out.println("Locker ID: " + lockerID[firstAvailableLocker]);
        System.out.println("Your PIN: " + lockerPin[firstAvailableLocker]);
        System.out.println("Thank you.");
        lockerAvailable[firstAvailableLocker] = false;
    }

    public static void accessLocker() {
        for (int i = 0; i < lockerID.length; i++){
            if (getLockerNumber().equals(lockerID[i]) && getLockerPin().equals(lockerPin[i])) {
                System.out.println("Success!");
                System.out.println("Locker " + lockerID[i] + " is open.");
                break;
            }else {
                System.out.println("Invalid locker number or PIN");
            }
        }
    }

    public static String releaseLocker() {
        return null;
    }
}