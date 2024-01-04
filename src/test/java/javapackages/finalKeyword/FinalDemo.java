package finalKeyword;

public  class FinalDemo {
    // final keyword can be used before the class, methods and variables.
    // final class cannot be extended. this class cannot have any child.
    // final variable cannot be modified, the value is final.
    //final method cannot be overridden.
    //override is a part of oop concept

     final String Name= " Nayma";
// created by John
    public  void PrintName(){
        System.out.println(" printing name---John");
    }


    public static void main(String[] args) {
        FinalDemo obj= new FinalDemo();
        //obj.Name= " Nayma Khanam";
        System.out.println(obj.Name);
    }

}
