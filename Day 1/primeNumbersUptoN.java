/*
1. You've to print all prime numbers between a range. 
2. Take as input "low", the lower limit of range.
3. Take as input "high", the higher limit of range.
4. For the range print all the primes numbers between low and high (both included).
*/
import java.util.*;
public class primeNumbersUptoN {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int low=2;
        System.out.print("Enter number upto which you want to find prime:");
        int high=scn.nextInt();
        scn.close();

        for(int n=low;n<=high;n++){
            int count = 0;
            for(int div = 2; div * div <= n ; div++){
            if(n % div == 0){
                count++;
                break;
            }
        }
        if(count == 0){
            System.out.println(n+ " is a prime number");
        }
        }
    }    
}