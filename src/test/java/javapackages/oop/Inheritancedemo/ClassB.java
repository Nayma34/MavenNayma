package javapackages.oop.Inheritancedemo;

public class ClassB extends ClassA {

    public static void main(String[] args) {
      ClassB obj= new ClassB();
        System.out.println(obj.property1);
        System.out.println(obj.property2);
        System.out.println(obj.hasCar);

        obj.sellproperties();
    }



}

