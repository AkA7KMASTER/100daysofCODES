import java.util.*;

class node {
  node next;
  int data;
  node(int data) {
    this.data = data;

    this.next = null;
  }
}
public class QueueUsingLinkedList {
  static node front;

  static node back;
static Scanner sc = new Scanner(System.in);
  public static void main(String[] args) {
    

    while (true) {
      System.out.println("1.Insert \n2.Delete \n3.Print \n4.Exit");

      int choice = sc.nextInt();

      switch (choice) {
        case 1:
          insert();

          break;
        case 2:
          delete();

          break;
        case 3:
          print();

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

  static void insert() {
    System.out.println("Enter value which you want to enter:");
    int num = sc.nextInt();
    node n = new node(num);
    System.out.println(num + " has been inserted to Queue");
    if (front == null) {
      front = n;
      back = n;
      return;
    }
    back.next = n;
    back = n;
  }

  static void delete() {
    if (front == null) {
      System.out.println("Queue is Empty");
    }
    System.out.println("-----------------------------");
    System.out.println("Deletion Operation Performed");
    System.out.println("-----------------------------");
    if (front == back) {
      front = null;
      back = null;
      System.out.println("All elements of queue is deleted");
    }
    front = front.next;
  }
  static void print() {
    if (front == null) {
      System.out.println("Queue is Empty");
    }
    node temp = front;
    System.out.println();
    System.out.println("Queue :");
    System.out.println("----------------------");

    while (temp != null) {
      System.out.print("| " + temp.data + " |");
      temp = temp.next;
    }
    System.out.println();
    System.out.println("----------------------");
  }
}
