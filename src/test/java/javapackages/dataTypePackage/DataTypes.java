package dataTypePackage;

public class DataTypes {
    //Class can hold Variables and methods


   // String name= "Nayma"; // variable.... name, value= Nayma, Dara type= String
   // int age= 100; // variable= age, value= 100, data type= int(integar---number)

   // String group= "Evening";
    // int bach= 7;
    // there are two type of methods
    //i. main method-- very special--coming from java--all commands come form here
    //ii. custom method-- creating by us---for particular groups of code

    public static void main(String[] args) { // main method used for commands

//    There are many type of date
//   i. byte: Stores whole numbers from -128 to 127
//   ii. short: stores whole numbers from -32,768 to 32,767
//   iii.int:Stores whole numbers from -2,147,483,648 to 2,147,483,647
//   iv. long:Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
//   v. float: Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
//   vi. double: Stores fractional numbers. Sufficient for storing 15 decimal digits
//   vii.boolean: Stores true or false values
//   viii. char: Stores a single character/letter or ASCII values



       // String name= "Nayma"; // variable.... name, value= Nayma, Dara type= String
      //  int age= 100; // variable= age, value= 100, data type= int(integar---number)

       // System.out.println(name); // console--- output-- result
       // System.out.println(age);
        String name= "Nayma is a student of batch 7";
        byte age= 100;
        short CheckingAccount= 32767;
        int savings= 2147483647;
        long regNum= 9223372036854775807L;
        float height= 5.533434f;
        double stock= 5435.20244759386593740373094;
        boolean snooringIntheclass= true;
        char MiddleInitial= 'M';


        System.out.println(age);
        System.out.println("The Checking account balance is " + CheckingAccount); // +Meaning concatenation
        System.out.println(savings + " dollar is the amount in my saving accout");
        System.out.println(regNum);
        System.out.println(height);
        System.out.println(stock);
        System.out.println(snooringIntheclass);
        System.out.println(MiddleInitial);






    }







}