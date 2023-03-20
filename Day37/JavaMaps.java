/*
You are given a phone book that consists of people's names and their phone number. 
After that you will be given some person's name as query. For each query, print the phone number of that person.

Input Format

The first line will have an integer n denoting the number of entries in the phone book. 
Each entry consists of two lines: a name and the corresponding phone number.

After these, there will be some queries. Each query will contain a person's name. 
Read the queries until end-of-file.

Constraints:
A person's name consists of only lower-case English letters and it may be in the format 'first-name last-name' 
or in the format 'first-name'. Each phone number has exactly 8 digits without any leading zeros.
1<=n<=100000
Sample Input

3
uncle sam
99912222
tom
11122222
harry
12299933
uncle sam
uncle tom
harry

Sample Output

uncle sam=99912222
Not found
harry=12299933
*/
import java.util.*;
public class JavaMaps {
    public static void main(String[] argh) {
        HashMap < String, Integer > hash = new HashMap < String, Integer > ();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); in.nextLine();
        for (int i = 0; i < n; i++) {
            String name = in.nextLine();
            int phone = in.nextInt();
            hash.put(name, phone); in.nextLine();
        }
        while ( in.hasNext()) {
            String s = in.nextLine();
            if (hash.containsKey(s)) {
                System.out.println(s + "=" + hash.get(s));
            } else {
                System.out.println("Not found");
            }
        }
        in.close();
    }
}