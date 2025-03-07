import java.time.LocalDate;
import java.time.LocalTime;

public class WT1_guidedTasks {
    
    public static void main(String[] args) {
        gtOne();
        gtTwo();
        gtThree();
    }
    
    // guided task #1
    public static void gtOne() {
        String myName = "Remy Dianne Ventura";
        System.out.println("My name is " + myName + ".");
    }
    
    // guided task #2
    public static void gtTwo() {
        int width = 10;
        int length = 40;
        int area = width * length;
        
        System.out.println("\nWidth: " + width + "\nLength: " + length + "\nArea of the rectangle: " + area);
    }
    
    // guided task #3
    public static void gtThree() {
        LocalDate dateToday = LocalDate.now();
        LocalTime curTime = LocalTime.now();
        System.out.println("\nDate: " + dateToday + "\nTime: " + curTime);
    }
    
}