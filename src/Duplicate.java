import java.util.*;

/** Ephrem Kidane   ID# 112580
 * LAB 1 Question 5 b
 */
public class Duplicate {

    public List<Integer> removeDup(int [] arr){
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i <arr.length; i++) {
            map.put(arr[i],0);
        }
        List<Integer> result = new ArrayList<>(map.keySet());

       return result;
    }

    public static void main(String[] args) {
        int [] x ={1,2,3,4,4,4,4,5,5,6,6,7,7,7,};

       Duplicate lm = new Duplicate();
        System.out.println(lm.removeDup(x));
    }
}
