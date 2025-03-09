import java.util.Scanner;

public class WT2_guidedTasks {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // guided task #1
        System.out.print("GUIDED TASK #1 \nEnter a number: ");
        int num = scan.nextInt();
        
        if (num%2 == 0) {
            System.out.println(num + " => EVEN");
        } else {
            System.out.println(num + " => ODD");
        }
        
        // guided task #2
        System.out.print("\nGUIDED TASK #2 \nEnter a number (1-7): ");
        int numTwo = scan.nextInt();
        String day;
        switch (numTwo) {
            case 1:
                day = "Monday";
                break;
            case 2:
                day = "Tuesday";
                break;
            case 3:
                day = "Wednesday";
                break;
            case 4:
                day = "Thursday";
                break;
            case 5:
                day = "Friday";
                break;
            case 6:
                day = "Saturday";
                break;
            case 7:
                day = "Sunday";
                break;
            default:
                day = "INVALID";
                break;
        }
        System.out.println("Number " + numTwo + " is for " + day + ".");
        
        // guided task #3
        System.out.println("\nGUIDED TASK #3 \nPrint numbers from 10 to 1");
        int starting = 10;
        while (starting >= 1) {
            System.out.println(starting);
            starting--;
        }
        
        scan.close();
    }
    
}