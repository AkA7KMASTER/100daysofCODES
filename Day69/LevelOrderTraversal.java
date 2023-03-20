import java.util.*;

class Node {
    Node left;
    Node right;
    int data;
    
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

public class LevelOrderTraversal {

	/* 
    
    class Node 
    	int data;
    	Node left;
    	Node right;
	*/
    public static void levelOrder(Node root) {
        int h = height(root);
        for (int i = 1; i <= h + 1; i++) {
            printCurrentLevelNodes(root, i);
        }

    }
    
    public static int height(Node root) {
        if (root == null) return -1;
        int l = height(root.left);
        int r = height(root.right);
        return Math.max(l, r) + 1;
    }

    static void printCurrentLevelNodes(Node root, int level) {
        if (root == null) return;
        if (level == 1) {
            System.out.print(root.data + " ");
        } else if (level > 1) {
            printCurrentLevelNodes(root.left, level - 1);
            printCurrentLevelNodes(root.right, level - 1);
        }
    }

	public static Node insert(Node root, int data) {
        if(root == null) {
            return new Node(data);
        } else {
            Node cur;
            if(data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        Node root = null;
        while(t-- > 0) {
            int data = scan.nextInt();
            root = insert(root, data);
        }
        scan.close();
        levelOrder(root);
    }	
}