/*
Problem Statement :

There is a collection of input strings and a collection of query strings. For each query string, determine how many 
times it occurs in the list of input strings. Return an array of the results.

Example:
strings=['ab', 'ab', 'abc']
queries=['ab', 'abc', 'bc']

There are instances of 'ab', 1 of 'abc' and 0 of 'bc'. For each query, add an element to the return array,
 results=[2,1,0].

Sample Input:

4
aba
baba
aba
xzxb
3
aba
xzxb
ab

Sample Output:

2
1
0
Explanation:

Here, "aba" occurs twice, in the first and third string. The string "xzxb" occurs once in the fourth string, 
and "ab" does not occur at all.
*/
import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'matchingStrings' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. STRING_ARRAY stringList
     *  2. STRING_ARRAY queries
     */

    public static List<Integer> matchingStrings(List<String> stringList, List<String> queries) {
    // Write your code here
        List<Integer> arr = new ArrayList();
        for (int i = 0; i < queries.size(); i++){
            int count = 0;
            for (int j = 0; j < stringList.size(); j++){
                if (queries.get(i).contains(stringList.get(j))){
                    count++;
                }
            }
            arr.add(count);
        }
        return arr;
    }

}

public class SparseArrays {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int stringListCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> stringList = IntStream.range(0, stringListCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .collect(toList());

        int queriesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> queries = IntStream.range(0, queriesCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .collect(toList());

        List<Integer> res = Result.matchingStrings(stringList, queries);

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
