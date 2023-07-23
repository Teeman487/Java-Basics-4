package Exceptions;

public class ExceptionExample {
    public static void main(String[] args) {

        System.out.println("Program is started");
        System.out.println("Program is in progress");
        int a=100;
        int res= 0;
        try {
            System.out.println(a / 0); // Throw ArithmeticException
            //res = a/0;
        }
        catch (Exception e)
        {
            System.out.println("Entered in to catch block");
        }
        finally {
            System.out.println("ENTERED INTO FINALLY BLOCK");
        }
        System.out.println(res);



        String s =null;
       /* try {
            System.out.println(s.length()); // throws NullPointerException
        }
        catch (Exception e)
        {
            System.out.println("Entered in to catch block");
        }*/

    }
}
