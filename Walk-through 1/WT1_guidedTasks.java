import java.time.LocalTime;
import java.time.LocalDate;
import java.util.Scanner;

public class WT1_guidedTasks {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // guided task #1
        String myName = "Remy Dianne Ventura";
        System.out.println("GUIDED TASK #1 \nWelcome, " + myName + "!");
        
        // guided task #2
        System.out.print("\nGUIDED TASK #2 (area of a rectangle) \nEnter length: ");
        double length = scan.nextDouble();
        System.out.print("Enter width: ");
        double width = scan.nextDouble();
        double area = length * width;
        System.out.println("Area: " + area);
        
        // guided task #3
        LocalDate todayIs = LocalDate.now();
        LocalTime timeIs = LocalTime.now();
        System.out.println("\nGUIDED TASK #3 \nDate: " + todayIs + "\nTime: " + timeIs);
    }
    
}
