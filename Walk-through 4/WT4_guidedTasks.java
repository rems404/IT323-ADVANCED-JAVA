import java.util.Arrays;

public class WT4_guidedTasks {
    
    public static void main(String[] args) {
        int[] arr = {9, 8, 1, 44, 0};
        
        // guided task #1
        selectionSort(arr);
        
        // guided task #2
        int searchFor = 9;
        int search = linearSearch(arr, searchFor);
        System.out.print("\nGUIDED TASK #2 \nLinear searching (looking for " + searchFor + " in array): ");
        if(search == -1) {
            System.out.print(searchFor + " is not found!");
        } else {
            System.out.print(searchFor + " at index " + search + ".");
        }
        
        // guided task #3
        int binary = binarySearch(arr, searchFor);
        System.out.print("\n\nGUIDED TASK #3 \nBinary searching (looking for " + searchFor + " in array); ");
        if(binary == -1) {
            System.out.print(searchFor + " is not found!");
        } else {
            System.out.print(searchFor + " at index " + search + ".");
        }
    }
    
    // guided task #1
    public static void selectionSort(int[] arr){
        for (int a = 0; a < arr.length - 1; a++) {
            int b = a;
            for (int i = a + 1; i < arr.length; i++) {
                if (arr[i] < arr[b]) {
                    b = i;
                }
            }
            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
        }
        System.out.println("GUIDED TASK #1 \nSelection sorting: " + Arrays.toString(arr));
    }
    
    // guide task #2
    public static int linearSearch(int[] array, int s) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == s) {
                return i;
            }
        }
        return -1;
    }
    
    // guided task #3
    public static int binarySearch(int[] array, int s) {
        int start = 0;
        int end = array.length - 1;
        
        while (start <= end) {
            int mid = (start + end) / 2;
            if (s == array[mid]) {
                return mid;
            } else if (s > array[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
    
}