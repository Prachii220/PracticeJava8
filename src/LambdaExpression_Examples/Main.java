package LambdaExpression_Examples;
//https://www.youtube.com/watch?v=tCwg16PUZyo&t=234s
/*
how to use functional interface
-- create seperate class and implements this interface: old way
-- annonymous class for implementing interface --
-- by using lambda expresion
 */

public class Main {

    public static void main(String[] args) {
         System.out.println("My system starts");

         //1st method
        // MyInterface myInterface = new MyInterfaceImpl();
         //myInterface.sayHello();

        // SECOND METHOD
      /*  MyInterface i1 = new MyInterface() {
            @Override
            public void sayHello() {
                System.out.println("HI, this is example of anonymous clas , 2nd method");
            }
        } ;
        i1.sayHello();*/

        // 3RD METHOD
        MyInterface i= () ->{System.out.println("HI I'm lambda expression");        };
        i.sayHello(); // interface call se ye chl gya

        /*SumInterface s = (a,b) -> {
            return a+b;
        };*/

        SumInterface s = (a,b) -> a+b;
        System.out.println("sum= "+ s.sum(3,4));
        System.out.println("sum= "+ s.sum(3,40));

        LengthString l =(str -> str.length());
        System.out.println("Length of the given string is: "+ l.getlength("Praveen is takla "));

    }
}
