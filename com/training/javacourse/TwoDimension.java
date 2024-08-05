package com.training.javacourse;

public class TwoDimension {
    public static void main(String[] args) {
        //two dimensional array
        int[][] twoD={
                {1,2,4},
                {3,5,6}
        };
        for(int[] oneD:twoD){
            for(int value:oneD){
                System.out.print(value+" ");
            }
            System.out.println();
        }
    }
}
