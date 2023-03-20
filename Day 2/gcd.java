/*
1. You are required to print the Greatest Common Divisor (GCD) of two numbers.
2. Take input "num1" and "num2" as the two numbers.
3. Print their GCD
*/
import java.util.*;
public class gcd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st Number:");
        int num1=sc.nextInt();
        System.out.println("Enter 2nd Number:");
        int num2=sc.nextInt();
        while(num1 % num2 != 0){
            int rem = num1 % num2;
            num1 = num2;
            num2 = rem;
        }
        System.out.println("GCD of the given number is "+num2);
        sc.close();
    }   
}
