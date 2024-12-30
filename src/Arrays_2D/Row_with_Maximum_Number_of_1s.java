package Arrays_2D;

import java.util.Arrays;

//Given a binary matrix, find the row with the maximum number of 1s.
public class Row_with_Maximum_Number_of_1s {

    public static void main(String[] args) {

        // Array of n x m size
        int[][] matrix = {{1,0,0},
                          {1,1,0},
                          {0,0,0}};

        int rows = matrix.length;

        int max = Integer.MIN_VALUE;
        int maxRowIndex = 0;

        for(int i = 0 ; i < rows ; i++){

            int count = (int) Arrays.stream(matrix[i]).filter(item -> item == 1).count();

            if(count > max) {
                max = count;
                maxRowIndex = i;
            }
        }

        System.out.println("Row index with max number of 1s : " + (maxRowIndex + 1));
    }
}
