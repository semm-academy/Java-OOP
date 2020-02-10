package com.aktepe.mucahit;

import java.util.ArrayList;

public class Wrapper {
    public static void main(String[] args) {
//        int     Integer
//        char[]  String

//        long num = 9223372036854775807L;
//        double fl = 9223372036854775808F;

//        System.out.println(Integer.MAX_VALUE);
//        System.out.println(Long.MAX_VALUE);
//        System.out.println(Double.MAX_VALUE);

        // 1 byte = 8 bit
        // 8 byte
        // 64 bit
        // 111111111111111111111
        // 1x2^64 + 1x2^63 ...

        String str = "true";
        boolean num = Boolean.parseBoolean(str);
        System.out.println(num);
    }
}
