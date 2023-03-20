import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;

class Result {

    /*
     * Complete the 'absolutePermutation' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER k
     */

    public static List<Integer> absolutePermutation(int n, int k) {
    // Write your code here
        List<Integer> inputList = new ArrayList<>();
        inputList.add(-1);

        if (k != 0 && ((n / 2) % k) != 0) {
            return inputList;
        }

        int substitute = k;

        for (int index = 1; index < 2 * k + 1; index++) {
            inputList.add(index, index + substitute);

            if (inputList.get(index) == 2 * k && index <= n + 1) {
                substitute -= (2 * substitute);
            }
        }

        int targetIndex;
        for (int index = (2 * k + 1); index < n + 1; index++) {
            if ((2 * k) == 0) {
                inputList.add(index, index);
            } else {
                targetIndex = index - (2 * k);

                inputList.add(index, inputList.get(targetIndex) + (2 * k));
            }
        }
        inputList.remove(0);

        return inputList;
    }

}

public class AbsolutePermutation {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

                int n = Integer.parseInt(firstMultipleInput[0]);

                int k = Integer.parseInt(firstMultipleInput[1]);

                List<Integer> result = Result.absolutePermutation(n, k);

                bufferedWriter.write(
                    result.stream()
                        .map(Object::toString)
                        .collect(joining(" "))
                    + "\n"
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
