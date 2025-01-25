import java.util.Scanner;

public class Demo043{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter an uppercase character: ");
        char upperChar = scanner.next().charAt(0);
        
        // Check if the character is uppercase
        if (Character.isUpperCase(upperChar)) {
            // Convert to lowercase
            char lowerChar = Character.toLowerCase(upperChar);
            System.out.println("Lowercase character: " + lowerChar);
        } else {
            System.out.println("The character is not an uppercase letter.");
        }
        
        scanner.close();
    }
}