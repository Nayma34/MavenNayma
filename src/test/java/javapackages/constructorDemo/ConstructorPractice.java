package javapackages.constructorDemo;

public class ConstructorPractice {
    //constructor is a special method that has the same name as class

   public String name;
    public int id;
   public int batch;


   public String location;


        public ConstructorPractice(String name, int id, int batch){
           this.name =name;
            this.id=id;
            this.batch=batch;


        }

        public ConstructorPractice(String location){this.location=location;}

    public static void main(String[] args) {
        ConstructorPractice obj1= new ConstructorPractice("Sumaia",101,1);
//        obj1.name= "Sumaia";
//        obj1.id= 101;
//        obj1.batch= 1;


        System.out.println(obj1.name);
        System.out.println(obj1.id);
        System.out.println(obj1.batch);
        System.out.println("----------------------------------");


        ConstructorPractice obj2= new ConstructorPractice("Thania",102,2);
//        obj2.name= "Thania";
//        obj2.id= 102;
//        obj2.batch= 2;


        System.out.println(obj2.name);
        System.out.println(obj2.id);
        System.out.println(obj2.batch);
        System.out.println("----------------------------------");

        ConstructorPractice obj3= new ConstructorPractice("Fabiha",103,3);
//        obj3.name= "Fabiha";
//        obj3.id= 103;
//        obj3.batch= 3;



        System.out.println(obj3.name);
        System.out.println(obj3.id);
        System.out.println(obj3.batch);

        ConstructorPractice obj4= new ConstructorPractice("NewYork");
        System.out.println(obj4.location);
    }
}
