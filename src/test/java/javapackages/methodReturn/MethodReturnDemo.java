package javapackages.methodReturn;

import javapackages.constructorDemo.ConstructorPractice;

public class MethodReturnDemo {

   public void location() {
       System.out.println("Hello");
   }
    public String location1(){
      String location="Texas";
       return "Hello";

 }
    public int zipCode(){
      int myZip= 10473;
      return myZip;


    }




    public static void main(String[] args) {
        MethodReturnDemo obj= new MethodReturnDemo();
        obj.location();

        System.out.println(obj.location1());
        int myZipfromClass= obj.zipCode();
        System.out.println(obj.zipCode());


        ConstructorPractice obj1= new ConstructorPractice("Nayma",104,6);
        String newName= obj1.name;
        System.out.println(obj1.id);
        System.out.println(obj1.batch);

        ConstructorPractice obj3= new ConstructorPractice("NewYork");

    }






}
