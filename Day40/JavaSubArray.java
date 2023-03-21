/*	
    Input Format:
    The first line contains a single integer, , denoting the length of array . 
	The second line contains  space-separated integers describing each respective element, , in array .
	
    Output Format:
	Print the number of subarrays of  having negative sums.
  
    Sample Input:
    5
    1 -2 4 -5 1

    Sample Output:
    9
*/

import java.io.*;
import java.util.*;

public class JavaSubArray {

    public static void main(String[] args) {
   
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++){
        arr[i] = sc.nextInt();
        }
        int subArr = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                if (sum < 0){
                    subArr++;
                }
            }
        }
        System.out.print(subArr);    
    }
}
