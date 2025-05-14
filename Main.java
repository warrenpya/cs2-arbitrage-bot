public class Main {

    // Basic variables
    private String name;
    private int age;

    // Constructor
    public Main(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Basic method
    public void greet() {
        System.out.println("Hello, my name is " + name + " and I'm " + age + " years old.");
    }

    // toString() method
    @Override
    public String toString() {
        return "Main{name='" + name + "', age=" + age + "}";
    }

    // Main function
    public static void main(String[] args) {
        Main person = new Main("Alice", 25);
        person.greet();
        System.out.println(person);
    }
}