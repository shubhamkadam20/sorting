
public class insertionSort {

    public static void main(String[] args) {

        int[] arr = {4, 2, 3, 7, 1, 5};

        int n = arr.length;

        for (int i = 1; i < n; i++) {

            int curValue = arr[i];
            int prev = i - 1;

            // Shift greater elements to the right
            while (prev >= 0 && curValue < arr[prev]) {

                arr[prev + 1] = arr[prev];
                prev--;
            }

            // Insert current value at correct position
            arr[prev + 1] = curValue;
        }

        // Print sorted array
        for (int k = 0; k < n; k++) {
            System.out.print(arr[k] + " ");
        }
    }
}
