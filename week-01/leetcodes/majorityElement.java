
import java.util.ArrayList;

public class Main {

    public static ArrayList<Integer> majorityElement(int[] nums) {

        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {

            boolean alreadyChecked = false;

            for (int k = 0; k < i; k++) {
                if (nums[i] == nums[k]) {
                    alreadyChecked = true;
                    break;
                }
            }

            if (alreadyChecked) {
                continue;
            }

            int count = 0;

            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }

            if (count > nums.length / 3) {
                result.add(nums[i]);
            }
        }

        return result;
    }

    public static void main(String[] args) {

        int[] nums = {3, 2, 3};

        System.out.println(majorityElement(nums));
    }
}
