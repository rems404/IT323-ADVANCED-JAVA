import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class WT1_selfPractice {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // self practice #1
        System.out.print("SELF PRACTICE #1 \nEnter name: ");
        String name = scan.nextLine();
        System.out.print("Enter age: ");
        int age = scan.nextInt();
        System.out.println("Welcome, " + name + "(" + age + ")!");
        
        // self practice #2
        LocalDateTime today = LocalDateTime.now();
        DateTimeFormatter formatDate = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDate = today.format(formatDate);
            System.out.println("\nSELF PRACTICE #2 \nDate and time: " + formattedDate);
    }
    
}