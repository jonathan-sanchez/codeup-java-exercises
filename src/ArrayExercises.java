import java.util.Arrays;

public class ArrayExercises {
    public static void main(String[] args){

        //#1 Array Basics

        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers)); //Arrays.toString() is needed to run the following code, ask why.

//        Create an array that holds 3 Person objects. Assign a new instance of the Person class to each element. Iterate through the array and print out the name of each person in the array.
        Person[] saiyans = new Person[3];

        saiyans[0] = "Goku";
        saiyans[1] = "Vegeta";
        saiyans[2] = "Gohan";

        System.out.println("Arrays.toString(saiyans) = " + Arrays.toString(saiyans));

        System.out.println();

        for(){

        }

    }
}
