/*
1. You are required to display the prime factorization of a number.
2. Take as input a number n.
3. Print all its prime factors from smallest to largest.
*/
import java.util.*;
public class primeFactorization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Number:");
        int n = sc.nextInt();
        for(int i = 2;i <= n; i++){
            while(n%i==0){
                n = n/i;
                System.out.print(i+" ");
            }
        }
        sc.close();
    }
}
