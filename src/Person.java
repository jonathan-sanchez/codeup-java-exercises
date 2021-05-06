public class Person {
    private String name; //This is a variable property

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
        System.out.println("Your new name is " + name);
    }

    public void sayHello() {
        System.out.println("Hello, " + name + ".");
    }

    public Person(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        //Understanding References:
//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName())); // True
//        System.out.println(person1 == person2); // False
//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);  // True
        Person person1 = new Person("John");
        Person person2 = person1;
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        person2.setName("Jane");
        System.out.println(person1.getName());
        System.out.println(person2.getName());
    }



//    public String getName(){
//        return this.name;
//    }
//
//    public void setName(String name){
//
//    }
//
//    public void sayHello(){
//
//    }
}
