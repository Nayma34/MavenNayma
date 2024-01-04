package javapackages.conditionalStatement;

public class EvenOdd {

    // 4. Write a java function and take a int parameter and determine that the number is devided by 2 or not.
    // If devided by 2 that is even else the number is odd.

    public void evenoddNumber (int number) {

        if (number % 2 == 0) {
            System.out.println(number + " is an even number ");
        } else if (number % 2 == 1) {
            System.out.println(number + " is an odd number ");


        }
    }

    public static void main(String[] args) {
        EvenOdd obj= new EvenOdd();
        obj.evenoddNumber(2);
    }






}
