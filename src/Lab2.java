import java.util.*;

/** Ephrem Kidane   ID#112580
 * LAB 2
 */

public class Lab2 {
    /**
     * This program take two sorted arrays of different length as in put
     * @param arr1 first input array
     * @param arr2 second input array
     * @return  new array that is formed by merging the two array together in sorted order
     */
    public int [] merge(int [] arr1,int [] arr2){

         PriorityQueue<Integer> map = new PriorityQueue<>();
        int size = arr1.length + arr2.length;

        for (int k : arr1)
            map.add(k);

        for (int j : arr2)
            map.add(j);


        int [] result = new int[size];

        for(int i=0;i< result.length;i++){
            result[i] = map.poll();
        }

        return result;
    }

    public static void main(String[] args) {
        int [] arr1= {1, 4, 5, 8, 17};
        int [] arr2= {2, 4, 8, 11, 13, 21, 23, 25};

        Lab2 ne = new Lab2();
        System.out.println(Arrays.toString(ne.merge(arr1, arr2)));
    }
}
