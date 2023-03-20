/*
Print the given pattern
     1     
    1 1    
   1 2 1   
  1 3 3 1  
 1 4 6 4 1 
*/
import java.util.*;
public class PascalTriangle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size:");
        int n = sc.nextInt();           //taking size from the user
        for (int line = 1; line <= n; line++) {
            for (int j = 0; j <= n - line; j++) {
                System.out.print(" ");  //space from the left
            }
            int C = 1;
            for (int i = 1; i <= line; i++) {
                System.out.print(C + " ");
                C = C * (line - i) / i;
            }
            System.out.println();
        }
        sc.close();
    }
}