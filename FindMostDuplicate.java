package week3.day2;

import java.util.HashMap;
import java.util.Map;

public class FindMostDuplicate {
    public static void main(String[] args) {
        String str = "abbaba";
        char[] charArray = str.toCharArray();
// Create a map with key and value
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        int maximumValues = 0;
        char maximumOccurance = 0;
        //loop for put the values in the map for check characters length
        for (int i = 0; i < charArray.length; i++) {
            // Condition to verify the key is already exist in map or not
            if (map.containsKey(charArray[i])) {
                //get a charArray values to int intValue
                int intValue = map.get(charArray[i]);
                // if may contains the key already then increase the value by 1
                map.put(charArray[i], intValue + 1);
                // put the condition if the value is greater than the max value that we declared
                if (map.get(charArray[i]) > maximumValues) {
                    //Swapping the values if condition is true
                    maximumOccurance = charArray[i];
                    maximumValues = map.get(charArray[i]);
                }

            } else {
                //if map does not has the key already then put the value 1 by default
                map.put(charArray[i], 1);
            }

        }
        //Print the First max duplicate char and value
        System.out.println("maxOccurance character is :" + maximumOccurance + " " + "and maximum count is :" + maximumValues);

    }

}