import java.util.Arrays;

public class WT3_selfPractice {
    
    public static void main(String[] args) {
        int[] arrOne = {2, 2, 6, 7};
        int[] arrTwo = {2, 3, 5, 7};
        int oneSize = arrOne.length;
        int twoSize = arrTwo.length;
        int[] mergeArr = new int[oneSize + twoSize];
        
        // self practice #1
        System.arraycopy(arrOne, 0, mergeArr, 0, oneSize);
        System.arraycopy(arrTwo, 0, mergeArr, 4, twoSize);
        System.out.println("GUIDED TASK #1 \nFirst array: " + Arrays.toString(arrOne) + "\nSecond String: " + Arrays.toString(arrTwo) + "\nMerged: " + Arrays.toString(mergeArr));
        
        // self practice #2
        int[] arrThree = new int[mergeArr.length];
        int j = 0;
        for (int i = 0; i < arrThree.length; i++) {
            boolean isFound = false;
            for (int k = 0; k < j; k++) {
                if (mergeArr[i] == arrThree[k]) {
                    isFound = true;
                    break;
                }
            }
            if (!isFound) {
                arrThree[j++] = mergeArr[i];
            }
        }
        int[] finalRes = new int[j];
        System.arraycopy(arrThree, 0, finalRes, 0, j);
        System.out.println("\nGUIDED TASK #2 \nArray after deleting duplicates: " + Arrays.toString(finalRes));
    }
    
}