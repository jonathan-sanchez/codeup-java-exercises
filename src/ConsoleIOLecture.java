import java.util.Scanner;

public class ConsoleIOLecture {
    public static void main(String[] args){
        System.out.println("Console IO Lecture");

        // ================================== print() and println()

        // this:
//        System.out.println("here");
//        System.out.println("there");

        // is equivalent to this:
//        System.out.print("here\n");
//        System.out.print("there\n");

        // without the newline characters, print outputs this:
//        System.out.print("here");
//        System.out.print("there");

        // to concatenate just like JS:
        String firstName = "Jonathan";
        String lastName = "Sanchez";
//        System.out.println(firstName + " " + lastName);

        // ================================== printf() / .format()

        // Print a formatted string using the following... printf(formatString)

        // same output as print():
//        System.out.printf("Hello");
//        System.out.printf("There");

        // multiple variables:
        System.out.printf("Hello, %s!\n", firstName);
        System.out.printf("Hello, %s %s!\n", firstName, lastName);

        // numbers
        int numberOfPets = 4;
        String typeOfPets = "cats";
        System.out.printf("I have %d %s.\n", numberOfPets, typeOfPets);

        // currency:
        float currencyPennies = 1000.001F;
        System.out.printf("My iPhone costs $%.2f\n", currencyPennies);

        // =================================== USER INPUT
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your first name?");
        String userFirstName = sc.next();

        System.out.printf("Nice to meet you, %s\n", userFirstName);

        System.out.println("How old are you?");
        int age = sc.nextInt();

        System.out.printf("Good to hear you are %d years old.\n", age);

        sc.nextLine();

        System.out.println("Favorite Quote:");
        String favoriteQuote = sc.nextLine();
        System.out.printf("Funny, \"%s\" is my favorite quote too.", favoriteQuote);
    }
}
