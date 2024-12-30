package Arrays_2D;

//Given a m x n matrix, if an element is 0, set the entire row and column to 0 (modify the matrix in-place).
public class Set_Zeros {

    public static void main(String[] args) {

        // Array of n x m size
        int[][] array = {{1,2,3},
                         {4,5,6},
                         {0,8,9}};

        int n = array.length;
        int m = array[0].length;

        outer : for (int i = 0 ; i < n ; i++) {
            for (int j = 0 ; j < m ; j++) {

                if (array[i][j] == 0) {

                    //Set the Column to zeros
                    for (int row = 0 ; row < n ; row++)
                        array[row][j] = 0;

                    //Set the Row to zeros
                    for (int col = 0 ; col < m ; col++)
                        array[i][col] = 0;

                    break outer;
                }
            }
        }


        //print array
        for (int i = 0 ; i < n ; i ++){
            for (int j = 0 ; j < m ; j++){
                System.out.print(array[i][j] + ", ");
            }
            System.out.println();
        }
    }
}
