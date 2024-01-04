package javapackages.parameterization;

public class Mathmatics {

    public void add(int a, int b) {
        System.out.println(a+b);

    }

    public static void main(String[] args) {
        Mathmatics obj= new Mathmatics ();
        obj.add(5, 10);
        obj.add(10, 15);
        obj.add(30,40);
        obj.add(50,60);

        /*
        1.what is static in Java?
        - static keyword can be applied to variables and methods.
        this belongs to the class not to the instance, but this is common to all instances.

       2.  can we call a non- static variable in static method?
       - no
       3.  can a static method be called in non static method?
       -yes
       4. why is the main method static?
       - because compiler needs to call it without creating an object.
       another reason is in Java program compiler starts executing programs from main method.
       5. can static method or static variable be private?
       - Yes
        what is difference between static and constant?
        - constant is variable are fixed during compile time with value doesn't change in the runtime.
        But Static Variables can be changed in the run time.

         */



    }















}


