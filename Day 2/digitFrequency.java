/*
1. You are given a number n.
2. You are given a digit d.
3. You are required to calculate the frequency of digit d in number n.
*/
import java.util.*;
public class digitFrequency {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int f = getDigitFrequency(n, d);
        System.out.println(f);
        sc.close();
    }

    public static int getDigitFrequency(int n, int d) {
        int count = 0;
        while(n>0){
            int dig = n%10;
            n = n/10;

            if(dig == d){
                count++;
            }
        }
        return count;
    }
}