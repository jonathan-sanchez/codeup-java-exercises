import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        System.out.println("Hello! I am Bob!\n");
        System.out.println("Bob likes Java!\n");

        grumpyOlBob();
    }

    public static boolean grumpyOlBob() {
        boolean moreBob = true;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ask bob a question!");
        String userInput = sc.nextLine();

        if (userInput.endsWith("?")) {
            System.out.println("Sure");
        } else if (userInput.endsWith("!")) {
            System.out.println("Whoa, chill out!");
        } else if (userInput == "") {
            System.out.println("Fine, be that way!");
        } else {
            System.out.println("Eh, whatever man.");
        }

        System.out.println("Anything else you wanna say to Bob?");

        String stillTalking = sc.nextLine();

       for (int i = 0; i < stillTalking.length(); i++) {
           if (userInput.equalsIgnoreCase("yes")) {
               return true;
           }
        }
        return grumpyOlBob();
    }
}

//For reference

//    public static void main(String[] args){
//        talkToBob();
//    }
//
//
//    public static void talkToBob(){
//        boolean keepTalking; // < < < < < < bool for the loop
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Arriving without much aplomb, Bob steps into the room to talk to you with his head down.");
//        System.out.println("Keeping his head down, Bob steps past you and slinks down into a sitting position nearby.");
//        System.out.println("He takes an airpod out of his ear that you had missed and looks up at you boredly.");
//
//        do {
//            System.out.println("What would you like to say to Bob?");
//            String userInput = scanner.nextLine();
//
//            if (userInput.endsWith("?")) {
//                //make bob say "sure"
//                System.out.println("Bob looks at his feet, to the wall, and then finally to your eyes.\n'Sure,' he says.");
//            } else if (userInput.endsWith("!")) {
//                System.out.println("His eyes pop open in shock from what you said.\nHe raises his arms up saying 'Whoa! Chill out!'");
//            } else if (userInput.length() == 0) {
//                System.out.println("Bob rolls his eyes.\n'Fine. Be that way,' he says and crosses his arms.");
//            } else {
//                System.out.println("Without adjusting himself, Bob mutters 'whatever'.");
//            }
//
//            System.out.println("Would you like to talk to Bob some more? [yes/no]");
//            String userContinue = scanner.nextLine();
//
//            if(userContinue.equalsIgnoreCase("yes")){
//                keepTalking = true;
//            } else {
//                keepTalking = false;
//            }
//
//
//        } while (keepTalking);
