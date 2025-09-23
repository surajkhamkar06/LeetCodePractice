package package1;

import java.util.HashSet;
import java.util.Set;

class Solution 
{
    public boolean isHappy(int n)
    {
        Set<Integer> hs = new HashSet<>();

        while(!hs.contains(n))
        {
            hs.add(n);

            int sqrSum = 0;

            while(n != 0)
            {
                int rem = n % 10;
                sqrSum = sqrSum + rem * rem;
                n = n/10;
            }
            if(sqrSum == 1)
            {
                return true;
            }
            else
            {
                n = sqrSum;
            }
        }
        return false;    
    }
}