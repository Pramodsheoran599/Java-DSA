package Arrays_2D;

//Given a 2D matrix, print all the elements in spiral order.
public class Spiral_Order_Matrix {

    public static void main(String[] args) {

        int[][] array = {{1,2,3,4,5},
                         {6,7,8,9,10},
                         {11,12,13,14,15}};

       int top = 0;
       int bottom = array.length - 1;
       int left = 0;
       int right = array[0].length - 1;

       while (top <= bottom && left <= right){

           // Move from left to right and then move top below
           for (int i = left ; i <= right ; i++)
               System.out.print(array[top][i] + ",");

           top++;

           // Move from top to bottom and then move right on left
           for (int i = top ; i <= bottom ; i++)
               System.out.print(array[i][right] + ",");

           right--;

           // Move from right to left and then move bottom above
           if(top <= bottom) {
               for (int i = right; i >= left; i--)
                   System.out.print(array[bottom][i] + ",");

               bottom--;
           }

           // Move from bottom to top and then move left to right
           if(left <= right) {
               for (int i = bottom; i >= top; i--)
                   System.out.print(array[i][left] + ",");

               left++;
           }
       }
    }
}
