package javapackages.loopDemo;

import java.util.Scanner;

public class LoopExercise {


    public void whileloop() {
        int a=10;
        while (a<=50){
            System.out.println(a);
            a++;
        }
    }

    public void forloop() {
        for (int a = 1; a <= 10; a++) {
            System.out.println(a);

        }
        for (int a = 1; a >= 10; a--) {
            System.out.println(a);
        }
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        if (a == 0) {
            System.out.println(a + " is a positive number");
        } else if (a > 0) {
            System.out.println(a + " is a positive number");
        } else if (a < 0) {
            System.out.println(a + " is a negative number");

        }


    }

    public static void main(String[] args) {
        LoopExercise obj= new LoopExercise();
        obj.forloop();

    }

    //Write a function that and create a loop between 1-10.
    // And determine which number is positive and which number is negative.

    //Write a java function and create an array in 4, 5, 6, 7, 8, 9, 10 and use a loop and determine that which number
    // is divided by 2 or not.If divided by 2 that is even else the number is odd.


    }

    //Write a function and create a loop inside it from 20-50 and find which number is divisible by 7.
    //use for loop





