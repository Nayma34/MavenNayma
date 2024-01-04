package finalKeyword;

public class FinalDemo2 extends FinalDemo{
// created by Nancy

    @Override // annotation
    public void PrintName() {
       // System.out.println(" printing name");
        String anotherName= " Mike";
        String anotherName2= " Mark";
        System.out.println( anotherName+" + "+anotherName2);
        System.out.println(" Nancy");
    }

    public static void main(String[] args) {
        FinalDemo2 obj= new FinalDemo2();
        obj.PrintName();
    }
}
