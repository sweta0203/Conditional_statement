import java.util.Scanner;

public class Car_game {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String username;

        System.out.println("Enter your user name:");
        username = input.nextLine();
        System.out.println("Welcome " + username + " to the car game!");
        System.out.println("Hint for the game: Enter 'start' to start the car, 'stop' to stop the car, and 'quit' to quit the game.");

        boolean game_run = true;

        while (game_run) {
            System.out.print("Enter the command: ");
            String command = input.nextLine();
            switch (command) {
                case "start":
                    System.out.println("1");
                    System.out.println("2");
                    System.out.println("3");
                    System.out.println("Go");
                    break;

                case "stop":
                    System.out.println("Paused! (for resuming type '1', for quitting type '2', for restarting type '3')");
                    // Reading the users command
                    int action = input.nextInt();
                    input.nextLine();
                    switch (action) {
                        case 1:
                            System.out.println("Resumed");
                            break;
                        case 2:
                            System.out.println("Quitting the game.");
                            game_run = false;
                            break;
                        case 3:
                            System.out.println("Restarting the car.");
                            break;
                        default:
                            System.out.println("Invalid command.");
                            break;
                    }
                    break;

                case "quit":
                    System.out.println("Quitting the game.");
                    game_run = false;
                    break;

                default:
                    System.out.println("Invalid command. Please enter 'start', 'stop', or 'quit'.");
                    break;
            }}

    }
}
