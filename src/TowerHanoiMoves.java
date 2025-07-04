import java.util.Scanner;
import java.math.BigInteger;

public class TowerHanoiMoves {

    private static BigInteger powerOfTwo(int exp) {
        // Non-recursive: calculates 2^exp using BigInteger
        return BigInteger.valueOf(2).pow(exp);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total number of disks (n): ");
        int n = sc.nextInt();

        System.out.print("Enter disk position i (1 = smallest ... n = largest): ");
        int i = sc.nextInt();

        if (i < 1 || i > n) {
            System.out.println("Error: i must be between 1 and n.");
            return;
        }

        BigInteger moves = powerOfTwo(n - i);
        System.out.printf("Disk %d moves %s time(s) in optimal solution.%n", i, moves.toString());
    }
}
