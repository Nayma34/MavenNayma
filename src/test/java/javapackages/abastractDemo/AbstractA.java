package javapackages.abastractDemo;

public abstract class AbstractA {

    // Abstract is a process when Hiding the implementation showing only functionality.
    // Abstract class cannot be instantiated.
    // Abstract class can be hold both abstract and non-abstract methods
    // Abstract class can be 0-100% abstraction.

    int cardNo;
    String customerName;
    int cVvNo;
    String billingAddress;
    int exp;

    public abstract void placeOrder();

    public abstract void emailMessage();

    public void cardInfo(){
        cardNo= 243567748;
        customerName="Nayma";
        cVvNo= 567;
        billingAddress="406 Sylavan ave";
        exp= 1228;




    }


    public static void main(String[] args) {

    }

}
