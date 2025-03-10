
public class WT5_guidesTasks {
    
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3}, 
            {2,4,6},
            {3, 6, 9}
        };
        int[][] matrixB = {
            {1, 3, 5},
            {10, 20, 30},
            {9, 1, 1}            
        };
        
        // guided task #1
        int sum = calculatedSum(matrix);
        System.out.println("GUIDED TASK #1 \nMatrix given:");
        printMatrix(matrix);
        System.out.println("Sum: " + sum);
        
        // guided task #2
        System.out.println("\nGUIDED TASK #2 \nMatrix A: ");
        printMatrix(matrix);
        System.out.println("Matrix B: ");
        printMatrix(matrixB);
        addMatrices(matrix, matrixB);
        
        // guided task #3
        System.out.println("\nGUIDES TASK #3 \nMatrix A: ");
        printMatrix(matrix);
        System.out.println("Matrix B: ");
        printMatrix(matrixB);
        multiplyMatrices(matrix, matrixB);
    }
    
    // guided task #1
    public static int calculatedSum(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
        }
        return sum;
    }
    
    // guided task #2
    public static void addMatrices(int[][] matrixA, int[][] matrixB) {
        int[][] sum = new int[matrixA.length][matrixB[0].length];
        
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixB[0].length; j++) {
                sum[i][j] += matrixA[i][j] + matrixB[i][j];
            }
        }
        System.out.println("Sum (per element pos in each matrices): ");
        printMatrix(sum);
        System.out.println("Overall sum: ");
        int overall = calculatedSum(sum);
        System.out.println(overall);
    }
    
    // guided task #3
    public static void multiplyMatrices(int[][] matrixA, int[][] matrixB) {
        int[][] product = new int[matrixA.length][matrixB[0].length];
        
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixB[0].length; j++) {
                product[i][j] += matrixA[i][j] * matrixB[i][j];
            }
        }
        System.out.println("Product (per element pos in each matrices): ");
        printMatrix(product);
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