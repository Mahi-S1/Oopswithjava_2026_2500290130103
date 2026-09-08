import java.util.Scanner;

class Student {
    String name;
    int rollNo;
    int age;

    // Static variable
    static String collegeName = "KIET";

    // Constructor
    Student(String name, int rollNo, int age) {
        this.name = name;
        this.rollNo = rollNo;
        this.age = age;
    }

    // Validate age
    boolean validateAge() {
        return age >= 18;
    }

    // Display details
    void display() {
        System.out.println("\nStudent Details:");
        System.out.println("Student Name: " + name);
        System.out.println("College Name: " + collegeName);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Age: " + age);
    }
}

public class StudentValidation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter roll no: ");
        int rollNo = sc.nextInt();

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        Student s = new Student(name, rollNo, age);

        if (s.validateAge()) {
            s.display();
            System.out.println("Age is valid.");
        } else {
            System.out.println("Invalid age. Student must be 18 or above.");
        }
        sc.close();
    }
}
