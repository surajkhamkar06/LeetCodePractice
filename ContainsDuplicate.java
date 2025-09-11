package package1;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate
{
	public static boolean containsDuplicate(int[] nums)
	{
        Set<Integer> seen = new HashSet<>();

        for (int num : nums) {
            if (seen.contains(num)) {
                return true; // Duplicate found
            }
            seen.add(num);
        }

        return false; 
	}

}
