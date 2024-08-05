package com.training.javacourse;

public class jagged {
    public static void main(String[] args) {
        //jagged array
        /* In this array we specifies the row size and not specifies the cols size*/
        byte[][] rowArrange={
                {1,2,3,4},
                {5,6,7},{8,9,10,11,8,55,127}
        };
      for(byte[] oneD:rowArrange){
          for(byte value:oneD){
              System.out.print(value+"  ");
          }
          System.out.println(" ");
      }
    }
}
