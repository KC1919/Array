
//Logic

/*
First we find the sum of 1 to N numbers.
Then we sum all the given numbers in the array between 1 to N
Then we subtract the array sum from the sum of 1 to N.
The remainder is the missing number.
 */

//Code
public class missingNum 
{
    int MissingNumber(int array[], int n) 
    {
        int sum = (n * (n + 1)) / 2;
        int s = 0;

        for (int i = 0; i < n - 1; i++)
            s += array[i];

        return (sum - s);
    }
}
