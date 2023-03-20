//program to reverse each word in the given sentence
import java.util.*;
public class ReverseWord {
  static void reverseWordInMyString(String str) {
    String[] words = str.split(" ");
    String reversedString = "";
    for (int i = 0; i < words.length; i++) {
      String word = words[i];
      String reverseWord = "";
      //reversing word and concatinating each word in its order
      for (int j = word.length() - 1; j >= 0; j--) {
        reverseWord = reverseWord + word.charAt(j);
      }
      reversedString = reversedString + reverseWord + " ";
    }
    System.out.println("\nString reversed: ");
    System.out.println(reversedString);
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a string: "); //taking user input for the sentence
    String str = sc.nextLine();
    reverseWordInMyString(str);
    sc.close();
  }
}
