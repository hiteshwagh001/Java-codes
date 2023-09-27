public class PrimeNumbersPattern {
    public static void main(String[] args) {
        int maxPrime = 120;
        int[][] primeRows = generatePrimeRows(maxPrime);

        // Print the prime numbers pattern
        System.out.println("Prime Numbers Pattern:");
        for (int[] row : primeRows) {
            for (int prime : row) {
                System.out.print(prime + " ");
            }
            System.out.println();
        }
    }

    // Generate rows of prime numbers based on the specified criteria
    private static int[][] generatePrimeRows(int maxPrime) {
        int[] row1 = new int[4];  // Single-digit primes
        int[] row2 = new int[11]; // Double-digit primes below 50
        int[] row3 = new int[10]; // Double-digit primes above 50
        int[] row4 = new int[5];  // Triple-digit primes below 120

        int row1Max = 10;
        int row2Max = 50;
        int row3Max = 100;
        int row4Max = 120;

        int rowCount1 = 0;
        int rowCount2 = 0;
        int rowCount3 = 0;
        int rowCount4 = 0;

        // Generate prime numbers and distribute them to rows
        for (int num = 2; num <= maxPrime; num++) {
            if (isPrime(num)) {
                if (num < row1Max) {
                    row1[rowCount1++] = num;
                } else if (num < row2Max) {
                    row2[rowCount2++] = num;
                } else if (num < row3Max) {
                    row3[rowCount3++] = num;
                } else if (num < row4Max) {
                    row4[rowCount4++] = num;
                }
            }
        }

        // Create a jagged array with the populated rows
        int[][] primeRows = { row1, row2, row3, row4 };

        return primeRows;
    }

    // Check if a number is prime
    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
