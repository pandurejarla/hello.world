package com.training.javacourse;

public class StringTest {
    public static void main(String[] args) {
        //string object
        String str1=new String("pandu");
        //string literal
        String str2="Pandu";
        String str3="    chandu   ";
        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println(str1.length());
        System.out.println(str2.length());
        System.out.println(str1.charAt(3));
        System.out.println(str2.charAt(2));
        System.out.println(str1.indexOf('n'));
        System.out.println(str3.trim());

    }
}
