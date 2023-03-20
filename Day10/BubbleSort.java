/*
Given an Integer N and a list arr. Sort the array using bubble sort algorithm.


Example 1:
Input: 
N = 5
arr[] = {4, 1, 3, 9, 7}
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
arr[] = {-65, 0, -2, 6, -3}
Output: 
-65 -3 -2 0 6 
*/

import java.util.*;
public class BubbleSort {
   static void bubbleSort(int arr[], int n) {
      int temp = 0, i, j;
      for (i = 0; i < n; i++) {
         for (j = n - 1; j >= i + 1; j--) {
            if (arr[j] < arr[j - 1]) {
               temp = arr[j];
               arr[j] = arr[j - 1];
               arr[j - 1] = temp;
            }
         }
      }
   }
   public static void main(String args[]) {
      int num, i;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the size of array : ");
      num = sc.nextInt();
      int arr[] = new int[num];
      System.out.println("Enter elements of the array : ");
      for (i = 0; i < num; i++) {
         arr[i] = sc.nextInt();
      }
      bubbleSort(arr, num);
      System.out.println("Sorted Array:");
      for (i = 0; i < num; i++) {
         System.out.print(arr[i] + " ");
      }
      sc.close();
   }
}