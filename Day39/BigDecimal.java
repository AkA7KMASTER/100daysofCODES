/*

Java BigDecimal class can handle arbitrary-precision signed decimal numbers. Lets test your knowledge on them!

You are given nn real numbers, sort them in descending order! Read data from System.in.

Note: To make the problem easier, we provided you the input/output part in the editor. 
Print the numbers as they appeared in the input, don't change anything. 
If two numbers represent numerically equivalent values, the output must list them in original order of the input

Input Format
The first line will consist an integer nn, each of the next n lines will contain a real number. 
n will be at most 200. The numbers can have at most 300 digits!

Output Format
Print the numbers in descending orders, one number in each line.
*/

import java.math.BigDecimal;
import java.util.*;
class Solution{

    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
      	sc.close();

        //Write your code here
        Comparator myComparator = new Comparator(){

        @Override
        public int compare(Object o1, Object o2) {
            BigDecimal a = new BigDecimal(String.valueOf(o1));
            BigDecimal b = new BigDecimal(String.valueOf(o2));
            return b.compareTo(a);
        }
    };
    Arrays.sort(s,0,n,myComparator);

        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }

}
