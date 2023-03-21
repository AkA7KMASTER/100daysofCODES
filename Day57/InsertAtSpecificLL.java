/*
Problem Statement
You’re given the pointer to the head node of a linked list, an integer to add to the list and the position at which the
integer must be inserted. Create a new node with the given integer, insert this node at the desired position and return 
the head node.

A position of 0 indicates head, a position of 1 indicates one node away from the head and so on. The head pointer given 
may be null meaning that the initial list is empty.

As an example, if your list starts as 1 -> 2 -> 3 and you want to insert a node at
position = 2
data = 4
your new list should be 1 -> 2 -> 4 -> 3 .

Sample Input
3
16
13
7
1
2
Sample Output
16 13 1 7

Explanation
The initial linked list is 16 13 7. We have to insert at the position which currently has in it. The updated linked list will be 16 13 1 7.

*/
import java.io.*;
import java.util.stream.*;

class SinglyLinkedListNode {
    public int data;
    public SinglyLinkedListNode next;

    public SinglyLinkedListNode(int nodeData) {
        this.data = nodeData;
        this.next = null;
    }
}

class SinglyLinkedList {
    public SinglyLinkedListNode head;
    public SinglyLinkedListNode tail;

    public SinglyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void insertNode(int nodeData) {
        SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

        if (this.head == null) {
            this.head = node;
        } else {
            this.tail.next = node;
        }

        this.tail = node;
    }
}

class SinglyLinkedListPrintHelper {
    public static void printList(SinglyLinkedListNode node, String sep, BufferedWriter bufferedWriter) throws IOException {
        while (node != null) {
            bufferedWriter.write(String.valueOf(node.data));

            node = node.next;

            if (node != null) {
                bufferedWriter.write(sep);
            }
        }
    }
}

class Result {

    /*
     * Complete the 'insertNodeAtPosition' function below.
     *
     * The function is expected to return an INTEGER_SINGLY_LINKED_LIST.
     * The function accepts following parameters:
     *  1. INTEGER_SINGLY_LINKED_LIST llist
     *  2. INTEGER data
     *  3. INTEGER position
     */

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */

    public static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode llist, int data, int position) {
    // Write your code here
        SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);
        if (position == 0) {
            newNode.next = llist;
            return newNode;
        }
        SinglyLinkedListNode current = llist;
        for (int i = 0; i < position-1; i++) {
            current = current.next;
        }
        newNode.next = current.next;
        current.next = newNode;
        return llist;

    }

}

public class InsertAtSpecificLL {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        SinglyLinkedList llist = new SinglyLinkedList();

        int llistCount = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, llistCount).forEach(i -> {
            try {
                int llistItem = Integer.parseInt(bufferedReader.readLine().trim());

                llist.insertNode(llistItem);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int data = Integer.parseInt(bufferedReader.readLine().trim());

        int position = Integer.parseInt(bufferedReader.readLine().trim());

        SinglyLinkedListNode llist_head = Result.insertNodeAtPosition(llist.head, data, position);

        SinglyLinkedListPrintHelper.printList(llist_head, " ", bufferedWriter);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
