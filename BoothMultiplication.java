public class BoothMultiplication {

    // Perform Booth's Algorithm
    public static long boothMultiply(int multiplicand, int multiplier) {
        int n = 32; // number of bits
        int A = 0;  // Accumulator
        int Q = multiplier; // Multiplier
        int M = multiplicand; // Multiplicand
        int Q_1 = 0; // Extra bit (Q-1)

        // Loop for n times (bit length)
        for (int i = 0; i < n; i++) {
            int lastQ = Q & 1; // Least significant bit of Q

            // Step 1: Check (Q0, Q-1)
            if (lastQ == 1 && Q_1 == 0) {
                A = A - M; // A = A - M
            } else if (lastQ == 0 && Q_1 == 1) {
                A = A + M; // A = A + M
            }

            // Step 2: Arithmetic right shift (A, Q, Q-1)
            int msbA = (A >> 31) & 1; // sign bit of A

            // Shift Q and Q-1
            Q_1 = Q & 1;
            Q = (A << 31) | (Q >>> 1); // Shift Q right, bring in A's LSB
            A = (A >> 1); // Arithmetic shift A

            // Preserve sign bit during A shift
            if (msbA == 1) {
                A |= (1 << 31);
            } else {
                A &= ~(1 << 31);
            }
        }

        // Combine A (high 32 bits) and Q (low 32 bits) into 64-bit result
        return (((long) A) << 32) | (Q & 0xFFFFFFFFL);
    }

    public static void main(String[] args) {
        int multiplicand = -7;
        int multiplier = 3;

        long product = boothMultiply(multiplicand, multiplier);

        System.out.println(multiplicand + " × " + multiplier + " = " + product);
    }
}
