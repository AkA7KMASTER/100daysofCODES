import java.io.*;
import java.util.*;
import java.util.stream.*;

class Result {

    /*
     * Complete the 'isBalanced' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String isBalanced(String s) {
        if( s.length() % 2 != 0)
            return "NO";
        
        if(s.charAt(0) == '}' || s.charAt(0) == ']' || s.charAt(0) == ')')
            return "NO";
        
        Stack<Character> stack = new Stack<Character>();
        
        
        for(int i = 0; i < s.length(); i ++){
            if(s.charAt(i) == ')'){
                if(stack.empty() || !(stack.pop() == '('))
                    return "NO";
            }else if(s.charAt(i) == ']'){
                if(stack.empty() || !(stack.pop() == '['))
                    return "NO";
            }else if(s.charAt(i) == '}'){
                if(stack.empty() || !(stack.pop() == '{'))
                    return "NO";
            }else {
                stack.push(s.charAt(i));
            }
        }
        
        if(stack.empty()) 
            return "YES";
        return "NO";
    }

}

public class BalancedBrackets {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                String s = bufferedReader.readLine();

                String result = Result.isBalanced(s);

                bufferedWriter.write(result);
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
