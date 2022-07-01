package week3.day2;


import java.util.Map;
import java.util.TreeMap;

public class FindNumbersOccurances {
    public static void main(String[] args) {
//        declare int array values
        int num[] = {2, 3, 5, 6, 3, 2, 1, 4, 2, 1, 6, -1};
//        Create empty Treemap with Integer key and values
        Map<Integer, Integer> occurance = new TreeMap<Integer,Integer>();
//       Check the length of the num array
        for (int i = 0; i < num.length; i++) {
//       Put the Condition to to check this key is already exist or not
            if (occurance.containsKey(num[i])) {
//       if true then increase the value by 1
                occurance.put(num[i], occurance.get(num[i]) + 1);

            } else {
//       Set the default value 1
                occurance.put(num[i], 1);
            }

        }
//      Print No of Occurance Values
        System.out.print("No Of Occurance :");
        System.out.println(occurance);
    }


}
