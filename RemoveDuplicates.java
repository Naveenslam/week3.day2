package week3.day2;

import com.sun.source.tree.Tree;

import java.sql.Array;
import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
//create String name text and declare values
        String text = "We learn java basics as part of java sessions in java week1";
//split the values using  array
        String[] split=text.split(" ");
//Create list and use splited value in the arrays.aslist method
        List<String> duplicate = new ArrayList<String>(Arrays.asList(split));
        System.out.println("Before RemoveDuplicates : "+ duplicate);
//Create Empty LinkedHashset method and add the input values
        Set<String>removeDuplicates=new LinkedHashSet<>(duplicate);
//After removing the duplicates values print the values
        System.out.println("After RemoveDuplicates :"+removeDuplicates);
    }
}
