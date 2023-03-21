/*
Input Format:
In the first line, there will be an integer T denoting number of pairs. Each of the next T lines will 
contain two strings seperated by a single space.

Output Format:
Print T lines. In the ith line, print number of unique pairs you have after taking ith pair as input.

Sample Input:
5
john tom
john mary
john tom
mary anna
mary anna

Sample Output:
1
2
2
3
3
*/

import java.util.*;

public class JavaHashSet {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];
        
        for (int i = 0; i < t; i++) {
            pair_left[i] = sc.next();
            pair_right[i] = sc.next();
        }
        Set <String> st = new HashSet<>();
        for(int i=0;i<t;i++){
            st.add(pair_left[i]+" "+pair_right[i]);
            System.out.println(st.size());
        }
        sc.close();
    }
}
