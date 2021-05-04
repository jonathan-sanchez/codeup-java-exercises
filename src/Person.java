public class Person {
    private String name; //This is a variable property

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
        System.out.println("Last name is " + name);
    }

    public void sayHello() {
        System.out.println("Hello, " + name + ".");
    }

    public Person(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Person name = new Person("Jonathan");
        System.out.println(name.getName());
        name.setName("Sanchez");
        name.sayHello();
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
