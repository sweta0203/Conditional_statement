import java.util.Scanner;

public class Pin_checker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Initial Pin
        System.out.print("Set your PIN: ");
        int pin = input.nextInt();

        System.out.println("Your PIN is saved.");

        // Pin stored for verification
        int temp = pin;
        // Attempt counter
        int attempt = 0;
        // Attempt remaining;
        int rem_attempt = 0;

        while (attempt < 3) {
            System.out.print("Enter your PIN: ");
            int entered_Pin = input.nextInt();

            if (entered_Pin == temp) {
                System.out.println("Unlocked");
                break;
            }
            else {
                attempt++;
                if (attempt < 3) {
                    rem_attempt= 3 - attempt;
                    System.out.println("Incorrect PIN, remaining attempts: " + rem_attempt );
                }
            }
        }

        if (attempt == 3) {
            System.out.println("Try again after 1 minute");
        }

    }
}
