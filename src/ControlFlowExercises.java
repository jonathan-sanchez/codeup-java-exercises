public class ControlFlowExercises {
    public static void main(String[] args) {

        //#1 Loop Basics

        //a. While
//        int i = 5;
//        while(i <= 15) {
//            System.out.println("i is currently at: " + i);
//            i++;
//        }

        //b. Do-While
        //count to 100 by 2
//        int i = 0;
//        do {
//            System.out.println(i);
//            i += 2;
//        } while (i <= 100);

        //count backwards by 5's from 100 to -10
//        int i = 100;
//        do {
//            System.out.println(i);
//            i -= 5;
//        } while (i >= -10);

        // Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000. Output should equal:
        //
        // 2
        // 4
        // 16
        // 256
        // 65536

//        long i = 2;
//        do {
//            System.out.println(i);
//            i *= i;
//        } while (i <= 1000000);

        //Refactor using a for loop
        //Count to 100 by two's
//        for (int i = 0; i <= 100; i++) {
//            if (i % 2 == 0) {
//                System.out.println(i);
//            }
//        }

        //#2 FizzBuzz
        //#1 for loop from 1 to 100
        int oneHunnit = 100;
        for (int i = 1; i <= oneHunnit; i++) {
            //multiples of three and five print "FizzBuzz"
            if (i % (3*5) == 0) System.out.println("FizzBuzz");
            //multiples of three print "Fizz"
            else if(i % 3 == 0) System.out.println("Fizz");
            //multiples of 5 print "Buzz"
            else if (i % 5 == 0) System.out.println("Buzz");
            else System.out.println(i);
        } //Working great!

        //#3
        //Display table of powers


        //#4
        //Convert given number grades into letter grades
        do{

        if (userInput >= 88 && userInput <= 100)
            System.out.print("Hey! you got an: A");
        else if (userInput >= 80 && userInput <= 87)
            System.out.print("Hey! you got an: B");
        else if (userInput >= 67 && userInput <= 79)
            System.out.print("You got an: C");
        else if (userInput >= 60 && userInput <= 66)
            System.out.print("Sorry, You got an: D");
        else if (userInput >= 0 && userInput <= 59)
            System.out.print("Sorry, You got an: F");
    } else {
        System.out.println("Invalid grade entered.");
    }
    }
}
