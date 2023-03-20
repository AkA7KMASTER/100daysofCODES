/*
 A prime number is a natural number greater than 1 whose only positive divisors are 1 and itself.
 Given a large integer, n, use the Java BigInteger class' isProbablePrime method to determine and print whether 
 it's prime or not prime.

Input Format
A single line containing an integer, n (the number to be checked).

Constraints:
n contains at most 100 digits.

Output Format:
If  is a prime number, print prime; otherwise, print not prime.

Sample Input
13
Sample Output
prime
*/

import java.io.*;
import java.math.*;

public class PrimalityTest {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String n = bufferedReader.readLine();
        BigInteger bi = new BigInteger(n);
        if (bi.isProbablePrime(1)) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }
        bufferedReader.close();
    }
}
