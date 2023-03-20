### Problem Statement 
Given pointers to the head nodes of 2 linked lists that merge together at some point, find the node where the two lists merge. The merge point is where both lists point to the same node, i.e. they reference the same memory location. It is guaranteed that the two head nodes will be different, and neither will be NULL. If the lists share a common node, return that node's data value.  

### Function Description

Complete the findMergeNode function in the editor below.  
findMergeNode has the following parameters:  
->SinglyLinkedListNode pointer head1: a reference to the head of the first list  
->SinglyLinkedListNode pointer head2: a reference to the head of the second list  

### Returns

int: the data value of the node where the lists merge  

### Sample Input

The diagrams below are graphical representations of the lists that input nodes head1 and head2 are connected to.  

### Test Case 0
````
 1
  \
   2--->3--->NULL
  /
 1
 ````

### Test Case 1
````
1--->2
      \
       3--->Null
      /
     1
````

### Sample Output
````
2
3
````

### Explanation

Test Case 0: As demonstrated in the diagram above, the merge node's data field contains the integer 2.  
Test Case 1: As demonstrated in the diagram above, the merge node's data field contains the integer 3.  
