package javapackages.conditionalStatement;

public class GreaterNumber2 {


    //2. Write a Java function and take three int parameters and prints the greatest number.



    public void printGreater(int x, int y, int z) {
        if ((x > y) &&(y>z) ){
            System.out.println(x + " is the greater number");
        }
        else if ((y > x)&&(y>z)) {
            System.out.println(y + " is the greater number");
        }
        else if((z>x)&&(z>y)){
            System.out.println(z+ " is the greater number");{
            }

        }


    }

    public static void main(String[] args) {
        GreaterNumber2 obj= new GreaterNumber2();
        obj.printGreater(22,23,24);
    }
}
