
public class Main {

    public static void main(String[] args) {

        int[] nums = {3, 0, 1};

        int n = nums.length;
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {

            sum = sum + nums[i];
        }

        int total = n * (n + 1) / 2;

        int missing = total - sum;

        System.out.println("Missing Number: " + missing);
    }
}
