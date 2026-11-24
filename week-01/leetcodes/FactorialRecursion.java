import java .util .Scanner;

public class FactorialRecursion {
    
    static long factorial(int n) {
        if (n <= 1) {
            return 1; // Base case
        }
        return n * factorial(n - 1); 
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number (n): ");
        int n = sc.nextInt();

        System.out.println("Factorial of " + n + " is: " + factorial(n));
        sc.close();
    }
}
