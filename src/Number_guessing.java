import java.util.Scanner;
public class Number_guessing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       // Declaration of number to be guessed
        int number = 1000;
        // Number of attempts counter
        int count = 1;


        for (int i = 1; i <= 100; i++) {
            System.out.println("Enter a number: ");
            int num1 = input.nextInt();
            if(num1 == number){
                System.out.println("You got it! in "+ count + " try");
                break;
            }
            else if (num1> number){
                System.out.println("Go low");
            }
            else {
                System.out.println("Go high");
            }
            count++;
        }

    }
}
