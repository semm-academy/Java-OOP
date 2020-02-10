package com.aktepe.mucahit;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    /*
        Map
        --------
        HashMap
        SortedMap
     */

    /*
        HashMap
        WrapperClasses
        Exceptions
     */
    public static void main(String[] args) {
        Map<String, String> car = new HashMap();

        // key, value
        // primary key --> unique value
        // Map de listenin aksine degerlere erismek icin keyler kullanilir.

        car.put("Honda", "Accord");
        car.put("Opel", "Astra");
        car.put("Toyota", "Rav4");

//        System.out.println(car.get("Opel"));

        Map complexMap = new HashMap();
        complexMap.put(1, "String");
        complexMap.put("String", 900);
        complexMap.put(1.5, true);
        complexMap.put(false, 13L);

        List<String> list = new ArrayList();

//        for (Object entry : complexMap.entrySet()) {
//            System.out.println(entry);
//        }

        for (Map.Entry<String, String> item : car.entrySet()) {
            System.out.println(item.getValue());
        }
    }
}
