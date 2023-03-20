/*TaKen From:https://www.pepcoding.com/resources/online-java-foundation/function-and-arrays/span-of-array-official/ojquestion
Problem Statement:
1. You are given a number n, representing the count of elements.
2. You are given n numbers.
3. You are required to find the span of input. Span is defined as difference of maximum value and minimum value.
*/

/*
Input Format
A number n
n1
n2
.. n number of elements

Output Format
A number representing max - min


Sample Input:
6
15
30
40
4
11
9

Sample Output:
36
*/

import java.util.Scanner;
public class SpanOfArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        int min = arr[0];
        for (int  i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max = arr[i];
            }
            if(arr[i]<min){
                min = arr[i];
            }
        }
        int span = max - min;
        System.out.println(span);
        sc.close();
    }
}