import java.util.ArrayList;
import java.util.Scanner;

public class SegmentedSieve {
    // Method to generate all primes up to sqrt(high)
    public static ArrayList<Integer> simpleSieve(int limit) {
        boolean[] mark = new boolean[limit + 1];
        for (int i = 0; i <= limit; i++)
            mark[i] = true;

        for (int p = 2; p * p <= limit; p++) {
            if (mark[p] == true) {
                for (int i = p * p; i <= limit; i += p)
                    mark[i] = false;
            }
        }

        ArrayList<Integer> primes = new ArrayList<>();
        for (int p = 2; p <= limit; p++) {
            if (mark[p] == true)
                primes.add(p);
        }

        return primes;
    }

    // Method to generate primes within a range
    public static ArrayList<Integer> generatePrime(int high) {
        int limit = (int) Math.sqrt(high) + 1;
        ArrayList<Integer> primes = simpleSieve(limit);
        return primes;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the lower bound of the range:");
        int low = sc.nextInt();
        System.out.println("Enter the upper bound of the range:");
        int high = sc.nextInt();
        sc.close();

        ArrayList<Integer> al = generatePrime(high);

        boolean[] dummy = new boolean[high - low + 1];
        for (int i = 0; i < high - low + 1; i++) {
            dummy[i] = true;
        }

        for (int prime : al) {
            int firstMultiple = (low / prime) * prime;
            if (firstMultiple < low) {
                firstMultiple = firstMultiple + prime;
            }
            int start = Math.max(firstMultiple, prime * prime);
            for (int j = start; j <= high; j += prime) {
                dummy[j - low] = false;
            }
        }

        for (int i = low; i <= high; i++) {
            if (dummy[i - low] == true)
                System.out.print(i + " ");
        }
    }
}
