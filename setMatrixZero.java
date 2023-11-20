import java.util.Arrays;

public class setMatrixZero {
    public static void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        boolean first_row_has_zero = true;
        for (int j = 0; j < n; j++) {
            if (matrix[0][j] != 0) {
                first_row_has_zero = false;
                break;
            }
        }
        boolean first_col_has_zero = true;
        for (int i = 0; i < m; i++) {
            if (matrix[i][0] != 0) {
                first_col_has_zero = false;
                break;
            }
        }
        
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }
        
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }
        
        if (first_row_has_zero) {
            Arrays.fill(matrix[0], 0);
        }
        if (first_col_has_zero) {
            for (int i = 0; i < m; i++) {
                matrix[i][0] = 0;
            }
        }
    }
    
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 1, 1},
            {1, 0, 1},
            {1, 1, 1}
        };
        setZeroes(matrix);
        System.out.println("Modified matrix:");
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}
