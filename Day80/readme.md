### Problem Statement
You are in charge of the cake for a child’s birthday. You have decided the cake will have one candle for each year of their total age. They will only be able to blow out the tallest of the candles. Count how many candles are tallest.

#### **Example**

Candles = [4,4,1,3]

The maximum height candles are 4 units high. There are 2 of them, so return 2.

### Function Description

Complete the function birthdayCakeCandles in the editor below. It must return an integer representing the number of candles she can blow out.

birthdayCakeCandles has the following parameter(s):  
int candles[n]: the candle heights
### Returns

int: the number of candles that are tallest

### Input Format

1. The first line contains a single integer, n , the size of candles[].
2. The second line contains n space-separated integers, where each integer i describes the height of candles[i] .

### Output Format

Return the number of candles that can be blown out on a new line.

### Sample Input
```
4
3 2 1 3
```
### Sample Output
```
2
```
### Explanation

Candle heights are[3,2,1,3] . The tallest candles are 3 units, and there are of 2 of them.