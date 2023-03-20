/*
In this problem, you have to add and multiply huge numbers!
These numbers are so big that you can't contain them in any ordinary data types like a long integer.

Input Format
There will be two lines containing two numbers, a and b.

Constraints
a and b are non-negative integers and can have maximum 200 digits.

Output Format

Output two lines. The first line should contain a+b,
and the second line should contain a*b. Don't print any leading zeros.

Sample Input
1234
20

Sample Output
1254
24680
*/

import java.util.*;
import java.math.*;

public class BigInt {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger a;
        BigInteger b;
        BigInteger sum = BigInteger.valueOf(0);
        BigInteger product = BigInteger.valueOf(0);

        a = new BigInteger(sc.nextLine());
        b = new BigInteger(sc.nextLine());

        sum = sum.add(a);
        sum = sum.add(b);
        product = a.multiply(b);

        System.out.println(sum);
        System.out.println(product);
        sc.close();
    }
}