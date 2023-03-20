/*
Question Link:https://www.hackerrank.com/challenges/java-stack/
Given a string, determine if it is balanced or not.

Input Format:
There will be multiple lines in the input file, each having a single non-empty string. You should read input till end-of-file.
The part of the code that handles input operation is already provided in the editor.

Output Format:
For each case, print 'true' if the string is balanced, 'false' otherwise.

Sample Input

{}()
({()})
{}(
[]

Sample Output

true
true
false
true
*/
import java.util.*;
public class JavaStack {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String str=sc.next();
            Stack<Character>st= new Stack<>();
            char[] s = str.toCharArray();
            for(int i=0;i<str.length();i++){
                if(st.isEmpty()){
                    st.push(s[i]);
                    continue;
                }
                else if(s[i]=='}'){
                    if(st.peek()=='{')
                        st.pop();
                    else
                        st.push(s[i]);
                }
                else if(s[i]==']'){
                    if(st.peek()=='[')
                        st.pop();
                    else
                        st.push(s[i]);
                }
                else if(s[i]==')'){
                    if(st.peek()=='(')
                        st.pop();
                    else
                        st.push(s[i]);
                }
                else{
                    st.push(s[i]);
                }
            }
            System.out.println(st.isEmpty());
        }
    }
}