// TODO import java utilities - Scanner, Random

import java.util.Random;

public class StorageLockerApp {
//    TODO define variables and array
    static String[] lockerID = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
    public String[] lockerPin = {"1111", "2222", "3333", "44444", "5555", "6666", "7777", "8888", "9999", "1010"};
    public static boolean[] lockerAvailable = {true, true, true, true, true, true, true, true, true, true};
//    TODO establish variable to 10 lockers
    static int totalAvailableLockers = 10;
//    TODO setup Scanner

    public static void main(String[] args) {

        displayMainMenu();

//        while(lockerAvailable.equals("false")){
//            for (int i = 0; i <totalAvailableLockers; i++){
//                if (totalAvailableLockers > 0){
//                    totalAvailableLockers--;
//
//                    System.out.println("Success!");
//                    System.out.println("Your locker number: ");
//                    System.out.println("Your PIN: " + );
//                    break;
//                }
//            }
//        }
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
    // getAvailableLocker
    // generatePin

    public static int generatePin() {
        Random random = new Random();
        int lockerPin = 0 + random.nextInt(9999);
        return lockerPin;
    }
    // printReceipt
    // getLockerNumber
    // isLockerNumberValid
    // getLockerNumber
    // openLocker
    // releaseLocker


    public static void displayMainMenu() {
        System.out.println("What would you like to do next?");
        if (totalAvailableLockers > 0) {
            System.out.println(
                    "              1. Rent a Locker\n" +
                    "              2. Access a Locker\n" +
                    "              3. Release a Locker\n" +
                    "              ---\n" +
                    "              Any other key to exit.");
        }
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

    public static String getChoices(){
        return null;
    }

    public static String rentLocker() {
        return null;
    }

    public static String accessLocker() {
        return null;
    }

    public static String releaseLocker() {
        return null;
    }
}