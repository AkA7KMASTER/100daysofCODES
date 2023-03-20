/*
1. You've to check whether a given set of t numbers are prime or not.
2. Take a number "t" as input representing count of input numbers to be tested.
3. Take a number "n" as input "t" number of times.
4. For each input value of n, print "prime" if the number is prime and "not prime" otherwise.
*/
import java.util.*;
public class prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of terms:");
        int t=sc.nextInt();
        int count = 0;
        for (int i = 0; i < t; i++) {
            System.out.println("Enter Numbers:");
            int n=sc.nextInt();
            for(int div=2;div<=n;div++){ 
                if(n%div==0){
                    count++;
                    break;
                }
            }
            if(count>1){
                System.out.println("Not Prime");
            }
            else{
                System.out.println("Prime");
            }
        }
        sc.close();
    }
}
