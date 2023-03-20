/*
In computer science, a double-ended queue (dequeue, often abbreviated to deque, pronounced deck) is an abstract data type that 
generalizes a queue, for which elements can be added to or removed from either the front (head) or back (tail).

Deque interfaces can be implemented using various types of collections such as LinkedList or ArrayDeque classes. 
For example, deque can be declared as:
Deque deque = new LinkedList<>();
or
Deque deque = new ArrayDeque<>();

Problem Statement:

In this problem, you are given N integers. You need to find the maximum number of unique integers among all the possible contiguous 
subarrays of size M.

Note: Time limit is  second for this problem.

Input Format:

The first line of input contains two integers N and M: representing the total number of integers and the size of the subarray, 
respectively. The next line contains N space separated integers.

Output Format:

Print the maximum number of unique integers among all possible contiguous subarrays of size M.

Sample Input:

6 3
5 3 5 2 3 2
Sample Output:

3
*/
import java.util.*;

public class JavaDequeue {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        Deque deque = new ArrayDeque<>();
        int n = sc.nextInt();
        int m = sc.nextInt();
        int max = -1;
        HashSet<Integer> hash = new HashSet<>();
        for (int i = 0; i < n; i++) {
            int input = sc.nextInt();
            deque.add(input);
            hash.add(input);
            
            if (deque.size() == m) {
                if(hash.size() > max)
                 max = hash.size();

            int first = (int) deque.remove();
            if (!deque.contains(first))
                hash.remove(first);
            }
        }
        System.out.println(max);
        sc.close();
    }
}
