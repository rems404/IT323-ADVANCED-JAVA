import java.util.Scanner;
import java.util.Arrays;

public class WT4_selfPractice {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // self practice #1
        String[] array = new String[5];
        System.out.print("SELF PRACTICE #1 \nEnter 5 strings: ");
        for (int i = 0; i < 5; i++) {
            array[i] = scan.nextLine();
        }
        System.out.println("Arrays: " + Arrays.toString(array));
        
        // self practice #2
        insertionSort(array);
    }
    
    // self practice #2
    public static void insertionSort(String[] array) {
        for (int i = 1; i < array.length; i++) {
            String a = array[i];
            int b = i - 1;
            while (b >= 0 && array[b].compareTo(a) > 0) {
                array[b + 1] = array[b];
                b--;
            }
            array[b + 1] = a;
        }
        System.out.println("\nSELF PRACTICE #2 \nSorted using insertion sort: " + Arrays.toString(array));
    }
    
}