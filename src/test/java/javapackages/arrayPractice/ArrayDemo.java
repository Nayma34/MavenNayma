package javapackages.arrayPractice;


    public class ArrayDemo {
        // array can hold multiple elements.
        //array length is fixed
        // we cannot add or remove any element later.
        String [] studentName= {"Asim", "John", "Nancy", "Reza"}; // Array data
        // studentName is array variable


        public void arr(){
            System.out.println(studentName.length);
            System.out.println(studentName[0]);
            System.out.println(studentName[1]);
            System.out.println(studentName[2]);
            System.out.println(studentName[3]);




        }

        public static void main(String[] args) {
            ArrayDemo obj= new ArrayDemo();
            obj.arr();

        }

    }
