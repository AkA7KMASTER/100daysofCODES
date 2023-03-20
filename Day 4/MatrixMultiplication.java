/*
Question taken from:https://www.pepcoding.com/resources/online-java-foundation/2d-arrays/matrix-multiplication-official/ojquestion
1. You are given a number n1, representing the number of rows of 1st matrix.
2. You are given a number m1, representing the number of columns of 1st matrix.
3. You are given n1*m1 numbers, representing elements of 2d array a1.
4. You are given a number n2, representing the number of rows of 2nd matrix.
5. You are given a number m2, representing the number of columns of 2nd matrix.
6. You are given n2*m2 numbers, representing elements of 2d array a2.
7. If the two arrays representing two matrices of dimensions n1 * m1 and n2 * m2 can be multiplied, display the contents of prd array as specified in output Format.
8. If the two arrays can't be multiplied, print "Invalid input".
*/
/*
Sample Input:
3
2
1 2
3 4
5 6
2
3
7 8 9
10 11 12
Expected Output:
27 30 
61 68
95 106
*/


import java.util.*;
public class MatrixMultiplication {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //taking user input for the 1st array
    System.out.println("Enter row size for 1st matrix:");
    int n1 = sc.nextInt(); 
    System.out.println("Enter column size for 1st matrix:");
    int m1 = sc.nextInt();
    int[][] a1 = new int[n1][m1];
    System.out.println("Enter elements for the 1st array:");
    for (int i = 0; i < n1; i++) {
      for (int j = 0; j < m1; j++) {
        a1[i][j] = sc.nextInt();
      }
    }
    //taking user input for 2nd array
    System.out.println("Enter row size for 2nd matrix:");
    int n2 = sc.nextInt(); 
    System.out.println("Enter column size for 2nd matrix:");
    int m2 = sc.nextInt();
    System.out.println("Enter elements for the 2nd matrix:");
    int[][] a2 = new int[n2][m2];
    for (int i = 0; i < n2; i++) {
      for (int j = 0; j < m2; j++) {
        a2[i][j] = sc.nextInt();
      }
    }
    //checking whether matrix multiplication is possible or not
    if (m1 != n2) {
      System.out.println("Invalid input");
    } else {                    //(matrix multiplication logic)
      int[][] result = new int[n1][m2]; 
      for (int i = 0; i < n1; i++) {
        for (int j = 0; j < m2; j++) {
          for (int k = 0; k < m1; k++) {
            result[i][j] = result[i][j] + a1[i][k] * a2[k][j];
          }
        }
      }
      //printing the resultant array
      System.out.println("Result:");
      for (int i = 0; i < n1; i++) {
        for (int j = 0; j < m1; j++) {
          System.out.print(result[i][j] + " ");
        }
        System.out.println();
      }
    }
    sc.close();
  }
}