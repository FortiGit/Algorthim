import java.lang.reflect.Array;
import java.util.Arrays;

/** Ephrem Kidane     ID# 112580
 * Lab 3 Question 1 and 2.
 * Question 1- will take integer array and find the sum of element of array in recursive
 * Question 2- will take integer array and return the max among the element of array
 * Time complexty - for Q1      O(1)
 *                 - for Q 2   O(n)
 */
public class Lab3 {

    public static void main(String[] args) {
        int [] x ={90,2,3,40,6,7,8,91};
        int [] y = {0,0,0,0,1,1,1,1,1};
        Lab3 test = new Lab3();
        //System.out.println(test.sum(x));
        System.out.println(test.findMax(x));

    }

    /** Question #1
     * @param arr will take integer array
     * @return perform the sum of element of array in recursive
     */
    private  int sum(int[] arr,int i) {
        if(i== arr.length)
            return 0;
        return arr[i++]+sum(arr,i);

    }
    public  int sum(int [] arr){
        return sum(arr,0);
    }


    static int max =0;

    /** Question #2
     * @param arr will take integer array
     * @return the max among the element of array
     */
    private int findMax(int [] arr, int i) {

        if (arr.length==i)
            return 0;

      if(max<arr[i])
          max=arr[i];
        findMax(arr,i+1);

        return max;
    }
    public int findMax(int [] arr){
        return findMax(arr,0);
    }


}
