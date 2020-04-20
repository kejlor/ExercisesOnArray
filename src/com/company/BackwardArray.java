package com.company;

public class BackwardArray {

    public void printBackward(int[] array){
        for (int i = array.length - 1; i >= 0; i--){
            System.out.println(array[i]);
        }
    }

}
