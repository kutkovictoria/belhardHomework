import vehicles.cars.Car;
import vehicles.cars.Engine;
import vehicles.lorries.Lorry;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Engine pertolEngine1_8 = new Engine("petrol", 1.8);
        Engine dieselEngine2_0 = new Engine("diesel", 2.0);

        Car audi = new Car("audi", "black", pertolEngine1_8, 20, "passenger");
        Car bmw = new Car("bmw", "silver", dieselEngine2_0, 30, "passenger");

        audi.printCarInfo();
        bmw.printCarInfo();

        Lorry tanker = new Lorry("MAZ", 40, "cargo", 11, 20, "tanker");
        Lorry dumperTruck = new Lorry("mercedes", 50, "cargo", 15, 30, "dumperTruck");

        tanker.printLorryInfo();
        dumperTruck.printLorryInfo();


        //getUserScore();
        //whileOperatorEndlessCycle();
        //sumOfNumbers();
        //getTvChannel();
        //getInfoAboutMe()
        //getPrimitiveDataTypes()
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
        String[] channels = new String[10];
        channels[0] = "BBC";
        channels[1] = "National Geographic";
        channels[2] = "FOX";
        channels[3] = "HBO";
        channels[4] = "History";
        channels[5] = "NRJ 12";
        channels[6] = "Discovery Channel";
        channels[7] = "CNN";
        channels[8] = "Disney Junior";
        channels[9] = "EuroNews";

        System.out.print("Please enter a channel number: ");
        int userInput = new Scanner(System.in).nextInt();
        if (userInput == 0) {
            System.out.println("TV is turned off");
        } else {
            System.out.printf("channel %d: %s\n", userInput, channels[userInput - 1]);
        }
    }

    public static void getInfoAboutMe() {
        String myFirstName = "Victoria";
        String myLastName = "Kutko";
        String myProfession = "QA manual";

        String infoAboutMe = String.format("My first name is %s\n My last name is %s\n My profession is %s\n",
                myFirstName, myLastName, myProfession);
        System.out.println(infoAboutMe);
    }

    public static void getPrimitiveDataTypes() {
        byte myByte = 127;
        short myShort = 32000;
        int myInt = 1000000000;
        long myLong = 10_000_000_000_000_000L;
        float myFloat = 35.5f;
        double myDouble = 358945622555233.125469874555d;
        boolean myBoolean = true;
        char myChar = 'V'; //86
        System.out.println("myByte is: " + myByte);
        System.out.println("myShort is: " + myShort);
        System.out.println("myInt is: " + myInt);
        System.out.println("myLong is: " + myLong);
        System.out.println("myFloat is: " + myFloat);
        System.out.println("myDouble is: " + myDouble);
        System.out.println("myBoolean is: " + myBoolean);
        System.out.println("myChar is: " + myChar);
    }

    public static void useStringMethodsAndScanner() {
        Scanner scanner = new Scanner(System.in);
        String riflemanCreed = "My rifle is my best friend. It is my life.";
        System.out.println("Please enter any text: ");
        String userInput = scanner.nextLine();
        System.out.println("Your text is: " + "\"" + userInput + "\"");
        System.out.println("Is your text (string) is empty? - " + userInput.isEmpty());
        System.out.println("Your text length is: " + userInput.length());
        System.out.println("The first char in your text is: " + userInput.charAt(0));
        System.out.println("Your text in lower case: " + userInput.toLowerCase());
        System.out.println("Your text in upper case: " + userInput.toUpperCase());
        System.out.println("Is your text the same as \"Rifleman's Creed,\"? - " + userInput.equals(riflemanCreed));
        System.out.println("Is your text the same as \"Rifleman's Creed,\" if the case is ignored? - " + userInput.equalsIgnoreCase(riflemanCreed));
        System.out.println("Does your text start with \"My\"? " + userInput.startsWith("My"));
        System.out.println("Does your text end with \"life\"? " + userInput.endsWith("life"));
        System.out.println("Does your text contains \"friend\"? " + userInput.contains("friend"));
        System.out.println("Replace \"rifle\" by \"dog\": " + userInput.replace("rifle", "dog"));
    }
}
