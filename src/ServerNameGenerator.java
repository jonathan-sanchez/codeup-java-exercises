public class ServerNameGenerator {
    public static void main(String[] args){
        String[] nouns = {"car","house","motorcycle","skateboard","dog","cat","bird","computer","ship","monkey"};
        String[] adjectives ={"aggressive","agreeable","ambitious","brave","calm","delightful","eager","perfect","sharp","huge"};

        System.out.println(randomElement(nouns));
        System.out.println(randomElement(adjectives));
        System.out.println("Here is your server name: ");
        System.out.println(randomElement(adjectives) + "-" + randomElement(nouns));
    }

    public static String randomElement(String[] word){
        return word[(int)Math.floor((Math.random()*word.length - 1))];
    }
}
