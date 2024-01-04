package javapackages.loopDemo;

public class Loopalphabets {
   // Write a program to print all alphabets from a to z.
   // Write your name and check if there is/are any vowels there. If found print them.

  public void alphabets(){

      for (char a = 'A'; a <= 'Z'; a++){
          System.out.println(a);

      }
    }


    public static void main(String[] args) {
    Loopalphabets obj= new Loopalphabets();
    obj.alphabets();
    }


}
