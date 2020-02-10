package com.aktepe.mucahit;

/*
    // M u c a h i t O n r Y s f e m
    // 1 4 1 2
    String str = "MucahitOnurYusufYasemin";

    getFrequencyOfChars(String str);
    --> Parametre olarak verilen stringin icinde gecen charlarin ne siklikla gectiklerini bana bildirsin.
    --> Char - Kac kere gectigi, Char - Kac kere gectigi
*/

import java.util.*;

public class FrequencyOfChars {

    public static int getSizeOfElement(char searched, String str) {
        int counter = 0;

        for (int i = 0; i < str.length(); i++) {
            if (searched == str.charAt(i)) {
                counter++;
            }
        }

        return counter;
    }

    // Normal Method
    public static void getFrequencyOfChars(String str) {
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = getSizeOfElement(ch, str);
            System.out.println(ch + " - " + count);
        }
    }

    // Set Method
    public static void getFrequencyOfCharsSet(String str) {
        /*
            Set vs List
            Set unique tutar, list her seyi tutar.
            Set sirali degildir, list siralidir.
        */
        Set<Character> set = new HashSet<>();

        for (int i = 0; i < str.length(); i++) {
            set.add(str.charAt(i));
        }

        for (Character ch : set) {
            int count = getSizeOfElement(ch, str);
            System.out.println(ch + " - " + count);
        }
    }

    // Map Method
    public static void getFrequencyOfCharsMap(String str) {
        Map<Character, Integer> map = new HashMap();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (map.containsKey(ch)) {
                int oldValue = map.get(ch);
                map.put(ch, oldValue+1);
            } else {
                map.put(ch, 1);
            }
        }

        for (Map.Entry<Character, Integer> item : map.entrySet()) {
            System.out.println(item.getKey() + " - " + item.getValue());
        }
    }

    public static void main(String[] args) {
        String str = "Mucahit Onur Yusuf Yasemin";

        String[] strArr = str.split(" ");
        for(String item : strArr) {
            System.out.println(item);
        }

//        getFrequencyOfCharsMap(str);
    }
}
