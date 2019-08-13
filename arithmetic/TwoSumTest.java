package arithmetic;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TwoSumTest {

	@Test
	void testTwoSum() {
		
		TwoSum obj1 = new TwoSum();
		int[] nums = {9, 4, 3, 12};
		int target = 7;
		
		int[] result = new int [2];
		result = obj1.twoSum(nums, target);
		assertEquals(1, result[0]);
		fail("Not yet implemented");
	}

}
