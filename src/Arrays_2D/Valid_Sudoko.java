package Arrays_2D;

//Valid Sudoku
//Write a function to check if a given 9x9 Sudoku board is valid. Only the filled cells need to be validated according to the following rules:
//
//Each row must have the digits 1-9 without repetition.
//Each column must have the digits 1-9 without repetition.
//Each of the nine 3x3 sub grids must have the digits 1-9 without repetition.

public class Valid_Sudoko {

    public static void main(String[] args) {

        // Array of n x m size
        int[][] matrix = {{'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                          {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                          {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                          {'8', '.', '.', '8', '.', '.', '.', '3', '.'},
                          {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                          {'7', '.', '.', '.', '2', '.', '6', '8', '.'},
                          {'.', '6', '.', '.', '.', '2', '8', '.', '.'},
                          {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                          {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};

        int n = 9;
        int m = 9;
    }
}
