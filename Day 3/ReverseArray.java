import java.util.*;
public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int n = sc.nextInt();
        int arr[] =  new int[n];
        System.out.println("Enter an array values");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int temp;
        int start = 0;
        int end   = n-1;
        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            
            start++;
            end--;
        }
        System.out.println("Printing an array after reverse");
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }   
}