/* Taken from : https://www.pepcoding.com/resources/online-java-foundation/string,-string-builder-and-arraylist/string-compression-official/ojquestion
1. You are given a string. 
2. You have to compress the given string in the following two ways - 
   First compression -> The string should be compressed such that consecutive duplicates of characters are replaced with a single character.
   For "aaabbccdee", the compressed string will be "abcde".
   Second compression -> The string should be compressed such that consecutive duplicates of characters are replaced with the character and followed by the number of consecutive duplicates.
   For "aaabbccdee", the compressed string will be "a3b2c2de2".
*/

/*
Sample Input:
wwwwaaadexxxxxx

Sample Output:
wadex
w4a3dex6
*/

import java.util.*;
public class StringCompression{
    //function for removing duplicate values
    public static String compression1(String str){ 
		String s = str.charAt(0)+"";
        for (int i = 1; i < str.length(); i++) {
            char current = str.charAt(i);
            char previous = str.charAt(i-1);
            if(current!=previous){
                s=s+current;
            }
        }
		return s;
	}

	public static String compression2(String str){
		String s = str.charAt(0)+"";
        int count = 1;
        for (int i = 1; i < str.length(); i++) {
            char current = str.charAt(i);
            char previous = str.charAt(i-1);
            if(current==previous){
                count++;
            }
            else{
                if(count>1){
                    s=s+count;
                    count =1;
                }
                s=s+current;
            }
	    }
        if(count>1){
            s=s+count;
            count =1;
        }
        return s;
}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(compression1(str));
		System.out.println(compression2(str));
        scn.close();
	}
}