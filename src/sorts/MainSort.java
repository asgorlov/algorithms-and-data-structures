package sorts;

import utils.ArrayUtil;

/**
 * @author ango1019
 * Date: 25.03.2020
 * Time: 13:22
 */
public class MainSort {

    public static void main(String[] args) {
        int size = 10;

        System.out.println("BubbleSort");
        int[] arr = ArrayUtil.getRandomArray(size);
        ArrayUtil.printArray(arr);
        BubbleSort.sort(arr);
        ArrayUtil.printArray(arr);

        System.out.println("SelectSort");
        arr = ArrayUtil.getRandomArray(size);
        ArrayUtil.printArray(arr);
        SelectSort.sort(arr);
        ArrayUtil.printArray(arr);

        System.out.println("InsertionSort");
        arr = ArrayUtil.getRandomArray(size);
        ArrayUtil.printArray(arr);
        InsertionSort.sort(arr);
        ArrayUtil.printArray(arr);
    }
}