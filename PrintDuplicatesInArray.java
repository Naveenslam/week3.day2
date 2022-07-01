package week3.day2;

import java.util.*;

public class PrintDuplicatesInArray {
    public static void main(String[] args) {

//Create a List and addall values using Collections
        List<Integer> list = new ArrayList<Integer>();
        Collections.addAll(list, 14, 11, 15, 14, 18, 16, 17, 19, 18, 17, 20);
//Sort the list values
        Collections.sort(list);
//Use empty Hashset
        Set<Integer> dup = new HashSet<Integer>();

        for (Integer duplicates : list) {
//if we add the list values to Hashset and use if condition
            if (dup.add(duplicates) == false) {
//print the duplicates values
                System.out.println("duplicates values are :" + duplicates);
            }

        }


    }


}

