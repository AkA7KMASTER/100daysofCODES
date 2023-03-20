## Problem Statement
A weighted string is a string of lowercase English letters where each letter has a weight. Character weights are 1 to 26 from a to z in serial order.


Given a string, s, let U be the set of weights for all possible uniform contiguous substrings of string s. There will be n queries to answer where each query consists of a single integer. Create a return array where for each query, the value is Yes if query[i] belongs to U. Otherwise, append No.

## Example

s=’abbcccddddd’  
queries = [1,7,5,4,15]  
Working from left to right, weights that exist are:
```
string  weight

a       1
b       2
bb      4
c       3
cc      6
ccc     9
d       4
dd      8
ddd     12
dddd    16
```

Now for each value in queries, see if it exists in the possible string weights. The return array is [‘Yes’, ‘No’, ‘No’, ‘Yes’, ‘No’].

## Function Description

Complete the weightedUniformStrings function in the editor below.  
weightedUniformStrings has the following parameter(s):  
-  string s: a string
-  int queries[n]: an array of integers

## Returns

- string[n]: an array of strings that answer the queries

## Input Format

The first line contains a string s, the original string.  
The second line contains an integer n, the number of queries.  
Each of the next n lines contains an integer queries[i], the weight of a uniform subtring of s that may or may not exist.

## Constraints

- 1 <= lengthofs,n <= 10^5
- 1 <= queries[i] <= 10^7
-  S will only contain lowercase English letters, ascii[a-z].
## Sample Input
```
abccddde
6
1
3
12
5
9
10
```

## Sample Output
```
Yes
Yes
Yes
Yes
No
No
```