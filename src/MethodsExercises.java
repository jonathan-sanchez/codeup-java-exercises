import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args){
        System.out.println("Welcome to Method Exercises!");

        //Call methods here
        addition(5,5);
        subtraction(10,5);
        multiplication(10,10);
        division(100,5);
        modulus(15,6);
        //Bonus
        multiplicationLoop(5,5);
        System.out.println(multiplicationRecursion(10,10));
//        intBetweenOneAndTen(1,10);
    }

    //Section #1 Basic Arithmetic Methods
    //a. create four separate methods, each will perform an arithmetic operation.
    //Addition
    public static void addition(double num1, double num2){
        double result = num1 + num2;
        System.out.println(result);
    }
    //Subtraction
    public static void subtraction(double num1, double num2){
        double result = num1 - num2;
        System.out.println(result);
    }
    //Multiplication
    public static void multiplication(double num1, double num2){
        double result = num1 * num2;
        System.out.println(result);
    }
    //Division
    public static void division(double num1, double num2){
        double result = num1 / num2;
        System.out.println(result);
    }

    //add a modulus method that finds the modulus of two numbers
    public static void modulus(double num1, double num2){
        double result = num1 % num2;
        System.out.println(result);
    }
    //Bonus
    //Create your multiplication method without using the * operator.
    public static void multiplicationLoop(int a, int b) {
        int result = 0;
        for (int i = 0; i < a; i++) {
            result += b;
        }
        System.out.println(result);
    }
    //Recursion
    public static int multiplicationRecursion(int a, int b) {

        if ((a == 0) || (b == 0))
            return 0;
        else
            return (a + multiplicationRecursion(a, b - 1));

    }

    //#2 Create a method that validates that user input is in a certain range
//    public static int intBetweenOneAndTen(int min, int max) {
//        System.out.println("Enter a number between 1 and 10:\n");
//        int userInput = intBetweenOneAndTen(1, 10);
//        if (userInput > min && userInput < max) {
//            System.out.printf("Congrats, your input of %d was within our min and max!", userInput);
//        }
////        for (int i = 1; i < 10; i++) {
////            if (userInput > min && userInput < max) ;
////            System.out.println("Congrats! Your input is in range!");
////        return userInput;
//    }

    //#3
    public static String factorialLoop(){
        Scanner userFactor = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 10:\n");
        int userInput = userFactor.nextInt();
        System.out.println("The number you entered is: " + userInput);
        System.out.println("Would you like to enter another number?");
        int userInput2 = userFactor.nextInt();
        System.out.println("Your second number is: " + userInput2);
        for(){
            
        }
    }
}

