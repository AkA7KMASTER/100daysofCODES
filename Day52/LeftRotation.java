/*
Problem Statement:
A left rotation operation on an array of size n shifts each of the array’s elements 1 unit to the left. For example, if 
left 2 rotations are performed on array [1,2,3,4,5], then the array would become [3,4,5,1,2].

Given an array m of integers and a number, d, perform d left rotations on the array. Then print the updated array as a 
single line of space-separated integers.

Sample Input

5 4
1 2 3 4 5
Sample Output

5 1 2 3 4
Explanation

When we perform d = 4left rotations, the array undergoes the following sequence of changes:
[1,2,3,4,5] --> [2,3,4,5,1] --> [3,4,5,1,2] --> [4,5,1,2,3] --> [5,1,2,3,4]
Thus, we print the array’s final state as a single line of space-separated values, which is 5 1 2 3 4.

*/
import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'rotateLeft' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     * 1. INTEGER d
     * 2. INTEGER_ARRAY arr
     */

    public static List<Integer> rotateLeft(int d, List<Integer> arr) {
        List<Integer> newList = new ArrayList<>();
        for (int i = 0; i < d; i++) {
            newList.add(arr.get(i));
        }
        for (int i = d - 1; i >= 0; i--) {
            arr.remove(i);
        }
        arr.addAll(newList);
        return arr;
    }
}

public class LeftRotation {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int d = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> result = Result.rotateLeft(d, arr);

        bufferedWriter.write(
                result.stream()
                        .map(Object::toString)
                        .collect(joining(" "))
                        + "\n");

        bufferedReader.close();
        bufferedWriter.close();
    }
}
