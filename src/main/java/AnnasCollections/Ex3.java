package AnnasCollections;

import java.util.ArrayList;
import java.util.Iterator;

public class Ex3 {

    public static void main(String[] args) {

        ArrayList<String> weekDays = new ArrayList<String>() ;

        weekDays.add("monday");
        weekDays.add("tuesday");
        weekDays.add("wednesday");
        weekDays.add("thursday");
        weekDays.add("friday");
        weekDays.add("saturday");
        weekDays.add("sunday");


        String result = weekDays.remove (3);

        System.out.println(weekDays);

        // TODO: 2023-01-30 I dont understand what you mean to put thursday on the right side of the list.

    }
}
