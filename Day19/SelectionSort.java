import java.util.*;
class SelectionSort {
  public static void printArray(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  public static void main(String args[]) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the size of the array");
    int size = sc.nextInt();
    int arr[] = new int[size];
    System.out.println("Enter the values");
    for (int i = 0; i < arr.length; i++) {
        arr[i]=sc.nextInt();
    }

    //selection sort
    for (int i = 0; i < arr.length - 1; i++) {
      int min = i;
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[j] < arr[min]) {
          min = j;
        }
      }
      //swap
      int temp = arr[min];
      arr[min] = arr[i];
      arr[i] = temp;
    }

    printArray(arr);
  }
}
