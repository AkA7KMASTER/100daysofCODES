/*
	We define the following:
	A subarray of an n-element array is an array composed from a contiguous block of the original array's elements.
    For example, if array=[1,2,3], then the subarrays are [1],[2],[3],[1,2],[2,3],and [1,2,3]. Something like [1,3] would not be
    a subarray as it's not a contiguous subsection of the original array.
    The sum of an array is the total sum of its elements.
    An array's sum is negative if the total sum of its elements is negative.
    An array's sum is positive if the total sum of its elements is positive.
    Given an array of  integers, find and print its number of negative subarrays on a new line.
	
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
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
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