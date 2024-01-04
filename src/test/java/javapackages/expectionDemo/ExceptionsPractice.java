package javapackages.expectionDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionsPractice {

    // there are two types of exceptions
    // i. compile time exceptions.
    //a. interruptionException.
    //b. 10 Exception
    // ii. run time exceptions( logical exception)
    //a. ArrayIndexoutofBoundsException
    //b. StringIndexoutofBoundsException.
    //c. NumberFormatException.


    public void compileTimeException() throws InterruptedException, IOException {
        System.out.println(6+6);
        Thread.sleep(5000);
        System.out.println(4+4);
        System.out.println(8+9);

        FileInputStream fs= new FileInputStream("src/test/java/info.properties");
        int number= fs.available();
        System.out.println(number);
    }
     public void runtimeException(){
        String name[]={"Mark", "John", "Nancy"};
         System.out.println(name[1]);

         String location= "NewYork";
         char lastLetter= location.charAt(9);
        // int locationNumber= Integer.valueof(location);


     }
    public static void main(String[] args) throws InterruptedException, IOException {
        ExceptionsPractice obj= new ExceptionsPractice();
        //obj.compileTimeException();
        obj.runtimeException();
    }
}
