/*
Question Link:https://www.hackerrank.com/challenges/java-arraylist
Input Format
The first line has an n integer . In each of the next n lines there will be an integer d denoting number of integers 
on that line and then there will be d space-separated integers. In the next line there will be an integer q denoting number
 of queries. Each query will consist of two integers x and y.

Constraints

Each number will fit in signed integer.
Total number of integers in  lines will not cross 10^5.

Output Format
In each line, output the number located in yth position of xth line. If there is no such position, just print "ERROR!"

Sample Input

5
5 41 77 74 22 44
1 12
4 37 34 36 52
0
3 20 22 33
5
1 3
3 4
3 1
4 3
5 5

Sample Output

74
52
37
ERROR!
ERROR!
*/

import java.io.*;
import java.util.*;

public class JavaArrayList {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        for(int i=0;i<n;i++){
            int d=scanner.nextInt();
            ArrayList<Integer>temparr=new ArrayList<>();
            for(int j=0;j<d;j++){
                int ele=scanner.nextInt();
                temparr.add(ele);
            }
            arr.add(temparr);
        }
        int q = scanner.nextInt();
        for(int i=0;i<q;i++){
            int x=scanner.nextInt();
            int y=scanner.nextInt();
            if(x<=n){
                if(y<=arr.get(x-1).size()){
                    System.out.println(arr.get(x-1).get(y-1));
                }
                else{
                    System.out.println("ERROR!");
                }
            }
            else{
                System.out.println("ERROR!");
            }
        }
    }
}