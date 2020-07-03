/**
 * @author ango1019
 * Date: 19.03.2020
 * Time: 13:21
 */
public class BinarySearchAlgorithm {

    public static void main(String[] args) {
        int[] arr = new int[20];
        int count = 0;
        System.out.print("{");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = count++;
            if (i != arr.length - 1) {
                System.out.print(arr[i] + ", ");
            } else {
                System.out.print(arr[i]);
            }
        }
        System.out.println("}");

        int searchKey = 5;
        int lowerIndex = 0;
        int upperIndex = arr.length - 1;
        int currentIndex;
        while (true) {
            currentIndex = (lowerIndex + upperIndex) / 2;

            if (arr[currentIndex] == searchKey) {
                System.out.println("Index " + currentIndex + " for searchKey " + searchKey);
                break;
            } else if (lowerIndex > upperIndex) {
                System.out.println("Index not found for searchKey " + searchKey);
                break;
            } else if (arr[currentIndex] < searchKey){
                lowerIndex = currentIndex + 1;
            } else {
                upperIndex = currentIndex - 1;
            }
        }
    }
}