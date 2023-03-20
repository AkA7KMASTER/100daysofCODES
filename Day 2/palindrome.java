//Write a program to check whether your given no is palindrome or not
import java.util.*;
class palindrome {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter Number:");
         int n = sc.nextInt();
         int rev = 0, rem;
         int num = n;
         while (n != 0) {
           rem = n % 10;
           rev = rev * 10 + rem;
           n /= 10;
         }
         if (num == rev) {
           System.out.println(num + " is Palindrome.");
         } else {
           System.out.println(num + " is not Palindrome.");
         }
         sc.close();
    }
}
