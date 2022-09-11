/** Ephrem Kidane
 * Lab 3 Question 3
 * Sum of sorted arrays of 0s and 1s using recursion
 * Time complexty - O(n)
 */
public class Lab3_Sum {
    int sum =0;
    private int sumOfInt(int [] arr, int lower, int upper){
        if(lower>upper)
            return 0;

        int mid =(lower+upper)/2;

        if(arr[mid]==1){
            sum++;
        }
        sumOfInt(arr,lower,mid-1);
        sumOfInt(arr,mid+1,upper);

        return sum;
    }
    public int sumOfInt(int [] arr){
        return sumOfInt(arr,0,arr.length-1);
    }

    public static void main(String[] args) {
        int [] y = {0,0,0,0,1,1,1,1,1,1};
        Lab3_Sum test = new Lab3_Sum();
        System.out.println(test.sumOfInt(y));
    }
}
