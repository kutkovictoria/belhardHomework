import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //info about me:
        String myFirstName = "Victoria";
        String myLastName = "Kutko";
        String myProfession = "QA manual";

        String infoAboutMe = String.format("My first name is %s\n My last name is %s\n My profession is %s\n",
                myFirstName, myLastName, myProfession);
        System.out.println(infoAboutMe);

        //Primitive Data Types:
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

        // Scanner + String methods:
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
