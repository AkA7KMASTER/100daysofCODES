import java.util.*;
class Stack {
  int top = -1;
  int stk[] = new int[100];

  boolean empty() {
    if (top >= 0) {
      return false;
    } else {
      return true;
    }
  }
//peek operation is used for displaying topmost element of the stack
  int peek() {
    if (empty()) {
      System.out.println("\n Stack is empty");
      return 0;
    } else {
      System.out.println("\n The top most position of stack holds " + stk[top]);
      return stk[top];
    }
  }
//push operation inserts a new data in the top of the stack
  void push(int num) {
    if (top == 100) {
      System.out.println("\n Stack is in overflow state");
    } else {
      stk[++top] = num;
      System.out.println("\n " + num + " is inserted in stack");
    }
  }
//pop operation deletes the topmost element of the stack
  int pop() {
    if (top < 0) {
      System.out.println("\n Stack is in underflow state");
      return 0;
    } else {
      int x = stk[top--];
      System.out.println("\n " + x + " is been removed from stack");
      return x;
    }
  }
//display operation prints all the stack elements
  void disp() {
    if (empty()) {
      System.out.println("\nStack is empty");
    } else {
      System.out.print("\nStack : ");
      for (int i = 0; i <= top; i++) {
        System.out.print(" | " + stk[i]);
      }
    }
  }
}

class StackUsingArray {

  public static void main(String[] agrs) {
    boolean flag = true;
    Scanner in = new Scanner(System.in);
    int o, num;
    Stack s = new Stack();
    while (flag) {
      System.out.println(
        "\n1. PUSH\n2. PEEK\n3. POP\n4. DISPLAY\n5. QUIT\nSelect one operation : "
      );
      o = in.nextInt();
      switch (o) {
        case 1:
          System.out.println(" Enter a number you want to insert in stack : ");
          num = in.nextInt();
          s.push(num);
          break;
        case 2:
          s.peek();
          break;
        case 3:
          s.pop();
          break;
        case 4:
          s.disp();
          break;
        case 5:
          flag = false;
          break;
      }
    }
  }
}
