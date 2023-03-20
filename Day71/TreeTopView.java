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

public class TreeTopView {

    /*
     * 
     * class Node
     * int data;
     * Node left;
     * Node right;
     */
    static class Pair {
        public Node node;
        public int dis;

        public Pair(int dis, Node node) {
            this.node = node;
            this.dis = dis;
        }
    }

    public static void topView(Node root) {
        List<Pair> list = new ArrayList<>();
        Map<Integer, Integer> map = new TreeMap<>();

        Pair pair = new Pair(0, root);
        map.put(pair.dis, pair.node.data);
        list.add(pair);

        Node right = root;
        Node left = root;

        while (!list.isEmpty()) {
            pair = list.get(0);
            list.remove(0);
            right = pair.node.right;
            left = pair.node.left;

            if (right != null) {
                Pair p = new Pair(pair.dis + 1, right);
                if (!map.containsKey(p.dis)) {
                    map.put(p.dis, p.node.data);
                }
                list.add(p);
            }
            if (left != null) {
                Pair p = new Pair(pair.dis - 1, left);
                if (!map.containsKey(p.dis)) {
                    map.put(p.dis, p.node.data);
                }
                list.add(p);
            }

        }

        System.out.print(map.values().toString().replaceAll("\\[|\\]|,", ""));

    }

    public static Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        } else {
            Node cur;
            if (data <= root.data) {
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
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        Node root = null;
        while (t-- > 0) {
            int data = sc.nextInt();
            root = insert(root, data);
        }
        sc.close();
        topView(root);
    }
}