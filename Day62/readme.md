### Problem Statement
Given a pointer to the head of a linked list and a specific position, determine the data value at that position. Count backwards from the tail node. The tail is at postion 0, its parent is at 1 and so on.  
  
### Function Description
Complete the getNode function in the editor below.  
  
getNode has the following parameters:  
->SinglyLinkedListNode pointer head: refers to the head of the list  
->int positionFromTail: the item to retrieve  
  
### Returns
int: the value at the desired position  

### Input Format
The first line contains an integer t, the number of test cases.  
  
Each test case has the following format:  
1. The first line contains an integer n, the number of elements in the linked list.  
2. The next n lines contains an integer, the data value for an element of the linked list.  
3. The last line contains an integer positionFromTail, the position from the tail to retrieve the value of.  

### Constraints
````
1 <= t <= 10
1 <= n,m <= 1000
1 <= list[i] <= 1000, where list[i] is the i'th element of the linked list
0 <= positionFromTail < n
````

### Sample Input
````
2
1
1
0
3
3
2
1
2
````

### Sample Output
````
1
3
````

### Explanation

In the first case, there is one element in linked list with a value of 1. The last (only) element contains 1.  
In the second case, the list is 3->2->1->NULL. The element with position of 2 from tail contains 3.  