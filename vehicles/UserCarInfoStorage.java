package vehicles;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class UserCarInfoStorage {

    public static void startCarInfoStorage() {
        manageUserInput();
    }

    public static void displayMenu() {
        System.out.print("Menu:" +
                "\n1 - enter your car data;" +
                "\n2 - display info about your car;" +
                "\n0 - exit." +
                "\nPlease select an option: ");
    }

    public static void manageUserInput() {
       String userInput;
       Scanner scanner = new Scanner(System.in);

        do {
            displayMenu();
            userInput = scanner.nextLine();
            switch (userInput) {
                case "1" -> enterCarInfo(scanner);
                case "2" -> {
                    getCarInfo();
                    break;
                }
                case "0" -> System.out.println("Program has been closed. Bye!");
                default -> System.out.print("Sorry, invalid input! Please try again.\n");
            }
        } while (!userInput.equals("0"));
    }

    public static void enterCarInfo(Scanner scanner) {
        System.out.print("Enter car brand: ");
        String brand = scanner.nextLine();
        System.out.print("Enter engine type: ");
        String engineType = scanner.nextLine();
        System.out.print("Enter car price in USD: ");
        String priceInUsd = scanner.nextLine();
        System.out.print("Enter car color: ");
        String color = scanner.nextLine();
        FileWriter file;
        try {
            file = new FileWriter("D:\\belhard\\user_car_info.txt");
            file.write("Car brand: " + brand);
            file.write("\nEngine type: " + engineType);
            file.write("\nCar price in USD: " + priceInUsd);
            file.write("\nCar color: " + color);
            file.close();
            System.out.println("The data has been saved.\nPlease make another choice.");
        } catch (IOException e) {
            System.out.println("Sorry, cannot write to file. Error message: " + e.getMessage());
        }
    }

    public static void getCarInfo() {
        try {
            File file = new File("D:\\belhard\\user_car_info.txt");
            Scanner fileScanner = new Scanner(file);
            ArrayList<String> dataFromFile = new ArrayList<>();
            while (fileScanner.hasNext()) {
                dataFromFile.add(fileScanner.nextLine());
            }
            dataFromFile.forEach(System.out::println);
        } catch (FileNotFoundException e) {
            System.out.println("Sorry, you haven't entered your data yet.\nPlease select option 1 first.");
        }
    }
}
