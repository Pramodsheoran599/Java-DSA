package Arrays_2D;

// Given a matrix filled with 0s and 1s, find the largest rectangle containing only 1s and return its area.
public class Maximal_Rectangle {

    public static void main(String[] args) {

        // Array of n x m size
        int[][] array = {{1, 0, 1, 0, 0},
                         {1, 0, 1, 1, 1},
                         {1, 1, 1, 1, 1},
                         {1, 0, 0, 1, 0}};

        int n = array.length;
        int m = array[0].length;
    }
}
