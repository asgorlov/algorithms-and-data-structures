package sorts;

/**
 * @author ango1019
 * Date: 24.03.2020
 * Time: 14:36
 */
public class BubbleSort {

    public static void sort(int[] arr) {
        for(int i = arr.length - 1; i > 1; i--) {
            for(int j = 0; j < i; j++) {
                if(arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}