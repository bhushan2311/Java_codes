package DSA;

public class DifferenceArray_technique {
    public static int[] rangeUpdate(int n, int[][] operations) {
        int[] diff = new int[n + 1]; // Difference array with one extra element

        // Apply operations using the difference array
        for (int[] op : operations) {
            int start = op[0];
            int end = op[1];
            int value = op[2];

            // Increment the start index
            diff[start] += value;
            // Decrement the element after the end index (no need for extra check)
            diff[end + 1] -= value;
        }

        // Compute the final result using prefix sum
        int[] result = new int[n];
        result[0] = diff[0];
        for (int i = 1; i < n; i++) {
            result[i] = result[i - 1] + diff[i];
        }

        return result;
    }

    public static void main(String[] args) {

        // Test case
        int n = 6;
        int[][] operations = {
                {1, 3, 5},  // Add 5 to range [1, 3]
                {2, 4, 10}, // Add 10 to range [2, 4]
                {0, 2, 20}  // Add 20 to range [0, 2]
        };

        int[] result = rangeUpdate(n, operations);

        // Print the final array after all operations
        for (int val : result) {
            System.out.print(val + " ");
        }
    }
}
