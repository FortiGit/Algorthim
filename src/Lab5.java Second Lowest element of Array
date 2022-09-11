import java.util.Arrays;

/** Ephrem Kidane    ID#112580      Lab 5
 * This program take any unsorted array and return the second smallest element of array
 */
public class Lab5 {
    /** This is the main sorted method
     * @param array take unsorted array
     * @return the sorted array
     */
    private String quickSort(int[] array) {
        String arr= Arrays.toString(quickSort(array, 0, array.length - 1));
        return arr;
    }

    /**
     * This is overloaded method to help the main quick sort method
     * @param array take unsorted array
     * @param start first index of the unsorted array
     * @param end last index of the unsorted array
     * @return sorted array by recursively calling itself
     */
    private int [] quickSort(int[] array, int start, int end) {
        if (start >= end)
            return null;

        int boundary = partition(array, start, end);

        quickSort(array, start, boundary - 1);
        quickSort(array, boundary + 1, end);

        return array;
    }

    /**
     * This is helper method for quick sort helper
     * @param array input unsorted array
     * @param start first index of unsorted array
     * @param end last index of unsorted array
     * @return the correct position of pivot after it is moved to its correct position
     */
    private int partition(int[] array, int start, int end) {
        int pivot = array[end];
        int boundary = start - 1;
        for (int i = start; i <= end; i++)
            if (array[i] <= pivot)
                swap(array, i, ++boundary);

        return boundary;
    }

    /**
     * This helper method for partition method
     * @param array input any array and swap the element of array at given index
     * @param i position 1
     * @param j position 2
     */
    private void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    /**
     * This method return the  second smallest element of array by using helper method
     * @param arr  unsorted array
     * @return first sort the array using quick sort method and then return the second lowest element
     * which element at index 1
     */
    public int secondLowet(int [] arr){
        quickSort(arr);

        return arr[1];
    }

    public static void main(String[] args) {
        Lab5 test = new Lab5();
        int [] arr = {10,9,8,7,6,6,3,4,5,2,1};
        System.out.println(test.secondLowet(arr));
    }

}
