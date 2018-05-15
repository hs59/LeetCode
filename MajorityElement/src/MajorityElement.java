import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 *  Given an array of size n, find the majority element. The majority element is the element that
 *  appears more than n/2 times. You may assume that the array is non-empty and the majority element always exist in the array.
 */
public class MajorityElement {
    // Brute force - pretty slow due to sorting
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }

    // Faster than brute force
    public int majorityElement2(int[] nums) {
        Map<Integer, Integer> hashMap = new HashMap<>();
        int number =0;
        for (int num: nums) {
            if (!hashMap.containsKey(num)) {
                hashMap.put(num, 1);
            } else {
                hashMap.put(num, hashMap.get(num) + 1);
            }
            if (hashMap.get(num)>nums.length/2) {
                number = num;
                break;
            }
        }
        return number;
    }

    public static void main (String[] args) {
        int[] nums = new int[] {2,2,1,1,1,2,2};
        MajorityElement test = new MajorityElement();
        test.majorityElement(nums);
        test.majorityElement2(nums);
    }
}
