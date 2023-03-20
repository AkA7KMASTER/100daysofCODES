//program to count occurence of a word from a sentence

import java.util.*;
public class CountWordOccurence {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a sentence: ");
    String string = sc.nextLine();
    System.out.println("Enter any string to count its occurences: ");
    String word = sc.nextLine();
    //Seperating words on the basis of space and storing it in temporary array
    String temp[] = string.split(" ");
    int count = 0;
    //checking the occurence
    for (int i = 0; i < temp.length; i++) {
      if (word.equals(temp[i])){
        count++;
      }
    }

    sc.close();
    System.out.println(
      "\nThe word `" + word + "` occurs " + count + " times in the above string"
    );
  }
}
