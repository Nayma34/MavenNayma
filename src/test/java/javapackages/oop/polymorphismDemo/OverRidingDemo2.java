package javapackages.oop.polymorphismDemo;

public class OverRidingDemo2 extends OverRidingDemo1 {


    // parent class== super class
    // child class= subclass, derived class


    public void courseMember(int members) {

        System.out.println(members);
        String group = " Selenium";
        System.out.println(group);
    }


    public static void main(String[] args) {
        OverRidingDemo2 obj= new OverRidingDemo2();
        obj.courseMember(7);
        }
    }
