/*
Problem Statement
You are given a 2D array with dimensions 6*6. An hourglass in an array is defined as a portion shaped like this:

a b c
  d
e f g
For example, if we create an hourglass using the number 1 within an array full of zeros, it may look like this:

1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
Actually, there are many hourglasses in the array above. The three topmost hourglasses are the following:

1 1 1     1 1 0     1 0 0
  1         0         0
1 1 1     1 1 0     1 0 0

Sample Input

1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 2 4 4 0
0 0 0 2 0 0
0 0 1 2 4 0

Sample Output

19
*/
import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

public class maxhourglasssum {
    public static void main(String[] args) {
        int[][] arr = new int[][] { { 2, 1, 4, 3 }, { 0, 0, 5, 6 }, { 5, 6, 5, 7 }, { 7, 4, 3, 2 } };
        int max = 0, ii = 0, jj = 0;

        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = 0; j < arr.length - 2; j++) {
                int sum = arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + arr[i + 1][j + 1] + arr[i + 2][j]
                        + arr[i + 2][j + 1] + arr[i + 2][j + 2];
                if (sum > max) {
                    max = sum;
                    ii = i;
                    jj = j;
                }
            }
        }
        System.out.println("max sum = " + max);
        System.out.println(arr[ii][jj] + " " + arr[ii][jj + 1] + " " + arr[ii][jj + 2] + "\n " + arr[ii + 1][jj + 1]
                + "   \n" + arr[ii + 2][jj] + " " + arr[ii + 2][jj + 1] + " " + arr[ii + 2][jj + 2]);

        System.out.println("(" + ii + "," + jj + ")" + "(" + ii + "," + (jj + 1) + ")" + "(" + ii + "," + (jj + 2)
                + ")\n"
                + "     (" + (ii + 1) + "," + (jj + 1) + ")\n" + "(" + (ii + 2) + "," + (jj) + ")" + "(" + (ii + 2)
                + ","
                + (jj + 1) + ")" + "(" + (ii + 2) + "," + (jj + 2) + ")");
    }
}
