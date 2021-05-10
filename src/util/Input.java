package util;

import java.util.Scanner;

public class Input{
    private Scanner scanner;

    public Input() {
        scanner = new Scanner(System.in);
    }

    public String getString() {
        String input = scanner.nextLine();
        if (!input.equals("")){
            return input;
        }
        else {
            System.out.println("Please enter a string");
            return getString();
        }
    }

    public boolean yesNo() {
        System.out.println("Please enter yes or no");
        String input = scanner.nextLine();

        return input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes");
    }

    public int getInt() {
        System.out.println("Enter an integer number.");
        if (scanner.hasNextInt()){
            int input  = scanner.nextInt();
            scanner.nextLine();
            return input;
        }
        else {
            String input  = scanner.next();
            scanner.nextLine();
            System.out.println("The input " + input +  " is not an integer.");
            return getInt();
        }
    }


    public double getDouble() {
        System.out.println("Enter a decimal number.");
        if (scanner.hasNextDouble()){
            double input  = scanner.nextDouble();
            scanner.nextLine();
            return input;
        }
        else {
            String input  = scanner.next();
            scanner.nextLine();
            System.out.println("The input " + input +  " is not a decimal.");
            return getDouble();
        }
    }
}
