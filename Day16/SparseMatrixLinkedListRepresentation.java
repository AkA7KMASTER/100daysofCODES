import java.util.Scanner;
class node
{
	node next;
	int row,column,data;
	node(int row,int column,int data)
	{
		this.row=row;
        this.column=column;
        this.data=data;
    }
}
public class SparseMatrixLinkedListRepresentation {
    static Scanner sc=new Scanner(System.in);
	static node head=null;
	public static void main(String[] args) {
		System.out.println("Enter the row and column of the sparse matrix:");
		int row=sc.nextInt();
		int column=sc.nextInt();
		int[][] sparse=new int[row][column];
		System.out.println("Enter the elements:");
		for(int i=0;i<row;i++)
		{
			System.out.println(i+" row elements->");
			for(int j=0;j<column;j++)
			{
				System.out.print(j+" column element: ");
				sparse[i][j]=sc.nextInt();
			}
			System.out.println();
		}
        while (true) {
            System.out.println("\n\n1.Create \n2.Insert \n3.Delete \n4.Search \n5.Print \n6.Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    create(sparse,row,column);
                    break;
                case 2:
                    insert(sparse,row,column);
                    break;
                case 3:
                    delete(sparse,row,column);
                    break;
                case 4:
                    search();
                    break;
                case 5:
					create(sparse,row,column);
                    print();
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("Enter Valid Choice");
                    break;
            }
        }		
	}
	static void create(int[][] sparse,int row,int column)
	{
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				if(sparse[i][j]!=0)
				{
					createnode(i,j,sparse[i][j]);
				}
			}
		}
	}
	static void insert(int[][] sparse,int row,int column)
	{
        
		System.out.println("Enter the row and column for the element to insert:");
		int r=sc.nextInt();
		int c=sc.nextInt();
		if(r>=row||c>=column)
		{
			System.out.println("Array index out of bound");
			return;
		}
		System.out.println("Enter the non zero element");
		sparse[r][c]=sc.nextInt();
		System.out.println("Element Added");
		head=null;
		create(sparse,row,column);
        System.out.println("Element Inserted");
	}
	static void createnode(int row,int column,int data)
	{
		node n=new node(row,column,data);
		if(head==null)
		{
			head=n;
			return;
		}
			node temp=head;	
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=n;
	}
	static void print()
	{
		node temp=head;
		System.out.println("Linked List Representation Of Sparse Matrix");
		while(temp!=null)
		{
			System.out.println(temp.row+" "+temp.column+" "+temp.data);
			temp=temp.next;
		}
	}
	static void search()
	{
		System.out.println("Enter the element to search:");
		int k=sc.nextInt();
		node temp=head;
		while(temp!=null)
		{
			if(temp.data==k)
			{
				System.out.println("Element present at: "+temp.row+" row and "+temp.column+" column in sparse matrix.");
				return;
			}
			temp=temp.next;
		}
	}
	static void delete(int[][] sparse,int row,int column)
	{
		System.out.println("Enter the row and column to delete :");
		int r=sc.nextInt();
		int c=sc.nextInt();
		if(sparse[r][c]==0)
		{
			System.out.println("The value is already zero");
			return;
		}
		else
		{
			sparse[r][c]=0;
			head=null;
			create(sparse,row,column);
		}
        System.out.println("Element Deleted");
        sc.close();
	}
}
