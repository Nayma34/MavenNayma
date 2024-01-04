package javapackages.conditionalStatement;

import java.util.Scanner;

public class Temperature {


    public void temperature(){
    Scanner scan= new Scanner(System.in);
    int temperature= scan.nextInt();

    if ((temperature==30)||(temperature<49)){
        System.out.println(" Temperature is cold");
    }
    else if ((temperature==49)||(temperature<69)){
        System.out.println(" Temperature is warm");
    }
    else if ((temperature==69)||(temperature<89)){
        System.out.println("Temperature is super hot");

        }

    }


    public static void main(String[] args) {
        Temperature obj= new Temperature();
        obj.temperature();

    }




}
