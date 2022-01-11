/**
 * Given an array of size N, find the smallest positive integer value that cannot be represented as sum of some elements from the array.


Example 1:

Input: 
N = 6
array[] = {1, 10, 3, 11, 6, 15}
Output: 
2
Explanation:
2 is the smallest integer value that cannot 
be represented as sum of elements from the array.
Example 2:

Input: 
N = 3
array[] = {1, 1, 1}
Output: 
4
Explanation: 
1 is present in the array. 
2 can be created by combining two 1s.
3 can be created by combining three 1s.
4 is the smallest integer value that cannot be 
represented as sum of elements from the array.
 */

// Logic

/*
we take variable result, initialize it with 1, as its the smallest positive integer
Then we iterate from the 1st element of the array, we check if the current element
is smaller than the result, then we add that element to the result.
If the result is smaller than the current element then the current result is the smallest 
integer that cannot be formed with the given integers in the array.
 */

//Code
import java.util.*;

public class smallestPos {
    long smallestpositive(long[] array, int n) {
        Arrays.sort(array);

        long result = 1;

        int i = 0;

        while (i < n && array[i] <= result) {
            result = result + array[i];
            i++;
        }
        return result;
    }
}
