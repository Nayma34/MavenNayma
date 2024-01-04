package javapackages.collections;

import java.util.ArrayList;

public class ArraylistDemo {

    //List is an Interface and ArrayList implements List
    //ArrayList is not fixed. it is dynamic.
    //ArrayList can hold duplicate value

    public void arrayListPractice(){

//        String name[]={"Mark","Nancy","John", "Mary"};
//        System.out.println(name.length);

        ArrayList<String>name= new ArrayList<>();
      boolean isEmptyOrNotBeforeAdd=  name.isEmpty();
        System.out.println(isEmptyOrNotBeforeAdd);

        name.add("Mark");
        name.add("Nancy");
        name.add("John");
        name.add("Mary");

        boolean isEmptyOrNotAfterAdd=  name.isEmpty();
        System.out.println(isEmptyOrNotAfterAdd);

        System.out.println(name);
        System.out.println(name.size());

        name.add("Sumaia");
        System.out.println(name);

        name.remove("Nancy");
        System.out.println(name);

        name.add(1,"Nancy");
        System.out.println(name);

        name.add("Alex");
        System.out.println(name);


        for(int i=0; i<name.size(); i ++) {
            System.out.println(name.get(i));
        }

    }

    public void arrayListPractice2(){
        ArrayList<Integer>number= new ArrayList<>(); // Integer is a wrapper class

        boolean isEmptybefore= number.isEmpty();
        System.out.println(isEmptybefore);


        number.add(50);
        number.add(60);
        number.add(70);
        number.add(80);
        number.add(80);
        number.add(90);



        boolean isEmptyAfter= number.isEmpty();
        System.out.println(isEmptyAfter);

       int size= number.size();
        System.out.println(" Size of the numberList is" + size);

        System.out.println(number);

      int thirdNumber= number.get(2);
        System.out.println(thirdNumber);


    }


    public static void main(String[] args) {
        ArraylistDemo obj= new ArraylistDemo();
       // obj.arrayListPractice();
        obj.arrayListPractice2();
    }


}
