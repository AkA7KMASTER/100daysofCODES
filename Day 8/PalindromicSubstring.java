/*

0. In this proram
1. You are given a string. 
2. You have to print all palindromic substrings of the given string.

Input Format:
A String

Output Format:
All palindromic substrings(one in a line).
First, all palindromic substrings starting from first character of string will be printed, then from second character and so on.

Sample Input:
abcc
Sample Output:
a
b
c
cc
c
*/
import java.util.*;
public class PalindromicSubstring{
    static boolean Palindrome(String s){
        int i = 0;
        int j = s.length() - 1;
        while(i<=j){
            char c1=s.charAt(i);
            char c2=s.charAt(j);
            if(c1!=c2){
                return false;
            }
            else{
                i++;
                j--;
            }
        }
        return true;
    }
    static void solution(String s){
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String ss = s.substring(i, j);
                if(Palindrome(ss) == true){
                    System.out.println(ss);
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter any string:");
		String str = scn.next();
		solution(str);
        scn.close();
    }
}
