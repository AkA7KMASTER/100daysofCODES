### Problem Statement
Louise joined a social networking site to stay in touch with her friends. The signup page required her to input a name and a password. However, the password must be strong. The website considers a password to be strong if it satisfies the following criteria:

Its length is at least 6.  
It contains at least one digit.  
It contains at least one lowercase English character.  
It contains at least one uppercase English character.  
It contains at least one special character. The special characters are: !@#$%^&*()-+  

She typed a random string of length n in the password field but wasn’t sure if it was strong. Given the string she typed, can you find the minimum number of characters she must add to make her password strong?

Note: Here’s the set of types of characters in a form you can paste in your solution:
```
numbers = “0123456789”
lower_case = “abcdefghijklmnopqrstuvwxyz”
upper_case = “ABCDEFGHIJKLMNOPQRSTUVWXYZ”
special_characters = “!@#$%^&*()-+”
```

### Function Description

Complete the minimumNumber function in the editor below.

minimumNumber has the following parameters:

1. int n: the length of the password
2. string password: the password to test
### Returns

1. int: the minimum number of characters to add
### Input Format

The first line contains an integer n, the length of the password.

The second line contains the password string. Each character is either a lowercase/uppercase English alphabet, a digit, or a special character.

###  Constraints

1<=n<=100    
All characters in password are in [a-z], [A-Z], [0-9], or [!@#$%^&*()-+ ].

### Sample Input
```
3

Ab1
 ```

### Sample Output
```
3
```

### Explanation

She can make the password strong by adding 3 characters, for example, $hk, turning the password into Ab1$hk which is strong.

2 characters aren’t enough since the length must be at least 6.

