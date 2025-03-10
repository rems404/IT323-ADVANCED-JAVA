public class WT5_selfPractice {
    
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3, 6}, 
            {2,4,6},
            {3, 6, 9}
        };
        int[][] matrixB = {
            {1, 27, 3}, 
            {22,4,6},
            {3, 6, 91}
        };
        
        // self practice #1
        System.out.println("Matrix: ");
        printMatrix(matrix);
        boolean isSymmetric = isSymmetric(matrix);
        if (isSymmetric == true) {
            System.out.println("It is symmetric.");
        } else {
            System.out.println("It is not symmetric.");
        }
        
        // self practice #2
        System.out.println("\nGUIDED TASK #2 \nMatrix: ");
        printMatrix(matrixB);
        System.out.println("Transposed Matrix: ");
        int[][] transposed = transpose(matrixB);
        printMatrix(transposed);
    }
    
    // self practice #1
    public static boolean isSymmetric(int[][] matrix) {
        if (matrix.length != matrix[0].length) {
            return false;
        }
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] != matrix[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }
    
    // self practice #2
    public static int[][] transpose(int[][] matrix) {
        int[][] transpose = new int[matrix[0].length][matrix.length];
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        return transpose;
    }
    
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    
}