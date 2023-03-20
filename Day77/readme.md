### Problem Statement
Jesse loves cookies and wants the sweetness of some cookies to be greater than value k . To do this, two cookies with the least sweetness are repeatedly mixed. This creates a special combined cookie with:

sweetness =(1× Least sweet cookie +2× 2nd least sweet cookie).This occurs until all the cookies have a sweetness ≥k.

Given the sweetness of a number of cookies, determine the minimum number of operations required until we have all cookies with sweetness ≥k. If it is not possible, return −1.

### Function Description
Complete the cookies function in the editor below.

cookies has the following parameters:

1. int k: the threshold value
2. int A[n]: an array of sweetness values

### Returns

1. int: the number of iterations required or -1

### Input Format

The first line has two space-separated integers, n and k, the size of A[] and the minimum required sweetness respectively.

The next line contains n space-separated integers, A[i].

### Sample Input
```
STDIN               Function
-----               --------
6 7                 A[] size n = 6, k = 7
1 2 3 9 10 12       A = [1, 2, 3, 9, 10, 12]  
```

Sample Output
```
2
```