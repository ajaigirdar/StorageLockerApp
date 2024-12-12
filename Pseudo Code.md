// TODO import java utilities - Scanner, Random

public class StorageLockerApp {
//    TODO define variables and array
//    TODO establish variable to 10 lockers
int lockerInventory = 10;
//    TODO setup Scanner

    public static void main(String[] args) {

        /*
        1. Display the main menu.
            a. Rent
            b. Access
            c. Release
            d. to exit

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
    // printReceipt
    // getLockerNumber
    // isLockerNumberValid
    // getLockerNumber
    // openLocker
    // releaseLocker


    public static void displayMainMenu() {
        // display options
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