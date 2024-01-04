package javapackages.loopDemo;

public class Loopevennumber {

//    Consider an array of the following numbers:
//            25, 26, 28, 29,30, 35
//    Print the sum of even numbers only for the array element





    public void sumevennumbers() {
        int[]number={25,26,28,29,30,35};
        int sum = 0;
        for (int i = 0; i <6;i++) {
            if(number[i]%2 == 0) {
                System.out.println(number[i] + " is an even number");
                sum = sum + number[i];
            }
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        Loopevennumber obj= new Loopevennumber();
       obj.sumevennumbers();
    }
    }