import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void advantageCountTest1() {
        int[] nums1 = {2, 7, 11, 15};
        int[] nums2 = {1, 10, 4, 11};
        int[] expected = {2, 11, 7, 15};
        int[] actual = new Solution().advantageCount(nums1, nums2);

        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void advantageCountTest2() {
        int[] nums1 = {12, 24, 8, 32};
        int[] nums2 = {13, 25, 32, 11};
        int[] expected = {24, 32, 8, 12};
        int[] actual = new Solution().advantageCount(nums1, nums2);

        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void advantageCountTest3() {
        int[] nums1 = {2,0,4,1,2};
        int[] nums2 = {1,3,0,0,2};
        int[] expected = {2,0,2,1,4};
        int[] actual = new Solution().advantageCount(nums1, nums2);

        Assert.assertArrayEquals(expected, actual);
    }

}
