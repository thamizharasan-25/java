public class Mergesort {

    // Recursive merge sort function to divide the array
    public static void merge_sort(int arr[], int l, int r) {
        if (l < r) {
            int mid = (l + r) / 2;

            // Sort left half
            merge_sort(arr, l, mid);

            // Sort right half
            merge_sort(arr, mid + 1, r);

            // Merge sorted halves
            merge(arr, l, mid, r);
        }
    }

    // Function to merge two sorted subarrays
    public static void merge(int arr[], int l, int mid, int r) {
        // Find sizes of the two subarrays
        int n1 = mid - l + 1;
        int n2 = r - mid;

        // Create temp arrays
        int larr[] = new int[n1];
        int rarr[] = new int[n2];

        // Copy data to temp arrays
        for (int x = 0; x < n1; x++) {
            larr[x] = arr[l + x];
        }
        for (int x = 0; x < n2; x++) {
            rarr[x] = arr[mid + 1 + x];
        }

        // Merge temp arrays back into arr[l..r]
        int i = 0; // Initial index of left array
        int j = 0; // Initial index of right array
        int k = l; // Initial index of merged array

        while (i < n1 && j < n2) {
            if (larr[i] <= rarr[j]) {
                arr[k] = larr[i];
                i++;
            } else {
                arr[k] = rarr[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of larr (if any)
        while (i < n1) {
            arr[k] = larr[i];
            i++;
            k++;
        }

        // Copy remaining elements of rarr (if any)
        while (j < n2) {
            arr[k] = rarr[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        int arr[] = {9, 5, 2, 6, 4, 1, 3, 7, 8};

        // Start merge sort on entire array
        merge_sort(arr, 0, arr.length - 1);

        // Print sorted array
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}

/*Left:  [9, 5, 2, 6]
Right: [4, 1, 3, 7, 8]

→ Left further splits:
  [9, 5] → [9], [5]
  [2, 6] → [2], [6]

→ Right further splits:
  [4, 1] → [4], [1]
  [3, 7, 8] → [3], [7, 8] → [7], [8]

✅ Merging [9] and [5] → [5, 9]
✅ Merging [2] and [6] → [2, 6]
✅ Merging [5, 9] and [2, 6] → [2, 5, 6, 9]
✅ Merging [4] and [1] → [1, 4]
✅ Merging [7] and [8] → [7, 8]
✅ Merging [3] and [7, 8] → [3, 7, 8]
✅ Merging [1, 4] and [3, 7, 8] → [1, 3, 4, 7, 8]


[2, 5, 6, 9] and [1, 3, 4, 7, 8] → merge step-by-step
→ Final sorted array: [1, 2, 3, 4, 5, 6, 7, 8, 9]
  */