import java.io.*;
import java.util.*;
import java.util.stream.*;

class Result {

    /*
     * Complete the 'biggerIsGreater' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING w as parameter.
     */

    public static String biggerIsGreater(String w) {
        // start with second to last character then go backwards
        for (int i = w.length() - 2; i >= 0; i--) {
            char lChar = w.charAt(i);

            // the substring is the string after
            // the character you are looking at
            String subS = w.substring(i + 1, w.length());

            // you need to sort the substring to
            // find the first character over
            char[] subStrA = subS.toCharArray();
            Arrays.sort(subStrA);
            for (int j = 0; j < subS.length(); j++) {
                char eChar = subStrA[j];

                // once (if) you find this character
                // the rest of the string needs to
                // be sorted in alpha order to
                // achieve the least over.
                if (lChar < eChar) {
                    StringBuilder begining = new StringBuilder(w.substring(0, i + 1));
                    begining.replace(i, i + 1, String.valueOf(eChar));

                    subStrA[j] = lChar;
                    Arrays.sort(subStrA);

                    return begining.toString() + String.valueOf(subStrA);
                }
            }
        }
        return "no answer";
    }

}

public class Bigger {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int T = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, T).forEach(TItr -> {
            try {
                String w = bufferedReader.readLine();

                String result = Result.biggerIsGreater(w);

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
