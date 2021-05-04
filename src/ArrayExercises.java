
import java.util.Arrays;

public class ArrayExercises {
    public static void main(String[] args){

        //#1 Array Basics

        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers)); //Arrays.toString() is needed to run the following code, ask why.

//        Create an array that holds 3 Person objects. Assign a new instance of the Person class to each element. Iterate through the array and print out the name of each person in the array.

        Person[] saiyans = new Person[3];

        saiyans[0] = new Person("Goku");
        saiyans[1] = new Person("Vegeta");
        saiyans[2] = new Person("Gohan");

        for (int i = 0; i < saiyans.length; i ++){
            System.out.println(saiyans[i].getName());
        }

        Person Trunks = new Person("Trunks");

    }
}
