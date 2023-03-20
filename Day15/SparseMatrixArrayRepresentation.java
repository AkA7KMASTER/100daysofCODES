import java.util.Scanner;
public class SparseMatrixArrayRepresentation {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the row and column of the sparse matrix:");
        int k = 0;
        int row = sc.nextInt();
        int column = sc.nextInt();
        int[][] sparse = new int[row][column];
        System.out.println("Enter the elements:");
        for (int i = 0; i < row; i++) {
            System.out.println(i + " row elements->");

            for (int j = 0; j < column; j++) {
                System.out.print(j + " column element: ");
                sparse[i][j] = sc.nextInt();

                if (sparse[i][j] != 0) {
                    k++;
                }
            }
        }
        int a[][] = create(k, sparse, row, column);
        System.out.println("Sparse Array Created");
        while (true) {
            System.out.println("1.Insert \n2.Delete \n3.Search \n4.Print \n5.Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    insert(k, sparse, row, column, a);
                    k = k + 1;
                    a = create(k, sparse, row, column);
                    break;
                case 2:
                    delete(a, sparse, row, column, k);
                    System.out.println("New Array is:");
                    k = k - 1;
                    a = create(k, sparse, row, column);
                    break;
                case 3:
                    search(a);
                    break;
                case 4:
                    System.out.println("New Tabular Array is->");
                    print(a);
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Enter Valid Choice");
                    break;
            }
        }
    }
    static void insert(int k, int[][] sparse, int row, int column, int[][] a) {
        System.out.println("Enter the row and column in which u want to insert:");
        int r = sc.nextInt();
        int c = sc.nextInt();
        if (r >= row || c >= column) {
            System.out.println("Array Index out of bound:");
        } else {
            System.out.println("Enter the non zero element:");
            sparse[r][c] = sc.nextInt();
        }
    }
    static int[][] create(int k, int[][] sparse, int row, int column) {
        int r = 0;
        int[][] a = new int[k][3];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (sparse[i][j] != 0) {
                    a[r][0] = i;
                    a[r][1] = j;
                    a[r][2] = sparse[i][j];
                    r++;
                }
            }
        }
        return a;
    }
    static void delete(int[][] a, int[][] sparse, int row, int column, int k) {
        System.out.println("Enter the row and column to delete:");
        int r = sc.nextInt();
        int c = sc.nextInt();
        if (sparse[r][c] == 0) {
            System.out.println("Element is zero");
        } else {
            sparse[r][c] = 0;
            System.out.println("Element deleted");
        }
    }
    static void print(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
    static void search(int[][] a) {
        int flag = 0;
        int i,
        j = 0;
        System.out.println("Enter the element to search:");
        int s = sc.nextInt();

        for (i = 0; i < a.length; i++) {
            for (j = 0; j < 3; j++) {
                if (a[i][j] == s) {
                    flag = 1;
                }
            }
        }
        if (flag == 1) {
            System.out.println("Its present in " + i + " row and " + j + " column of array representation of sparse matrix");
        } else {
            System.out.println("Its not present in the array representation of sparse matrix");
        }
        sc.close();
    }
}