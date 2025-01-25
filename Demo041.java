import java.util.Scanner;

public class Demo041 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a character: ");
        char inputChar = scanner.next().charAt(0);
        
        // Convert the character to lowercase to simplify the checks
        char lowerChar = Character.toLowerCase(inputChar);
        
        // Check if the character is a letter
        if (Character.isLetter(lowerChar)) {
            // Check if the character is a vowel
            if (lowerChar == 'a' || lowerChar == 'e' || lowerChar == 'i' || 
                lowerChar == 'o' || lowerChar == 'u') {
                System.out.println(inputChar + " is a vowel.");
            } else {
                System.out.println(inputChar + " is a consonant.");
            }
        } else {
            System.out.println("The character is not a letter.");
        }
        
        scanner.close();
    }
}