public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
//        System.out.print("My name is Jonathan!");

        int myFavoriteNumber = 7;
        System.out.println(myFavoriteNumber);

        String myString = "Hey Jonathan, Welcome to Java!";
        System.out.println(myString);

        //Long myNumber;

        //Explicit Casting:

        float myNumber = (float)3.14; //One way to fix floating a double
        /*
        another way to fix floating a double
        float myNumber = 3.14F;
         */

        System.out.println(myNumber);
        /*
        * int x = 5;
        * System.out.println(x++); //post-incrementing 5
        * System.out.println(x);  //value of x after post increment = 6
        */
        //int x = 5;
        //System.out.println(++x); //pre-incrementing 5 to 6
        //System.out.println(x);  //value of x is 6

        //int class = "You dont work here class!";
        //not a statement, reserved words/ or keywords cannot be used as an identifier

        //#12: type Object: can assign any value to variable in type object

//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;

        //int three = (int) "three"; //String cannot be converted to int

        //13:
//        int x = 4;
//        x += 5;
//        System.out.println("x = " + x);

//        int x = 3;
//        int y = 4;
//        y += x;
//        System.out.println("y = " + y);

        int x = 10;
        int y = 2;
        x /= y;
        y -= x;
        System.out.println("y = " + y);

        int z = Integer.MAX_VALUE;
        z += 1;
        System.out.println("z = " + z);
    }
}
