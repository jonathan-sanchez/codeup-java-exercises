public class ControlStmtsLoopsLec {

    public static void main(String[] args){
        //Boolean Expressions
        //An expression that evaluates to a boolean value (5==5 //t, 5 < 6//t, 5 > 6 //f)
        //These relational operators will have similarities to our JavaScript work - however: no truth-y, or false-y (no === vs ==, <== vs <=, etc.)

        System.out.println("(5 == 5) = " + (5 == 5));
        System.out.println("(5 < 6) = " + (5 < 6));
        System.out.println("(5 > 6) = " + (5 > 6));

        System.out.println("('y' == 'Y') = " + ('y' == 'Y'));
        System.out.println("('y' == 'y') = " + ('y' == 'y'));

//        boolean isAdmin = false;
//
//        System.out.println("(isAdmin == false) = " + (isAdmin == false));

        //Logical Operators
        //Combine multiple boolean expressions for evaluation - isAdmin & isLoggedIn, shoppingCart.length > 5 || isDiscountMember,
//        boolean isAdmin = true;
//        boolean isLoggedIn = false;
//        boolean isOwner = false;
//        System.out.println("(isAdmin && isLoggedIn) = " + ". Do I reveal the hidden administrator portal? " + (isAdmin && isLoggedIn));
//        System.out.println("(isOwner || isAdmin) = " + (isOwner || isAdmin) + ". Is this the admin or the user who made the post? Do i show the 'edit button for this post? " + (isOwner || isAdmin));
//
//        System.out.println(("(!isLoggedIn) = " + (!isLoggedIn) + ". Am i not logged in and need to be taken top the log in/ registration page? " + (!isLoggedIn)));

        //An interesting wrinkle: & vs && + | vs ||
        //Notice: Whats up with X between & and &&? One operator still runs the right hand side (RHS) expression no matter what each time, the other will skip that step if the left hand side (LHS) is false.

//        int y = 2;
//        int x = 3;
//
//        if (false && (++x == y)) {
//            System.out.println("x = " + x);
//            System.out.println("Equal!");
//        } else {
//            System.out.println("x = " + x);
//            System.out.println("Unequal.");
//        }

        //String Comparison
        //Strings are not primitives! **danger**, str1 == str2 will not help us here!
        String str1 = "Jonathan";
        String str2 = "Sanchez";
        String str3 = str1;

        System.out.println("(str1 == str2) = " + (str1 == str2));
        System.out.println("(str3 == str1) = " + (str3 == str1));

        System.out.println("str1.equals(str2) = " + str1.equals(str2)); // There you go - use the .equals method!

        String cohortLC = "marco";
        String cohortUC = "Marco";

        System.out.println("cohortLC.equalsIgnoreCase(cohortUC) = " + cohortLC.equalsIgnoreCase(cohortUC)); //Excellent - using the method!

        //Control Structures:
        //Rely on your knowledge of JS -

        //if. .
//        boolean isAdmin = true;
//        boolean isLoggedIn = true;
//        boolean isOwner = false;
//
//        if (isAdmin && isLoggedIn) {
//            System.out.println("Admin portal accessed");
//        }
//
//        if (isOwner || isAdmin) {
//            System.out.println("Show the edit button for this post");
//        }
//
//        if (isLoggedIn) {
//        System.out.println("Welcome to our website!");
//        }

        //if. . else if/else:
//        boolean isAdmin = false;
//        boolean isLoggedIn = false;
//        boolean isOwner = true;
//
//        if (isLoggedIn && isAdmin) {
//            System.out.println("Show the 'admin' button on the page and all recent posts by all users.");
//        } else if (isLoggedIn && isOwner) {
//            System.out.println("Show the 'my account' button with this users most recent posts.");
//        } else if (isLoggedIn) {
//            System.out.println("Show a create post button as well as examples of posts by other users.");
//        } else if (!isLoggedIn) {
//            System.out.println("Show the login/registration page to begin use of the application");
//        }

        //Switch/case statement!
        int diceRoll = (int) (Math.random() * 6 - 1 + 1) + 1;
        System.out.println("diceRoll = " + diceRoll);

        switch(diceRoll) {
            case 1:
                System.out.println("Rolled a one!");
                break;
            case 2:
                System.out.println("Rolled a two!");
                break;
            case 3:
                System.out.println("Rolled a three!");
                break;
            case 4:
                System.out.println("Rolled a four!");
                break;
            case 5:
                System.out.println("Rolled a five!");
                break;
            case 6:
                System.out.println("Rolled a six!");
                break; // Dont forget break so you dont fall through!
        }
            //while
//            int i = 10;
//            while (i <= 10) {
//                System.out.println("i is " + i);
//                i++;
//            }

            // do-while

//            boolean newsLetterSignup = true;
//            Scanner scanner = new Scanner(System.in);
//
//            do {
//                System.out.println("Are you ready to sign up for our newsletter? Note: only 'yes' will work :)\n ");
//                String userInput = scanner.nextLine();
//
//                if (userInput.equalsIgnoreCase("yes")) {
//                    System.out.println("We are so happy to hear you are interested in our newsletter! Thank you for signing up!");
//                    newsLetterSignup = false;
//                } else {
//                    System.out.println("Im sorry that is an unacceptable answer.");
//                    newsLetterSignup = true;
//                }
//        } while (newsLetterSignup);

        //For loop!
//        for (int i = 0; i < 10; i += 1) {
//            System.out.println("i is currently: " + i);
//        }
//
//        String [] fruits = {"apples", "bananas", "jackfruit"};
//
//        for (int i = 0; i < fruits.length; i++) {
//            System.out.println("Here's a fruit: " + fruits[i]);
//        }

        //Break && Continue in our other loops (not just switch case!)
        //Goal: Print only up to 7;

//        for (int i = 1; i < 100; i++) {
//            System.out.println(i);
//            if(i == 5){
//                break;
//            }
//        }

        //Continue:
        //Goal: Skipping odd nums, print even nums!

        for (int i = 1; i <= 10; i++){
            if(i % 2 == 1){
                System.out.println("Odd number - get outta here!");
                continue;
            }
            System.out.println("Here's a nice even number " + i);
        }
    }
}
