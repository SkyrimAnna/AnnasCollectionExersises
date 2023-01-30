package AnnasCollections;

import java.util.ArrayList;
import java.util.List;

public class Ex4 {

    public static void main(String[] args) {

        ArrayList<String> weekDays = new ArrayList<String>() ;

        weekDays.add("monday");
        weekDays.add("tuesday");
        weekDays.add("wednesday");
        weekDays.add("thursday");
        weekDays.add("friday");
        weekDays.add("saturday");
        weekDays.add("sunday");


        System.out.println("sublist " + weekDays.subList(0,3));



    }
}
