/*
In this proram to count the number of occurrences of any two vowels in succession in a line of text.
For example, in the sentence “Pleases read this application and give me gratuity ” 
such occurrences are ea, ea, ui.


*/
import java.util.*;
public class CountRepeatingVowels {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter your sentence:");
    String s1 = s.nextLine();
    s.close();
    int count = 0;
    char ch[] = new char[s1.length()];
    for (int i = 0; i < s1.length(); i++) {
      ch[i] = s1.charAt(i);
    }
    for (int i = 0; i < s1.length(); i++) {
      if (isVowels(ch[i]) && isVowels(ch[i + 1])) {
        count++;
      }
    }
    System.out.println("Total count:" + count);
  }

  static Boolean isVowels(char c) {
    if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
      return true;
    } else {
      return false;
    }
  }
}

