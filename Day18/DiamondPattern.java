/*
Program to print the below given pattern
   *  
  *** 
 *****  
******* 
 *****  
  ***   
   *  
*/
public class DiamondPattern {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int space = 1; space <= (4 - i); space++)
                System.out.print(" ");

            for (int j = 1; j <= i; j++)
                System.out.print("*");

            for (int j = 2; j <= i; j++)
                System.out.print("*");

            System.out.println(" ");
        }
        for (int i = 3; i >= 1; i--) {
            for (int space = 1; space <= (4 - i); space++)
                System.out.print(" ");

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 2; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
