import java.time.LocalDateTime;
import java.util.Scanner;

public class WT1_selfPractice {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // self-practice #1
        System.out.print("Enter name: ");
        String name = scan.nextLine();
        System.out.print("Enter age: ");
        int age = scan.nextInt();
        System.out.println("Name: " + name + "\nAge: " + age + "y/o");
        
        // self-practice #2
        LocalDateTime today = LocalDateTime.now();
        System.out.println("DATE: " + today);
    }
    
}