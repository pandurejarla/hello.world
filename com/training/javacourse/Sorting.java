
package com.training.javacourse;
import  java.util.*;
public class Sorting {
    public static void main(String[] args) {
        //sorting algorithm
        byte[] marks={98,100,56,45,66,77,99};
        System.out.println("marks is:");
        for(byte mark:marks){
            System.out.print(mark+" ");
        }
        System.out.println();
        //sorting

        for(byte i=0;i< marks.length;i++){
            for(int j=i+1;j< marks.length;j++){
                byte temp=0;
               if(marks[i]>marks[j]){
                   temp=marks[i];
                   marks[i]=marks[j];
                   marks[j]=temp;
               }
            }
        }

        System.out.println("after sorting");
        for(int i=0;i<marks.length;i++){
            System.out.print(marks[i]+" ");
        }
    }
}
