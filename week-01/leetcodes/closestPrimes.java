
public class Main {

    public static int[] closestPrimes(int left, int right) {

        int num1 = -1, num2 = -1;
        int minDiff = Integer.MAX_VALUE;
        int prevPrime = -1;

        for (int i = left; i <= right; i++) {

            boolean prime = true;

            if (i < 2) {
                prime = false;
            } else {
                for (int j = 2; j * j <= i; j++) {
                    if (i % j == 0) {
                        prime = false;
                        break;
                    }
                }
            }

            if (prime) {
                if (prevPrime != -1) {
                    int diff = i - prevPrime;

                    if (diff < minDiff) {
                        minDiff = diff;
                        num1 = prevPrime;
                        num2 = i;
                    }

                    if (minDiff == 2) {
                        break;
                    }
                }

                prevPrime = i;
            }
        }

        return new int[]{num1, num2};
    }

    public static void main(String[] args) {

        int left = 10;
        int right = 19;

        int[] result = closestPrimes(left, right);

        System.out.println(
            "[" + result[0] + ", " + result[1] + "]"
        );
    }
}
