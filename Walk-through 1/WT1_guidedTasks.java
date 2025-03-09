import java.time.LocalTime;
import java.time.LocalDate;
public class WT1_guidedTasks {
    
    public static void main(String[] args) {
        // guided task #1
        String myName = "Remy Dianne Ventuta";
        System.out.println("GUIDED TASK #1 \nWelcome, " + myName + "!");
        
        // guided task #2
        int length = 10;
        int width = 5;
        int area = length * width;
        System.out.println("\nGUIDED TASK #2 \nLength of the rectangle: " + length + "\nWidth of the rectangle: " + width + "\nArea of the rectangle: " + area);
        
        // guided task #3
        LocalDate todayIs = LocalDate.now();
        LocalTime timeIs = LocalTime.now();
        System.out.println("\nGUIDED TASK #3 \nToday is: " + todayIs + "\nTime is: " + timeIs);
    }
    
}