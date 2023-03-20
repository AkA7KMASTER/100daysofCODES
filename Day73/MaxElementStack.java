import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'getMax' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts STRING_ARRAY operations as parameter.
     */

    public static List<Integer> getMax(List<String> operations) {
    // Write your code here
        List<Integer> answer = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> nStack = new Stack<>();
        for (String operation : operations) {
            if(operation.charAt(0) == '1'){
                int toAdd = Integer.parseInt(operation.substring(2));
                stack.push(toAdd);
                if(nStack.isEmpty()){
                    nStack.push(toAdd);
                    continue;
                }
                if(toAdd > nStack.peek()){
                    nStack.push(toAdd);
                } else {
                    nStack.push(nStack.peek());
                }
                
            }
            if(operation.charAt(0) == '2'){
                stack.pop();
                nStack.pop();
            }
            if(operation.charAt(0) == '3'){
                answer.add(nStack.peek());
            }
        }
        return answer;
    }

}

public class MaxElementStack {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> ops = IntStream.range(0, n).mapToObj(i -> {
            try {
                return bufferedReader.readLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .collect(toList());

        List<Integer> res = Result.getMax(ops);

        bufferedWriter.write(
            res.stream()
                .map(Object::toString)
                .collect(joining("\n"))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
