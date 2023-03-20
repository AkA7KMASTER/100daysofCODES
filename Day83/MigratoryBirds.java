import java.util.*;

public class MigratoryBirds {

    static int migratoryBirds(int n, int[] ar) {
        int counter[] = new int[6];
        int result = 1; int max = 0;
        for (int i = 0; i < n; i++) {
            counter[ar[i]]++;
        }

        for (int i = 1; i <= 5; i++) {
            if (counter[i] > max) {
                result = i;
                max = counter[i];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int i = 0; i < n; i++){
            ar[i] = in.nextInt();
        }
        int result = migratoryBirds(n, ar);
        System.out.println(result);
        in.close();
    }
}