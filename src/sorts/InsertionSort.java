package sorts;

/**
 * @author ango1019
 * Date: 24.03.2020
 * Time: 16:47
 */
public class InsertionSort {

    public static void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i;
            while (j > 0 && arr[j - 1] >= temp) {
                arr[j] = arr[j - 1];
                --j;
            }
            arr[j] = temp;
        }
    }
}