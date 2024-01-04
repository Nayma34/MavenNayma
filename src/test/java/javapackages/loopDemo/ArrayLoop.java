package javapackages.loopDemo;

public class ArrayLoop {
    //write a java function and create an array in 4,5,6,7,8,9,10 and use loop
    //and determine that which number is divide by 2 or not, if divided by 2 that is even else odd number
 int[] number={4,5,6,7,8,9,10};

 public void Array(){
     System.out.println( number.length + " this is Array length");
     for(int i=0;i<=6;i++){
         //System.out.println(i);
         if(number[i]%2==0){
             System.out.println(number[i] + "is an Even Number");
         }
         else if(number[i]%2==1){
             System.out.println(number[i] + "is an Odd Number");
         }
     }



 }

    public static void main(String[] args) {
       ArrayLoop obj= new ArrayLoop();
       obj.Array();
    }











}
