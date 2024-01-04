package javapackages.stringFunction;

public class StringFunctionDemo {

    public void stringFunction1(){
        String obj= new String("Nayma");
        char firstletter= obj.charAt(0);
        System.out.println(firstletter);
        int length= obj.length();
        System.out.println(length);
        String lower= obj.toLowerCase();
        System.out.println(lower);

        String upper= obj.toUpperCase();
        System.out.println(upper);

        String newSpelling= obj.replace('y','i' );
        System.out.println(newSpelling);

        String fullName= obj.concat(" Khanam");
        System.out.println(fullName);

        String[]twoNames= fullName.split(" ");
        System.out.println(twoNames[0]);
        System.out.println(twoNames[1]);
    }
public static void stringFunction2(){
        String firstString= "I want to go to Turkey and visit the mosques";
        firstString.toUpperCase();
        firstString.toLowerCase();
        firstString.length();
        char firstletter= firstString.charAt(0);
    System.out.println(firstletter);
    String oneWord= firstString.substring(10,12); //substring starts with 0, ends with index +1
    System.out.println(oneWord);

    boolean javaword= firstString.contains("Turkey");
    System.out.println(javaword);

    String[]words= firstString.split(" ");
    System.out.println(words.length);
    }
    public static void reverseString(){
        String name= "Nayma";
        char firstLetter= name.charAt(4);

        for(int i=name.length()-1;i>=0;i--){
            System.out.print(name.charAt(i));

        }
    }
public static void reverseString2(){
        String name= "Nayma";
        String reverse= "";

        for (int i= name.length()-1; i>=0;i--){
            reverse= reverse+name.charAt(i);
    }
    System.out.println(reverse);

}
    public static void palindrome(){
        String name= "madam";
        String reverse= "";
        for (int i= name.length()-1; i>=0;i--){
            reverse= reverse+name.charAt(i);
        }
        System.out.println(reverse);

        if (reverse.equals(name)){
            System.out.println("This is palindrome");
        }
        else{
            System.out.println(" this is not a palindrome");
        }
    }

    public static void stringToInt(){
       // int a= 200;
       // System.out.println(a+100);
        String dollar= "500";
        System.out.println(dollar+700);
       int newdollar= Integer.valueOf(dollar);
        System.out.println(newdollar+100);

    }
    public static void intToString(){
        int a= 500;
        System.out.println(a+400);

       String newAValue= String.valueOf(a);
        System.out.println(newAValue+400);


    }
    public static void StringBuffer(){
        StringBuffer sb= new StringBuffer("Selenium");
        sb.append(" Hard");
        System.out.println(sb);

        sb.insert(9,"is ");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
    }


    public static void main(String[] args) {
      //stringFunction2();
      //  reverseString();
       // reverseString2();
      //  palindrome();
        //stringToInt();
        //intToString();
        StringBuffer();
    }

    }

