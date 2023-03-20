import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'equalStacks' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     * 1. INTEGER_ARRAY h1
     * 2. INTEGER_ARRAY h2
     * 3. INTEGER_ARRAY h3
     */

    public static int equalStacks(List<Integer> h1, List<Integer> h2, List<Integer> h3) {
        // Write your code here
        int cap1 = 0;
        int cap2 = 0;
        int cap3 = 0;

        for (int i : h1) {
            cap1 += i;
        }

        for (int i : h2) {
            cap2 += i;
        }

        for (int i : h3) {
            cap3 += i;
        }

        int i = 0;
        int j = 0;
        int k = 0;
        while ((cap1 == cap2 && cap2 == cap3) != true) {
            int min = Math.min(cap1, Math.min(cap2, cap3));

            if (cap1 > min && i < h1.size()) {
                cap1 -= h1.get(i);
                i++;
            }

            if (cap2 > min && j < h2.size()) {
                cap2 -= h2.get(j);
                j++;
            }

            if (cap3 > min && k < h3.size()) {
                cap3 -= h3.get(k);
                k++;
            }
        }

        return cap1;
    }

}

public class EqualStacks {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> h1 = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> h2 = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> h3 = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = Result.equalStacks(h1, h2, h3);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
