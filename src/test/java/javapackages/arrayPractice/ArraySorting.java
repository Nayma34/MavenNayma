package javapackages.arrayPractice;

import java.util.Arrays;

public class ArraySorting {
//
//    Write a program to Sort Numeric Array In Ascending Order
//    Array = {23, 5, 67, 20, 3, 30, 79, 3, 70, 2}

public void sorting(){
    int number[]={23, 5, 67, 20, 3, 30, 79, 3, 70, 2};

    Arrays.sort(number);
    for(int i=0;i<number.length;i++){
        System.out.println(number[i]);
    }
}

    public static void main(String[] args) {
        ArraySorting obj= new ArraySorting();
        obj.sorting();
    }

    public static class ArrayDemo {
    // array can hold multiple elements.
        //array length is fixed
        // we cannot add or remove any element later.
        String [] studentName= {"Asim", "John", "Nancy", "Reza"}; // Array data
        // studentName is array variable


        public void arr(){
            System.out.println(studentName.length);
            System.out.println(studentName[0]);
            System.out.println(studentName[1]);
            System.out.println(studentName[2]);
            System.out.println(studentName[3]);




        }

        public static void main(String[] args) {
            ArrayDemo obj= new ArrayDemo();
            obj.arr();

        }

    }
}
