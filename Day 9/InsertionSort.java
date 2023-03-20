/*
The task is to create a program which is used to implement insertion sort to sort the array of given n elements in ascending order.

Example 1:
Input:
N = 5
arr[] = { 4, 1, 3, 9, 7}
Output:
1 3 4 7 9

Example 2:
Input:
N = 10
arr[] = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1}
Output:
1 2 3 4 5 6 7 8 9 10

Example 3:
Input:
N = 5
arr[] = {-6,-60,0,547,-56}
Output:
-60 -56 -6 0 547 
*/

import java.util.*;
public class InsertionSort {
  static void sort(int arr[], int n) {//logic
    int i, j, key;
    for (j = 1; j < n; j++) {
      key = arr[j];
      i = j - 1;
      while (i >= 0 && key < arr[i]) {
        arr[i + 1] = arr[i];
        i--;
      }
      arr[i + 1] = key;
    }
  }
  public static void main(String args[]) {
    int num;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the array : ");
    num = sc.nextInt();
    System.out.println("Enter elements of the array:");
    int arr[] = new int[num];
    for (int i = 0; i < num; i++) { //taking user input for array elements
      arr[i] = sc.nextInt();
    }
    sort(arr, num); //calling sort function
    System.out.println("Sorted Array:");  //printing the sorted array
    for (int i = 0; i < num; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
    sc.close();
  }
}