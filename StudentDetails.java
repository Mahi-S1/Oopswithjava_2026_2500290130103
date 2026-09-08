import java.util.Scanner;

class Student {
    int rollNo;
    String name;
    int age;

    // Default constructor
    Student() {
        rollNo = 0;
        name = "Unknown";
        age = 0;
    }

    // Parameterized constructor
    Student(int rollNo, String name, int age) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
    }

    // Overloaded constructor
    Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = 18;
    }

    void display() {
        System.out.println("\nStudent Details:");
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class StudentDetails {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Roll No: ");
        int rollNo = sc.nextInt();

        sc.nextLine(); // consume leftover newline

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        // Using parameterized constructor
        Student s = new Student(rollNo, name, age);

        s.display();

        sc.close();
    }
}