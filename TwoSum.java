package package1;

import java.util.Vector;

public class TwoSum
{
	public static void main(String[] args) 
	{
		int[] nums = {2, 7, 11, 15};
        int target = 9;
        
       // int arr[] = new int[2];
        
        Vector<Integer> result = new Vector<Integer>();
        
        for(int i=0; i<nums.length; i++)
        {
        	for(int j=i+1; j<nums.length; j++)
        	{
        		if(nums[i]+nums[j]==target)
        		{
        			result.add(i);
        			result.add(j);
        			break;
        		}
        	}
        }
        System.out.println(result);
		
	}
	

}
