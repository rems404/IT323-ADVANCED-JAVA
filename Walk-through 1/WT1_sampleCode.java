import java.time.LocalDate;

public class WT1_sampleCode {
    public static void main(String[] args) {
        // variable declaration
        int age = 21;
        String myName = "Remy";
        double weight = 42.5;
        char mInitial = 'I';
        boolean isCollege = true;
        System.out.println("NAME: " + myName + "\nM.INITIAL: " + mInitial + "\nAGE:" + age + "\nWEIGHT: " + weight + "\nIS COLLEGE: " + isCollege);
        
        // string manipulation
        String college = "CICS";
        System.out.println("\nTEXT: " + college + "\nLENGTH: " + college.length());
        
        // Date
        LocalDate today = LocalDate.now();
        System.out.println("\nDATE TODAY: " + today);
    }
}