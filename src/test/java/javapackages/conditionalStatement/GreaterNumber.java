package javapackages.conditionalStatement;

import java.util.Scanner;

public class GreaterNumber { //user defined class

    public void greaterNumber(){

Scanner scan= new Scanner(System.in); // pre defined class
int a = scan.nextInt();
        System.out.println("The first number is"+a);
 int b= scan.nextInt();
        System.out.println(" The second number is"+b);


if (a>b){
    System.out.println( a+ "is greater number");
}
else if (a==b) {
    System.out.println(a+ "is equal to" + b);
}
else {
    System.out.println(a+" is the smaller number");
}



    }


    public static void main(String[] args) {
        GreaterNumber obj= new GreaterNumber();
        obj.greaterNumber();

    }









}





