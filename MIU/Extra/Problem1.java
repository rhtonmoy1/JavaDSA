package MIU.Extra;

public class Problem1 {
    static int[] removeDuplicates(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n]; // Temporary array to store non-duplicate elements
        int ansSize = 0; // Counter for the size of the ans array

        // Loop through the input array to find non-duplicate elements
        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;

            // Check if the current element already exists in the ans array
            for (int j = 0; j < ansSize; j++) {
                if (arr[i] == ans[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            // If not a duplicate, add it to the ans array
            if (!isDuplicate) {
                ans[ansSize] = arr[i];
                ansSize++;
            }
        }

        // Create the result array with the correct size
        int[] result = new int[ansSize];

        // Copy elements from the ans array to the result array
        for (int i = 0; i < ansSize; i++) {
            result[i] = ans[i];
        }

        return result;
    }

    static void arrPrint(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 3, 4, 2, 5};
        int[] x = removeDuplicates(arr);
        arrPrint(x);
    }
}
