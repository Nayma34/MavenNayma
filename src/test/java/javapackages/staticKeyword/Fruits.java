package javapackages.staticKeyword;

public class Fruits {

    //instance variables
    /*
    class-- Fruits-- name, color, size, vitamin--- properties
    objects-- Banana, Apple, Mango, Avocado, Grape, Orange

    Class-- Vegetables-- name, color, size, vitamin, nutrition, price---properties
    Objects-- Tomato, Cucumber, Potato, Carrots, Cabbage

    class-- Cats-- size, color, tail, eyes--- properties
    objects-- myCat, yourCat, Nayma'Cat, Rafi's cat

    CLASS- UprightStudents-- name, id,group, batch--- properties
    objects-- Nayma, Rafi, Nancy, Mike, Mark


     */
 //variable has three parts---
    //i. declare the variable
    // ii. initialize the variable
    // iii. use the variable
String name; //instance variable/ properties // declaring the variable
  String color; //  declaring the variable
 static String size= "Small"; //static variables and methods belongs to class not objects, class level variables// declaring the variable
char vitamin; // declaring the variable
// when we see the value of a variables are common to all objects.

    public static void hello() {
        String location= "USA"; //LOCAL VARIABLE // declare on initialize
        System.out.println(location); // use the variable
    }

    public void price(int amount){
        System.out.println(amount);
    }

    public static void main(String[] args) {
        Fruits banana= new Fruits(); //created an object of the class, that means i instantiated the class
        banana. name= "Banana"; // banana is a reference variable or object, initializing/defining the variable
        banana.color= "Yellow";//initializing/defining the variable
        size= "Small"; //initializing/defining the variable
        banana.vitamin= 'C'; //initializing/defining the variable

      System.out.println(banana.name); // using the variable
      System.out.println(banana.color);  //using the variable
      System.out.println(banana.vitamin); //  using the variable
      System.out.println(size);
        hello(); // calling the method
        banana.price(20);
      System.out.println("-------------------");


     Fruits mango= new Fruits();//created an object of the class, that means i instantiated the class.
        mango.name="Mango"; //initializing/defining the variable
        mango.color= "Red";// initializing/defining the variable
       size=  "Small"; // initializing/defining the variable
        mango.vitamin= 'D'; // initializing/defining the variable


        System.out.println(mango.name); //  using the variable
        System.out.println(mango.color); //  using the variable
        System.out.println(mango.vitamin); //  using the variable
        System.out.println(size);

        hello (); // calling the method
        mango.price(30);
        System.out.println("-------------------");

        Fruits apple= new Fruits (); //created an object of the class, that means i instantiated the class.
        apple. name= "Apple"; // initializing/defining the variable
        apple.color= "Green"; // initializing/defining the variable
        size= "Small"; // initializing/defining the variable
        apple.vitamin= 'E'; // initializing/defining the variable

        System.out.println(apple.name);  //using the variable
        System.out.println(apple.color); //  using the variable
        System.out.println(apple.vitamin); //  using the variable
        System.out.println(size);

        hello (); // calling the method
        apple.price(40);
        System.out.println("-------------------");


    }











}
