/*
Given a sorted array of size N and an integer K, find the position at which K is present in the array using binary search.

Task:Write a program which takes arr[], N and K as input parameters and returns the index of K in the array. If K is not present in the array, return -1.

Example 1:
Input:
N = 5
arr[] = {1 2 3 4 5} 
K = 4
Output: 3
Explanation: 4 appears at index 3.

Example 2:
Input:
N = 5
arr[] = {11 22 33 44 55} 
K = 445
Output: -1
Explanation: 445 is not present.
*/

import java.util.*;
public class BinarySearch {
    static int binSearch(int arr[],int target){
        int lo = 0;
        int hi = arr.length-1;
        while (lo<=hi){
            int mid=(lo+hi)/2;
            if (arr[mid]==target){
                return mid;
            }
            else if(arr[mid]<target){
                lo=mid+1;
            }
            else{
                hi=mid-1;
            }
        }
        return -1;
}
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of the array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter elements in the sorted format:");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("Entered array is:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println("\nEnter the value that you want to search: ");
        int target=sc.nextInt();
        int result=binSearch(arr, target);
        if(result==-1){
            System.out.println("Either user has enterd unsorted array or element is not present");
        }
        else{
            System.out.println("Item is present at "+(result)+" index");
        }
        sc.close();
    }
}