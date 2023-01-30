package AnnasCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Ex7 {

    public static void main(String[] args) {

        Set<String> skyrim = new HashSet<String>();

        skyrim.add("grimsewer");
        skyrim.add("dawnbreaker");
        skyrim.add("chillrend");
        skyrim.add("angisBow");
        skyrim.add("nightingaleBlade");
        skyrim.add("zephyr");

        ArrayList arrayList = new ArrayList(skyrim);




        Collections.sort(arrayList);

        System.out.println(skyrim);


        /*String [] strArr = new String[skyrim.size()];

        skyrim.toArray(strArr);

        Collections.sort(strArr);

        for (String str: strArr){
            System.out.println(str);

        }*/



    }
}
