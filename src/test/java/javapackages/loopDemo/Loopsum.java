package javapackages.loopDemo;

public class Loopsum {

    //Write a program to find the sum of 20-30


    public void sumofNumbers(){
        int sum= 0;
        for(int a=20;a<=30;a++){
            sum=sum+a;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        Loopsum obj= new Loopsum();
        obj.sumofNumbers();
    }

}
