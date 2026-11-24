
import java.util.HashMap;

public class Main {

    public static long countBadPairs(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        long goodPairs = 0;
        long n = nums.length;

        for (int i = 0; i < nums.length; i++) {

            int key = nums[i] - i;

            if (map.containsKey(key)) {
                goodPairs += map.get(key);
            }

            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        long totalPairs = n * (n - 1) / 2;

        return totalPairs - goodPairs;
    }

    public static void main(String[] args) {

        int[] nums = {4, 1, 3, 3};

        long result = countBadPairs(nums);

        System.out.println("Total Bad Pairs: " + result);
    }
}
