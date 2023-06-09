/*
Problem:
An array is a type of data structure that stores elements of the same type in a contiguous block of memory. In an array, A, of size N, each memory location has some 
unique index, (where 0 ≤ i ≤ N), that can be referenced as A[i](you may also see it written as Ai).

Given an array, A, of N integers, print each element in reverse order as a single line of space-separated integers.
Note: If you’ve already solved our C++ domain’s Arrays Introduction challenge, you may want to skip this.

Sample Input

4
1 4 3 2

Sample Output
2 3 4 1
*/
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class ReverseArray {

    // Complete the reverseArray function below.
    static int[] reverseArray(int[] a) {
        for(int i = 0, j = a.length-1; i < a.length; i++, j--){
            if(i < j){
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            }
        }
        return a;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arrCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[arrCount];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < arrCount; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int[] res = reverseArray(arr);

        for (int i = 0; i < res.length; i++) {
            bufferedWriter.write(String.valueOf(res[i]));

            if (i != res.length - 1) {
                bufferedWriter.write(" ");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
