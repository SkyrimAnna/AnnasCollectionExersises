package AnnasCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Ex2 {

    public static void main(String[] args) {

        ArrayList<String> weekDays = new ArrayList<String>() ;

        weekDays.add("monday");
        weekDays.add("tuesday");
        weekDays.add("wednesday");
        weekDays.add("thursday");
        weekDays.add("friday");
        weekDays.add("saturday");
        weekDays.add("sunday");

        Iterator <String> iterator = weekDays.iterator();

        while (iterator.hasNext()) {
           String currentElement = iterator.next();

            System.out.println("iterator -> = " + currentElement);
        }



    }

}
