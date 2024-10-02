import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //getUserScore();
        //whileOperatorEndlessCycle();
        //sumOfNumbers();
        getTvChannel();
    }

    public static void getUserScore() {
        System.out.print("Please enter your score: ");
        Scanner scanner = new Scanner(System.in);
        int userScore = scanner.nextInt();

        while (userScore < 0 || userScore > 100) {
            System.out.print("Your input is invalid! Please enter only numbers from 0 to 100: ");
            userScore = scanner.nextInt();
        }
        if (userScore >= 70) {
            System.out.println("You get an A!");
        } else if (userScore >= 50) {
            System.out.println("You get a B!");
        } else if (userScore >= 30) {
            System.out.println("You get a C!");
        } else {
            System.out.println("You get a D!");
        }
    }

    public static void whileOperatorEndlessCycle() {
        String userInput = "";
        Scanner scanner = new Scanner(System.in);

        while (!userInput.equalsIgnoreCase("Exit")) {
            System.out.print("Please enter something: ");
            userInput = scanner.next();
        }
        System.out.println("Thanks, bye!");
    }

    public static void sumOfNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number: ");

        int userInput = scanner.nextInt();
        int sum = 0;

        if (userInput >= 0) {
            for (int i = 0; i <= userInput; i++) {
                sum += i;
            }
            System.out.printf("Sum of numbers from 0 to %d is %d", userInput, sum);
        } else {
            for (int i = 0; i >= userInput; i--) {
                sum += i;
            }
            System.out.printf("Sum of numbers from 0 to %d is %d", userInput, sum);
        }
    }

    public static void getTvChannel() {
        String[] channels = new String[11];
        channels[0] = "";
        channels[1] = "BBC";
        channels[2] = "National Geographic";
        channels[3] = "FOX";
        channels[4] = "HBO";
        channels[5] = "History";
        channels[6] = "NRJ 12";
        channels[7] = "Discovery Channel";
        channels[8] = "CNN";
        channels[9] = "Disney Junior";
        channels[10] = "EuroNews";

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a channel number: ");
        int userInput = scanner.nextInt();

        if (userInput == 0) {
            System.out.println("TV is turned off");
        } else {
            for (int i = 0; i < channels.length; i++) {
                if (userInput == i) {
                    System.out.printf("channel %d: %s\n", i, channels[i]);
                }
            }
        }
    }
}
