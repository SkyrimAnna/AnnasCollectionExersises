package AnnasCollections;

import java.util.HashSet;
import java.util.Set;

public class Ex6 {

    public static void main(String[] args) {

        Set<String> weekDays = new HashSet<String>();

        weekDays.add("monday");
        weekDays.add("tuesday");
        weekDays.add("wednesday");
        weekDays.add("thursday");
        weekDays.add("friday");
        weekDays.add("saturday");
        weekDays.add("sunday");

        String [] strArr = new String[weekDays.size()];

        weekDays.toArray(strArr);

        for (String str: strArr){
            System.out.println(str);

        }







    }
}
