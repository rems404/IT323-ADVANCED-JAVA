import java.util.Scanner;
import java.util.Random;

public class WT2_selfPractice {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // self practice #1
        Random random = new Random();
        int randomNumber = random.nextInt(100);
        System.out.print("SELF PRACTICE #1 \nGuess a number from 1-100: ");
        int guess = scan.nextInt();
            
        if (guess == randomNumber){
            System.out.println("YOU GUESSED IT!");
        } else {
            System.out.println("COLD! The number is " + randomNumber + "!");
        }
            
        // self practice #2
        String input;
        scan.nextLine();
        do {
            System.out.print("\nSELF PRACTICE #2 \nEnter something (exit for exit): ");
            input = scan.nextLine();
        } while (!input.equals("exit")); 
        System.out.println("Successfully out of the loop!");
        
        scan.close();
    }
    
}
