package javapackages.conditionalStatement;

import java.util.Scanner;

public class IfElseStatement {

    static int age=13;
    public static void ifelse(){
      if(age ==10){
          System.out.println("age is 20");
      }
      else if(age ==15){
          System.out.println("age is 15");
      }
      else if (age==20){
          System.out.println("age is 20");
      }
      else{
          System.out.println("none of the above is true");
      }

    }
    //homework- get input from console age(int), regno(short), stockbalance(flaot)

    public void practice(){
        Scanner scan= new Scanner( System.in);
        System.out.println("Enter your number below:");
        int number= scan.nextInt();
        System.out.println("my number is " + number);

        int num= scan.nextInt();
        if (num==10){
            System.out.println("num is 10");
        } else if (num==15){
            System.out.println("num is 15");
        }else if (num ==20){
            System.out.println("num is 20");
        } else {
            System.out.println("none of the above is true");
        }


    // A school has following rules for grading system:
//        a. below 25- F
//        b. 25 to 45- E
//        c.45 TO 50- D
//        d. 50 TO 60- C
//        e. 60 TO 80- B
//        f. Above 80- A
//        ask user to enter marks and print the corresponding grade
        // ask user to enter any number and through your code you print the number.

    }



    /*
    //homework
    0. update the code with range for grade system.
    1. take two numbers from user and print the greater number.
    2. take a number from user find that the number is positive or negative
    example: 0,1,2,3 any number from 0 to up is positive, any number less than 0
      is negavtive -1,-2,-1.57896

    3. take a temparature as user input as Farenhiet....
    if it is 30-49 print cold
    if it is 50-69 print warm
    if it is 70-89....it is super hot
    */


    public static void main(String[] args) {
        IfElseStatement obj= new IfElseStatement();
        //obj.condition();
       // ifelse();
       // obj.practice();

    }


}
