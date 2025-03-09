import java.util.Arrays;

public class WT3_guidedTasks {
    
    public static void main(String[] args) {
        int[] grades = {89, 92, 86, 87, 96};
        int sum = 0;
        System.out.println("The grades are: " + Arrays.toString(grades));
        
        // guided task #1
        for (int grade:grades) {
            sum += grade;
        }
        
        int size = grades.length;
        int average = sum/size;
        System.out.println("\nGUIDED TASK #1 \nAverage: " + average);
        
        // guided task #2
        int maxGrade = grades[0];
        int minGrade = grades[0];
        
        for (int i = 1; i < size; i++) {
            if (grades[i] > maxGrade) {
                maxGrade = grades[i];
            }
            
            if (grades[i] < minGrade) {
                minGrade = grades[i];
            }
        }
        
        System.out.println("\nGUIDED TASK #2 \nHighest Grade: " + maxGrade + "\nLowest Grade: " + minGrade);
        
        // guided task #3
        Arrays.sort(grades);
        System.out.println("\nGUIDED TASK #3 \nReversed w/o sorting: ");
        for (int i = size - 1; i >= 0; i--) {
            System.out.print(grades[i] + ", ");
        }
        System.out.print("\nSorting first before reversing \nSort: " + Arrays.toString(grades) + "\nReversing after sorting: ");
        for (int i = size - 1; i >= 0; i--) {
            System.out.print(grades[i] + ", ");
        }
        
    }
    
}