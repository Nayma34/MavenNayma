package javapackages.accessModifier;

public class Access1 {

 public int hours= 24; // is accessbile througout the project
 private int minutes= 60;// is accessbile only its own class
 String day="Tuesday"; // no access modifier is accessible within the package
 protected int year= 365; //it can be used in other package but need inheritance


    public static void main(String[] args) {
        Access1 obj= new Access1();
        System.out.println(obj.hours);
        System.out.println(obj.minutes);
        System.out.println(obj.day);
        System.out.println(obj.year);
    }

    public void printHours(){
        System.out.println(" this is a public method");
    }

    private void printMintues(){
        System.out.println(" this is a private method");
    }
    void printDay(){
        System.out.println(" this is package private access modifiers");
    }

    protected void printYear(){
        System.out.println(" this is a protected method");
    }
}
