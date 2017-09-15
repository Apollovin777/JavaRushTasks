package com.javarush.task.task15.task1531;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;

/* 
Факториал
*/

public class Solution {
    public static void main(String args[]){
        long a, b, c;
        BigInteger d, e, f;
        a = 9223372036854775807l;
        b = a;
        c = a * b;

        d = BigInteger.valueOf(a);
        e = BigInteger.valueOf(b);
        f = d.multiply(e);

        System.out.println("(long)       " + a + " * " + b + " = " + c);
        System.out.println("(BigInteger) " + d.toString() + " * " + e.toString() + " = " + f.toString());
    }
}
