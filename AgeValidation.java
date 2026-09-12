import java.util.Scanner;
public class AgeValidation{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        try {
            checkAge(age);
        } catch (AgeInvalidException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    static void checkAge(int age) throws AgeInvalidException {
        if(age < 18){
            throw new AgeInvalidException("Age must be 18 or older.");
        }
        System.out.println("Age is valid.");
    }
}
class AgeInvalidException extends Exception{
    AgeInvalidException(String message){
        super(message);
    }
}