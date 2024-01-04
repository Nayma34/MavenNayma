package javapackages.loopDemo;

public class LoopAverage {

   // Take 5 numbers like 100,200,300,400,500 as an array and find the average of those number.

    public void averageNumber(){
        int []num= {100,200,300,400,500};
        int sum=0;
        for(int i =0;i<num.length;i++){
            //System.out.println(num[i]);
            sum=sum+num[i];
        }
        System.out.println(sum);
      float average=  sum/num.length;
        System.out.println(average);
    }


    public static void main(String[] args) {
        LoopAverage obj= new LoopAverage();
        obj.averageNumber();
    }






}

