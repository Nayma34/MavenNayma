package javapackages.parameterization;

public class ParameterDemo {
    // parameterization is a part of method signature



    public void play (String game) {
        System.out.println(game);
    }

    public static void main(String[] args) {
        ParameterDemo Mike= new ParameterDemo(); // object of the class
        Mike.play("Football"); // argument

        ParameterDemo Nancy= new ParameterDemo();
        Nancy.play("Basketball");// argument

        ParameterDemo Mark= new ParameterDemo();
        Mark.play(" Hockey"); // argument



    }


    }

