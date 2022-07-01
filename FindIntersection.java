package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindIntersection {

    public static void main(String[] args) {
//Create 2 list and add a values
        List<Integer> str1 = new ArrayList<Integer>();
        Collections.addAll(str1, 3, 2, 11, 4, 6, 7);
        List<Integer> str2 = new ArrayList<Integer>();
        Collections.addAll(str2, 1, 2, 8, 4, 9, 7);
//Create an empty list
        List<Integer> intersection = new ArrayList<>();

        System.out.println(str1);
        System.out.println(str2);
//find the size of two list and check which one is common in both lists
        for (int i = 0; i < str1.size(); i++) {
            for (int j = i; j < str2.size(); j++) {
                if (str1.get(i) == str2.get(j)) {
                    intersection.add(str1.get(j));
                }

            }

        }
//        print the Intersection values
        System.out.println("Intersection value is:" + intersection);
    }
}
