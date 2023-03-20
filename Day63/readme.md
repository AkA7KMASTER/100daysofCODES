### Problem Statement
You’re given the pointer to the head node of a sorted linked list, where the data in the nodes is in ascending order. Delete as few nodes as possible so that the list does not contain any value more than once. The given head pointer may be null indicating that the list is empty.  

### Function Description
Complete the removeDuplicates function in the editor below.  

removeDuplicates has the following parameter:  
SinglyLinkedListNode pointer head: a reference to the head of the list  

### Input Format
   
The input is handled by the code in the editor and the format is as follows:  
The first line contains an integer t, denoting the number of test cases. The format for each test case is as follows:  
1. The first line contains an integer n, denoting the number of elements in the linked list.  
2. The next n lines contain an integer each, denoting the data elements of the linked list.  

### Constraints
````
1 <= t <= 10
1<=n <= 1000
1 <= list[i] <= 1000
````

### Sample Input
````
1
5
1
2
2
3
4
````

### Sample Output
````
1 2 3 4 
````

### Explanation

The initial linked list is: 1 -> 2 -> 2 -> 3 -> 4 -> NULL  
The final linked list is: 1 -> 2 -> 3 -> 4 -> NULL  