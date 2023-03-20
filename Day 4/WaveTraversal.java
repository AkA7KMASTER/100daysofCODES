/*
Question: https://www.pepcoding.com/resources/online-java-foundation/2d-arrays/wakanda-1-official/ojquestion
Sample Input:
1 2 3
4 5 6
7 8 9
Expected output:
1 4 7 8 5 2 9 6 3
*/
import java.util.*;
public class WaveTraversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //taking user input for 2d array
        System.out.println("Enter row size:");
        int n = sc.nextInt();
        System.out.println("Enter column size:");
        int m = sc.nextInt();
        int [][] arr = new int[n][m];
        System.out.println("Enter elements for the array:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        //logic
        for (int i = 0; i < arr.length; i++) {
            if(i%2==0){
                for (int j = 0; j < arr.length; j++) {
                    System.out.print(arr[j][i]+" ");
                }
            }
            else{
                for (int j = arr.length-1 ; j >= 0 ; j--) {
                    System.out.print(arr[j][i]+" ");
                }
            }
        }
        sc.close();
    }
}
