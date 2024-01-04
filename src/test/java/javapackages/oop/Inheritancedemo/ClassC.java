package javapackages.oop.Inheritancedemo;

import javax.management.MBeanAttributeInfo;

public class ClassC extends ClassB {


    public static void main(String[] args) {
        ClassC obj= new ClassC();
        System.out.println(obj.hasCar);
        System.out.println(obj.property1);
        System.out.println(obj.property2);
        obj.sellproperties();
    }

}
