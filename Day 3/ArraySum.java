import java.util.*;
public class ArraySum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of the Arrays:");
        int size = sc.nextInt();
        int arr1[] = new int[size];
        int arr2[] = new int[size];
        int arrSum[] = new int[size];
        System.out.println("Enter Elements For The First Array:");
        for (int i = 0 ; i < size ; i++) {
            arr1[i]=sc.nextInt();
        }
        System.out.println("Enter Elements For The Second Array:");
        for (int i = 0 ; i < size ; i++) {
            arr2[i]=sc.nextInt();
        }
        for (int i = 0 ; i < size ; i++) {
            arrSum[i]=arr1[i]+arr2[i];
        }
        for (int i = 0 ; i < size ; i++) {
            System.out.print("Sum of two arrays:" +arrSum[i]+" ");
        }
        sc.close();
    }
}