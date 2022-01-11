
//Logic

/*
First we find the factorial of the largest number among the given numbers.
while finding the factorial we keep on storing the factorial of every number between 1 to Max number,
and keep on storing it in the hashmap
And then we iterate over the given numbers, we fetch the factorial of the current number
from the hashmap and store in the ans array.

This saves us from calculating the factorial for every number again and again by running the loop
hence it reduces the time complexity.
 */

//Code
import java.util.HashMap;
public class largeFactorial {
    public long[] factorial(long a[], int n) {
        long ans[]=new long[n];
        
        long max=0;
        
        for(int i=0;i<n;i++)
        {
            max=Math.max(max,a[i]);
        }
        
        HashMap<Long,Long>hm=new HashMap<>();
        
        factorial(max,hm);
        
        for(int i=0;i<n;i++)
        {
            if(a[i]==0)
            ans[i]=1;
            
            else if(hm.containsKey(a[i]))
            {
                ans[i]=hm.get(a[i]);
            }
        }
        
        return ans;
    }
    
    public void factorial(long n, HashMap<Long,Long>hm)
    {
        int mod=1000000007;
        long fact=1;
        for(long i=1;i<=n;i++)
        {
            fact*=i;
            fact=fact%mod;
            hm.put(i,fact);
        }
    }
}