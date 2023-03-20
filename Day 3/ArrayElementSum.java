import java.util.*;
public class ArrayElementSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array:");
        int size = sc.nextInt();
        int arr[] = new int[size];
        int arraySum = 0;
        System.out.println("Enter elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i]=sc.nextInt();
        }
        for (int i = 0; i < size; i++) {
            arraySum+=arr[i];
        }
        System.out.println("Sum of elements of array:"+arraySum);
        sc.close();
    }
}