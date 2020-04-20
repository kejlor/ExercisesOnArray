package com.company;

public class Main {

    public static void main(String[] args) {
//        1. Napisz metodę, która zwróci tablicę String[] zawierającą pierwsze 5 liter alfabetu,

        String[] firstFiveLetters = new String[] {"a", "b", "c", "d", "e"};
        PrintingArray printingArray = new PrintingArray();
        printingArray.print(firstFiveLetters);

//        2. Napisz metodę pobierającą trójelementową tablicę liczb, która zwróci tablicę zawierającą te same elementy w odwróconej kolejności

        int[] threeElementarray = new int[]{3, 2, 1};
        BackwardArray backwardArray = new BackwardArray();
        backwardArray.printBackward(threeElementarray);
    }
}
