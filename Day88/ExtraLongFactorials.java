import java.io.*;
import java.math.*;

class Result {

    /*
     * Complete the 'extraLongFactorials' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static void extraLongFactorials(int n) {
    // Write your code here
    int currentFactor = n;
    BigInteger answer = new BigInteger("1");
    while (currentFactor != 0) {
        answer = answer.multiply(BigInteger.valueOf(currentFactor));
        currentFactor--;
    }
    System.out.println(answer);
    }

}

public class ExtraLongFactorials {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        Result.extraLongFactorials(n);

        bufferedReader.close();
    }
}
