package javapackages.oop.polymorphismDemo;

public class OverloadingDemo {

//method overloading can be achieved by the same method name but
    // i. different number of parameter
    //ii. different data type
    //iii. different order of parameter

    // overloading is called compile time polymorphism

    public void add( int a, int b)  {
        System.out.println(a+b);
 }

    public void add(int a, int b, int c){
        System.out.println(a+b+c);
    }

    public void add( int a, float b){
        System.out.println(a+b);
    }

    public void add( float b, int a ){
        System.out.println(a+b);
    }


    public static void main(String[] args) {
        OverloadingDemo obj= new OverloadingDemo();
        obj.add(2,3);
        obj.add(2,3,5);
        obj.add(2, 5.45f);
        obj.add(5.45f, 4);
    }
}
