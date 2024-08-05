package com.training.javacourse;

public class ArrayIntro {
    public static void main(String[] args) {
        int[] ids={1,2,3,4,5,6};
        //for each loop method
        for(int id:ids){
            System.out.println(id);
        }
        //normal type
        System.out.println("using normal for loop code");
        for(int index=0;index<ids.length;index++){
            System.out.println(ids[index]);
        }

    }
}
