package Arrays_2D;

// Given a 2D array of integers, print the elements of the matrix in a wave-like pattern (starting from the top-left corner).
public class Wave_Print {

    public static void main(String[] args) {

        // Array of n x m size
        int[][] array = {{1,2,3},
                         {4,5,6},
                         {0,8,9}};

        int top = 0, bottom = array.length - 1;
        int left = 0, right = array[0].length - 1;

        while (left <= right){

            // Top to bottom - > move left to right
            for (int i = top ; i <= bottom ; i++)
                System.out.print(array[i][left] + ", ");

            left++;

            //Bottom to Top -> Move left to right
            if (left<=right)
                for (int i = bottom; i >= top; i--)
                    System.out.print(array[i][left] + ", ");

            left++;
        }
    }
}
