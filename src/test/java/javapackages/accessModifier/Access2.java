package javapackages.accessModifier;

public class Access2 extends Access1{


    public static void main(String[] args) {
        Access1 obj= new Access1();
        System.out.println(obj.hours);
        //System.out.println(obj.minutes);
        System.out.println(obj.day);
        System.out.println(obj.year);
    }
}
