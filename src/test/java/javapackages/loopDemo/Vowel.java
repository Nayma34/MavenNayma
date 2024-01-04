package javapackages.loopDemo;

public class Vowel {

//    Write your name and check if there is/are any vowels there. If found print them


    public void vowelCheck(){
        String name= "Nayma";
        int lengthofName=name.length();
        System.out.println(lengthofName);

     char firstLetter=  name.charAt(0);
        System.out.println(firstLetter);

        for(int i=0;i<name.length();i++){
            if (name.charAt(i) == 'a'||name.charAt(i) =='e'||name.charAt(i) == 'i'
                ||name.charAt(i) == 'o'||name.charAt(i) == 'u'){
                System.out.println(name.charAt(i)+ " is vowel");
            }
        }
    }

    public static void main(String[] args) {
        Vowel obj= new Vowel();
        obj.vowelCheck();
    }
}
