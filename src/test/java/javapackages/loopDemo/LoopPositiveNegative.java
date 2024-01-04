package javapackages.loopDemo;

import java.util.Scanner;

public class LoopPositiveNegative {
    //write a function and create a loop between 1-10 and determine which number is positive and negative

    public void loop1() {
        for (int a = 1; a <= 10; a++) {
            System.out.println(a);
            if (a == 0) {
                System.out.println(a + " is a positive number");
            } else if (a > 0) {
                System.out.println(a + " is a positive number");
            } else if (a < 0) {
                System.out.println(a + " is a negative number");
            }
        }


    }

    public static void main(String[] args) {
        LoopPositiveNegative obj= new LoopPositiveNegative();
        obj.loop1();
    }


}