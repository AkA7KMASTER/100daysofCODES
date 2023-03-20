import java.util.*;
class Queue {
    static Scanner sc = new Scanner(System.in);
    int len = 5;
    int items[] = new int[len];
    int front = -1;
    int rear = -1;
   
    boolean isFull(){           //checks if the queue is full or not
        if(rear == len - 1){
            return true;
        } else {
            return false;
        }
    }
   
    boolean isEmpty(){          //checks if the queue is empty or not
        if(front == -1 && rear == -1){
            return true;
        } else {
            return false;
        }
    }
   
    void enqueue() {            //inserts new element from the rear
        if(isFull()){
            System.out.println("Queue is full, Overflow condition");
        } else if(front == -1 && rear == -1){
            front = rear = 0;
            System.out.println("Enter value of the element");
            int itemValue = sc.nextInt();
            items[rear] = itemValue;
        } else{
            rear++;
            System.out.println("Enter value of the element");
            int itemValue = sc.nextInt();
            items[rear] = itemValue;
        }
    }
   
    void dequeue(){             //delete element from the front
        if(isEmpty()){
            System.out.println("Queue is empty. Nothing to dequeue. Underflow condition!!");
        } else if (front == rear){
            front = rear = -1;
        } else {
            front++;
        }
    }
   
    void display(){             //it prints all the element of the queue
        int i;
        if(isEmpty()){
            System.out.println("Queue is empty, underflow condition!!");
        } else {
            for(i = front; i <= rear; i++){
                System.out.print(items[i]);
            }
        }
    }
   
    void peek(){                //prints the first element of the queue
        System.out.println("Element in the first index is: " + items[front]);
    }
   
  }
public class QueueUsingArray{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Queue obj = new Queue();
        while(true){
            System.out.println("\n1.Enqueue\n2.Dequeue\n3.Front\n4.Display\n5.Exit");
            int choice = sc.nextInt();
            switch(choice){
                case 1:
                    obj.enqueue();
                    break;
                case 2:
                    obj.dequeue();
                    break;
                case 3:
                    obj.peek();
                    break;
                case 4:
                    obj.display();
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Enter Valid Choice");
            }
        }
        
    }
}