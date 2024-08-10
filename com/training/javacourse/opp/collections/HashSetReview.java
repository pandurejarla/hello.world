package com.training.javacourse.opp.collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetReview {
    public static void main(String[] args) {
        HashSet<String> hashSet=new HashSet<String>();//it gives unorder list items
        hashSet.add("pandu");
        hashSet.add("mine");
        hashSet.add("chandu");
        hashSet.add("myself");
        hashSet.add("java");
        hashSet.add("python");
        hashSet.add("php");
        hashSet.add("html");
        hashSet.add("docker");
//        for(String str:hashSet){
//            System.out.println(str);
//        }
        Iterator<String> iterator= hashSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
