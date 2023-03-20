import java.util.*;
public class SearchElementInArray {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter size of the array");
         int n = sc.nextInt();
         int[] arr = new int[n];
         System.out.println("Enter elements of the array");
         for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
         }
         int target = sc.nextInt();
         for (int i = 0; i < n; i++) {
            if (target == arr[i]) {
              System.out.println("Element present at index"+i);
            }
         }
         System.out.println("Not Found");
         sc.close();
    }
}
