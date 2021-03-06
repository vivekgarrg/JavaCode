import java.util.*;
class Solution {
    public int countPrimes(long n) {
        if(n<=1)
            return 0;
        
        int count = 0;
        
          ArrayList<Boolean> isPrime =  new ArrayList<Boolean>();
        
        for(int i=0; i<n; i++)
        {
            isPrime.add(true);
        }
        isPrime.set(0,false);
        isPrime.set(1,false);
        
        for(int i=2; i<n; i++)
        {
            if(isPrime.get(i)==true)
            {
                for(int j=i*i; j<n; j+=i)
                {
                    isPrime.set(j,false);
                }
            }
        }
        
        for(Boolean i:isPrime){
            if(i==true)
                count++;
        }
        
        return count;
    }
}

public class primeNumber{
	public static void main(String[] args) {
    Solution s =new Solution();
   int n =  s.countPrimes(100);
   System.out.println(n);
	}
}