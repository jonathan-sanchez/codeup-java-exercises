public class MethodsExercises {
    public static void main(String[] args){
        System.out.println("Welcome to Method Exercises!");

        //Call methods here
        addition(5,5);
        subtraction(10,5);
        multiplication(10,10);
        division(100,5);
        modulus(15,6);
    }

    //Basic Arithmetic
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

}
