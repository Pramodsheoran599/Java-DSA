package Arrays_2D;

import java.util.*;
import java.util.stream.IntStream;

// A saddle point in a matrix is an element which is the minimum element in its row and the maximum element in its column. Write a function to find the saddle point, if it exists.
public class Saddle_Point {

    public static void main(String[] args) {

        // Array of n x m size
        int[][] matrix = {{1,2,3},
                          {4,5,6},
                          {7,8,9}};

        int rows = matrix.length;
        int cols = matrix[0].length;

        // For each minimum value of a row verify if it's a maximum value of the column;

        List<Integer> saddlePoints = new ArrayList<>();

        for (int[] row : matrix) {

            //Find the Minimum element of the row and its index
            int rowMin = row[0];
            int rowMinColIndex = 0;

            for (int j = 1; j < cols; j++)
                if (row[j] < rowMin) {
                    rowMin = row[j];
                    rowMinColIndex = j;
                }

            //Check if its Maximum in the Column
            boolean isSaddlePoint = true;
            int colMax = rowMin;
            for(int i = 0 ; i < rows ; i++)
                if(matrix[i][rowMinColIndex] > colMax) {
                    isSaddlePoint = false;
                    break;
                }

            if(isSaddlePoint)
                saddlePoints.add(colMax);
        }

        System.out.println(saddlePoints);
    }
}
