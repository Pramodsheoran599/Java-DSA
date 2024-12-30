package Arrays_2D;

//Given an n x n matrix, rotate it 90 degrees clockwise in-place.
public class Matrix_Transpose {

    public static void main(String[] args) {

        // Array of n x m size
        int[][] array = {{1,2,3,4,5},
                         {6,7,8,9,10},
                         {11,12,13,14,15}};

        int n = array.length;
        int m = array[0].length;

        //Create an Empty array of m x n size
        int[][] transpose_matrix = new int[m][n];

        for (int i = 0 ; i < n ; i ++){
            for (int j = 0 ; j < m; j++){
                transpose_matrix[j][i] = array[i][j];
            }
        }

        for (int[] transposeMatrix : transpose_matrix) {
            for (int j = 0; j < transpose_matrix[0].length; j++) {
                System.out.print(transposeMatrix[j] + ", ");
            }
            System.out.println();
        }
    }
}
