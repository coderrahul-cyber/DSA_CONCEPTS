// BasicJava.java

public class BasicJava {
    public static void main(String[] args) {
        System.out.println("Welcome to Basic Java Program\n");

        // --- Variables and Data Types ---
        int number = 10;
        double decimal = 3.14F;
        double longnum = 234567812121L;
        char letter = 'A';
        boolean flag = true;
        String message = "Hello, Java!";
        
        System.out.println("== Variables and Data Types ==");
        System.out.println("Integer: " + number);
        System.out.println("Double: " + decimal);
        System.out.println("Long: " + longnum);
        System.out.println("Char: " + letter);
        System.out.println("Boolean: " + flag);
        System.out.println("String: " + message + "\n");

        // --- String Operations ---
        System.out.println("== String Operations ==");
        String name="Jhon";
        String surname="Doe";
        System.out.println("Full Name: " + name + " " + surname);
        System.out.println("Length: " + name.length());
        
        // --- Operators ---
        int sum = number + 20;
        int product = number * 2;
        System.out.println("== Operators ==");
        System.out.println("Sum (number + 20): " + sum);
        System.out.println("Product (number * 2): " + product + "\n");
        
        // --- Conditional Statements ---
        System.out.println("== Conditional Statements ==");
        if (number > 5) {
            System.out.println("Number is greater than 5.");
        } else {
            System.out.println("Number is not greater than 5.");
        }
        System.out.println();
        
        // --- Loops ---
        System.out.println("== For Loop ==");
        for (int i = 0; i < 5; i++) {
            System.out.println("i = " + i);
        }
        System.out.println();
        
        System.out.println("== While Loop ==");
        int count = 0;
        while (count < 5) {
            System.out.println("count = " + count);
            count++;
        }
        System.out.println();
        
        // --- Arrays ---
        System.out.println("== Arrays ==");
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.print("Array elements: ");
        for (int n : numbers) {
            System.out.print(n + " ");
        }
        System.out.println("\n");
        
        // --- Exception Handling ---
        System.out.println("== Exception Handling ==");
        try {
            int division = number / 0;
            System.out.println("Division: " + division);
        } catch (ArithmeticException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }
        System.out.println();
        
        // --- Method Call ---
        System.out.println("== Methods ==");
        int result = addNumbers(5, 7);
        System.out.println("Result of addNumbers(5, 7): " + result + "\n");
        
        // --- Object-Oriented Programming ---
        System.out.println("== Object-Oriented Programming ==");
        // Creating an instance of Person
        Person person = new Person("John Doe", 30);
        person.displayInfo();
        
        // Inheritance demonstration: Student extends Person
        Student student = new Student("Alice", 20, "Computer Science");
        student.displayInfo();
        student.study();
        System.out.println();
        
        // --- Interface Demonstration ---
        System.out.println("== Interfaces ==");
        Animal dog = new Dog("Buddy");
        dog.makeSound();
    }
    
    // A simple method that returns the sum of two integers.
    public static int addNumbers(int a, int b) {
        return a + b;
    }
}

// --- OOP: Defining a class to demonstrate basics ---
class Person {
    private String name;
    private int age;
    
    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    // A method to display person's information.
    public void displayInfo() {
        System.out.println("Person Info => Name: " + name + ", Age: " + age);
    }
}

// --- Inheritance: Student extends Person ---
class Student extends Person {
    private String major;
    
    public Student(String name, int age, String major) {
        super(name, age); // Call the superclass (Person) constructor
        this.major = major;
    }
    
    // Override displayInfo to include major information.
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Student Major: " + major);
    }
    
    // Additional method specific to Student.
    public void study() {
        System.out.println("Studying " + major + "...");
    }
}

// --- Interface Example ---
interface Animal {
    // Interface method (no body)
    void makeSound();
}

// Implementing the Animal interface
class Dog implements Animal {
    private String name;
    
    public Dog(String name) {
        this.name = name;
    }
    
    @Override
    public void makeSound() {
        System.out.println(name + " says: Woof Woof!");
    }
}
