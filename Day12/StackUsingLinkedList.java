import java.util.*;

class node {
  int data;
  node next;

  node(int data) {
    this.data = data;
    this.next = null;
  }
}

public class StackUsingLinkedList {
  static Scanner sc = new Scanner(System.in);
  static node top = null;

  public static void main(String[] args) {
    while (true) {
      System.out.println("1.Insert \n2.Delete \n3.Print \n4.Exit");
      int choice = sc.nextInt();
      switch (choice) {
        case 1:
          push();
          break;
        case 2:
          pop();
          break;
        case 3:
          display();
          break;
        case 4:
          System.exit(0);
          break;
        default:
          System.out.println("Enter Valid Choice");
          break;
      }
    }
  }

  static void push() {
    System.out.println("Enter value which you want to enter:");
    int num = sc.nextInt();
    node n = new node(num);
    System.out.println(num + " has been added to stack");
    if (top == null) {
      top = n;
      return;
    }
    n.next = top;
    top = n;
    return;
  }

  static void display() {
    node temp = top;
    if (top == null) {
      System.out.println("Stack is empty");
      return;
    }

    System.out.println("Stack:-");
    while (temp != null) {
      System.out.println("| " + temp.data + " |");
      temp = temp.next;
    }
  }

  static void pop() {
    if (top == null) {
      System.out.print("Nothing to delete");
    }
    System.out.println("Top element has been deleted");
    top = top.next;
  }
}
